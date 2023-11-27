package com.example.examenblancspring.Repo;

import com.example.examenblancspring.Entities.Clinique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CliniqueRepo extends JpaRepository<Clinique,Long> {
}
