package com.example.examenblancspring.Repo;

import com.example.examenblancspring.Entities.Patient;
import com.example.examenblancspring.Entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RDVRepo extends JpaRepository<RendezVous,Long> {
    @Query
}
