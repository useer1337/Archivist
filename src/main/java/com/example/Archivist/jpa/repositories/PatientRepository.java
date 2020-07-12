package com.example.Archivist.jpa.repositories;

import com.example.Archivist.jpa.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}