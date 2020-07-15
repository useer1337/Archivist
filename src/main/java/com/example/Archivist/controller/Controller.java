package com.example.Archivist.controller;

import com.example.Archivist.config.ApplicationConfiguration;
import com.example.Archivist.dto.MoDTO;
import com.example.Archivist.dto.MoList;
import com.example.Archivist.dto.PatientList;
import com.example.Archivist.dto.UserDTO;
import com.example.Archivist.jpa.models.PatientData;
import com.example.Archivist.jpa.repositories.PatientDataRepository;
import com.example.Archivist.jpa.repositories.RefMoRepository;
import com.example.Archivist.soap.UserClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hostco.reguser.types.GetUserRequest;
import ru.hostco.reguser.types.GetUserResponse;

import java.time.OffsetDateTime;

@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class Controller {
    private final UserClient userClient;
    private final ApplicationConfiguration applicationConfiguration;
    private final RefMoRepository refMoRepository;
    private final PatientDataRepository patientDataRepository;
    private final ImkClient imkClient;

    /**
    * Возвращяет данные о пользователе по его снилс используя Soap запрос на другой сервер.
    */
    @GetMapping("/user")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<UserDTO> getUser(@RequestParam(value = "snils") String snils) {
        GetUserRequest requets = new GetUserRequest();
        requets.setSNILS(snils);
        requets.setToken(applicationConfiguration.getSoapToken());
        GetUserResponse response = (GetUserResponse) userClient.callWebService(
                applicationConfiguration.getSoapUrl(),
                requets);
        if (response.getLogin().getSNILS() == null)
            return null;

        UserDTO userDTO = new UserDTO(
                Long.parseLong(response.getLogin().getSNILS()),
                response.getLogin().getFirstname(),
                response.getLogin().getMiddlename(),
                response.getLogin().getLastname());

        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    /**
     * Возвращяет список медецинских организаций, который берет из бд.
     */
    @GetMapping("/mo")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<MoList> getMo() {
        MoList moList = new MoList();
        refMoRepository.findAllMo().stream()
                .forEach(s -> moList.add(new MoDTO(s.getOid(), s.getNameshort(), s.getIsShown())));

        if (moList.getMoList().size() == 0)
            return null;
        return new ResponseEntity<>(moList, HttpStatus.OK);
    }

    /**
     * Принимает статус отправки вместе с данными полученными из формы и сохраняет в бд.
     * @param patientData - сущность "данные о поциенте"(как раз те данные которые мы получаем)
     */
    @PostMapping("/data")
    public void addData(@RequestBody PatientData patientData) {
        patientData.setDateInsert(OffsetDateTime.now());
        patientDataRepository.save(patientData);
    }

    /**
     * Ищет поциента оп снилс или фамилии используя rest запрос на другой сервер.
     */
    @GetMapping("/iemk")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<PatientList> getPatients(
            @RequestParam(value = "patientSnils", required = false) String patientSnils,
            @RequestParam(value = "patientLastName", required = false) String patientLastName) {
        final PatientList patientList = imkClient.getPatient(patientSnils, patientLastName);
        if (patientList.getPatientList().size() == 0)
            return null;
        return new ResponseEntity<>(patientList, HttpStatus.OK);
    }
}
