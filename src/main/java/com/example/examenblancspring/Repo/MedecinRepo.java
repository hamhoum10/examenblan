package com.example.examenblancspring.Repo;

import com.example.examenblancspring.Entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepo extends JpaRepository<Medecin,Long> {
}
