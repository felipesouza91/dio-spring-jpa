package dev.fsantana.diojpa.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AvaliacaoFisica {

    @Id
    private Long id;

    private Aluno aluno;

    private LocalDateTime dataAvalicao = LocalDateTime.now();

    private double peso;

    private double altura;

}
