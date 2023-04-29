package dev.fsantana.diojpa.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoUpdateInput {
    @NotBlank
    private String nome;

    @NotBlank
    private String bairro;

    @NotNull
    private LocalDate dataNascimento;

}
