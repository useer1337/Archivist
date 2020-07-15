package com.example.Archivist.jpa.repositories;

import com.example.Archivist.jpa.models.PatientData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDataRepository extends JpaRepository<PatientData, Integer>{
}