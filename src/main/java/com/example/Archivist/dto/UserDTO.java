package com.example.Archivist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class UserDTO {

    private HttpStatus httpStatus;

    private int userId;
    private String firstName;
    private String middleName;
    private String lastName;
}
