package com.example.Archivist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    private long userId;
    private String firstName;
    private String middleName;
    private String lastName;
}
