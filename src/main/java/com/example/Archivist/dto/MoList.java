package com.example.Archivist.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MoList {

    private List<MoDTO> moList = new ArrayList<>();
    public void add(MoDTO moDTO){
        moList.add(moDTO);
    }
}