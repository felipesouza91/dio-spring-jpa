package dev.fsantana.diojpa.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Aluno {

    @Id
    private Long id;

    private String nome;

    private String cpf;

    private String bairro;

    private LocalDate dataNascimento;

    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
}
