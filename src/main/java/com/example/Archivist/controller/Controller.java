package com.example.Archivist.controller;

import com.example.Archivist.dto.MoDTO;
import com.example.Archivist.dto.MoList;
import com.example.Archivist.dto.UserDTO;
import com.example.Archivist.jpa.models.Patient;
import com.example.Archivist.jpa.repositories.PatientRepository;
import com.example.Archivist.jpa.repositories.RefMoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class Controller {

    private final RefMoRepository refMoRepository;
    private final PatientRepository patientRepository;
    private final String snils = "16067057157";

    @GetMapping("/user")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<UserDTO> getUser(@RequestParam(value = "snils") String snils){
        if (this.snils.equals(snils)){
            UserDTO userDTO = new UserDTO(2233, "Евлампий", "Сидорович", "Иванов");
            return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
        }
        return null;
    }

    @GetMapping("/mo")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<MoList> getMo(){
        MoList moList = new MoList();
        refMoRepository.findAllMo().stream()
                .forEach(s ->moList.add(new MoDTO(s.getOid(), s.getNameshort(), s.getIsShown())));

        return new ResponseEntity<>(moList,HttpStatus.OK);
    }

    @PostMapping("/data")
    public void addData(@RequestBody Patient patient){
        patient.setDateInsert(OffsetDateTime.now());
        patientRepository.save(patient);
    }




}
