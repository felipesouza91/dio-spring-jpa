package dev.fsantana.diojpa.model;

import java.time.LocalDateTime;

public class Matricula {

    private Long id;

    private Aluno aluno;

    private LocalDateTime createdAt = LocalDateTime.now();
}
