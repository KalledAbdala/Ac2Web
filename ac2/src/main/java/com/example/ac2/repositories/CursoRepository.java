package com.example.ac2.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ac2.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByNomeLike(String nome);
}