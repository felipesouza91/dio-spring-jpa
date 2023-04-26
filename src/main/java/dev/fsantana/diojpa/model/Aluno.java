package dev.fsantana.diojpa.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Aluno {
    private Long id;

    private String nome;

    private String cpf;

    private String bairro;

    private LocalDate dataNascimento;

    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
}
