package com.example.Archivist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MoDTO {
    private String shortName;
    private String codeMo;
    private Boolean isShown;
}
