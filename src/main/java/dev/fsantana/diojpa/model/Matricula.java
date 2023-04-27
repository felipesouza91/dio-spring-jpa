package dev.fsantana.diojpa.model;

import java.time.LocalDateTime;

import javax.persistence.Id;

public class Matricula {

    @Id
    private Long id;

    private Aluno aluno;

    private LocalDateTime createdAt = LocalDateTime.now();
}
