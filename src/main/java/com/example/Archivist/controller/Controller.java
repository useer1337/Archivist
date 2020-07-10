package com.example.Archivist.controller;

import com.example.Archivist.dto.UserDTO;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

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
}
