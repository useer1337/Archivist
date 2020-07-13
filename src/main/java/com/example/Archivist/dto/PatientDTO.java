package com.example.Archivist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class PatientDTO {
    private String lastName;
    private String firstName;
    private String middleName;
    private String snils;
    private String enp;
    private LocalDate birthDate;
}
