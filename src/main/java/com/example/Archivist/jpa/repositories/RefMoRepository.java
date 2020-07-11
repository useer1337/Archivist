package com.example.Archivist.jpa.repositories;

import com.example.Archivist.jpa.models.RefMo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.math.BigDecimal;
import java.util.List;

public interface RefMoRepository extends JpaRepository<RefMo, BigDecimal>{
    @Query(
            value = "select * \n" +
                    "from archivist.ref_mo u\n" +
                    "where u.version = (SELECT max(version) from archivist.ref_mo)\n" +
                    "and u.is_shown = true",
            nativeQuery = true)           
    List<RefMo> findAllMo();
}