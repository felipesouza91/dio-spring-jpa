package dev.fsantana.diojpa.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class AvaliacaoFisica {

    private Long id;

    private Aluno aluno;

    private LocalDateTime dataAvalicao = LocalDateTime.now();

    private double peso;

    private double altura;

}
