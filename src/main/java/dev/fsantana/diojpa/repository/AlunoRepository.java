package dev.fsantana.diojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.fsantana.diojpa.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Long, Aluno> {

}
