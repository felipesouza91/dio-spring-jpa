package dev.fsantana.diojpa.dto;

import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoInput {

    @NotBlank
    private String nome;

    @CPF
    private String cpf;

    @NotBlank
    private String bairro;

    @NotNull
    private LocalDate dataNascimento;
}
