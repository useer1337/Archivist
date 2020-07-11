package com.example.Archivist.controller;

import com.example.Archivist.dto.MoDTO;
import com.example.Archivist.dto.MoList;
import com.example.Archivist.dto.UserDTO;
import com.example.Archivist.repository.MoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private MoRepository moRepository;

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
        MoList moList = moRepository.getMoList();

        return new ResponseEntity<>(moList,HttpStatus.OK);
    }
}
