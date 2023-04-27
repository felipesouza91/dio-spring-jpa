package dev.fsantana.diojpa.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Aluno {

    @Id
    private Long id;

    private String nome;

    private String cpf;

    private String bairro;

    private LocalDate dataNascimento;

    // private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
}
