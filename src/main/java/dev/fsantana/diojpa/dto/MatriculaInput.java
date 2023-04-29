package dev.fsantana.diojpa.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MatriculaInput {

    @NotNull
    private Long alunoId;
}
