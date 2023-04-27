package dev.fsantana.diojpa.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AvaliacaoFisica {

    @Id
    private Long id;

    // private Aluno aluno;

    private LocalDateTime dataAvalicao = LocalDateTime.now();

    private double peso;

    private double altura;

}
