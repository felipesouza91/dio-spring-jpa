package dev.fsantana.diojpa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.fsantana.diojpa.dto.MatriculaInput;
import dev.fsantana.diojpa.model.Aluno;
import dev.fsantana.diojpa.model.Matricula;
import dev.fsantana.diojpa.repository.AlunoRepository;
import dev.fsantana.diojpa.repository.MatriculaRepository;
import dev.fsantana.diojpa.service.IMatriculaService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MatriculaServiceImpl implements IMatriculaService {

  private final MatriculaRepository matriculaRepository;

  private final AlunoRepository alunoRepository;

  @Override
  public Matricula create(MatriculaInput form) {
    Aluno aluno = this.alunoRepository.findById(form.getAlunoId()).get();
    Matricula matricula = new Matricula();
    matricula.setAluno(aluno);
    return this.matriculaRepository.save(matricula);
  }

  @Override
  public Matricula get(Long id) {
    return this.matriculaRepository.findById(id).get();
  }

  @Override
  public List<Matricula> getAll() {
    return this.matriculaRepository.findAll();
  }

}
