package com.example.examenblancspring.Repo;

import com.example.examenblancspring.Entities.Medecin;
import com.example.examenblancspring.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
}
