package dev.fsantana.diojpa.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisicaInput {
    @NotNull
    private Long alunoId;

    @NotNull
    private double peso;

    @NotNull
    private double altura;
}
