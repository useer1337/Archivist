package com.example.Archivist.repository;

import com.example.Archivist.dto.MoDTO;
import com.example.Archivist.dto.MoList;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MoRepository{

    MoList moList = new MoList();

    public MoRepository() {
        moList.add(new MoDTO("ГКУЗС \"ДОМ РЕБЕНКА\"", "'1.2.643.5.1.13.13.12.2.92.9618'",
                true));

        moList.add(new MoDTO("ГКУЗС \"ДОМ ВЗРОСЛОГО\"", "'1.2.643.5.1.13.14.13.3.93.9718'",
                true));

        moList.add(new MoDTO("ГКУЗС \"ДОМ ПОЖИЛОГО\"", "'1.54.54.54.54.54.54.54.54.54.54'",
                true));
    }

    public MoList getMoList(){
        return moList;
    }
}
