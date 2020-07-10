package com.example.Archivist.controller;

import com.example.Archivist.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUser(@RequestParam(value = "snils", defaultValue = "16067057157") String snils){

        //if (snils == "16067057157")
        return new UserDTO(HttpStatus.OK, 2233, "Евлампий", "Сидорович", "Иванов");
        //return null;
    }
}
