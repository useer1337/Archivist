package com.example.Archivist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

/**
 * Это класс обертка над классом {@link PatientDTO}.
 * Нужен потому что rest запрос не возвращяет список на прямую,
 * а возвращяет обьект содержащий список.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientList {
    private List<PatientDTO> patientList = new ArrayList<>();
}
