package com.example.Archivist.dto;

import com.example.Archivist.jpa.models.RefMo;
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