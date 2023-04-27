package dev.fsantana.diojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.fsantana.diojpa.model.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

}
