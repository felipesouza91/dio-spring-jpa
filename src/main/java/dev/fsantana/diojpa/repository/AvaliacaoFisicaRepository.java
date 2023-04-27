package dev.fsantana.diojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.fsantana.diojpa.model.AvaliacaoFisica;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<Long, AvaliacaoFisica> {

}
