package dev.fsantana.diojpa.service;

import java.util.List;

import dev.fsantana.diojpa.dto.AlunoInput;
import dev.fsantana.diojpa.dto.AlunoUpdateInput;
import dev.fsantana.diojpa.model.Aluno;

public interface IAlunoService {

    Aluno create(AlunoInput data);

    Aluno get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoUpdateInput data);

    void delete(Long id);
}
