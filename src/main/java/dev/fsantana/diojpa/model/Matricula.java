package dev.fsantana.diojpa.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Matricula {

    @Id
    private Long id;

    // private Aluno aluno;

    private LocalDateTime createdAt = LocalDateTime.now();
}
