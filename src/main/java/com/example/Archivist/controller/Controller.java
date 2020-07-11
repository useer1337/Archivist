package com.example.Archivist.controller;

import com.example.Archivist.dto.MoDTO;
import com.example.Archivist.dto.MoList;
import com.example.Archivist.dto.UserDTO;
import com.example.Archivist.jpa.repositories.RefMoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class Controller {

    private final RefMoRepository refMoRepository;
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
}
