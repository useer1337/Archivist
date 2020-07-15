package com.example.Archivist.dto;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * Это класс обертка над классом {@link MoDTO}.
 * Нужен потому что в rest ответе отправляется не список на прямую,
 * а обьект содержащий список.
 */
@Data
public class MoList {
    private List<MoDTO> moList = new ArrayList<>();
    public void add(MoDTO moDTO){
        moList.add(moDTO);
    }
}