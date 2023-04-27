package dev.fsantana.diojpa.service.impl;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.fsantana.diojpa.dto.AlunoInput;
import dev.fsantana.diojpa.dto.AlunoUpdateInput;
import dev.fsantana.diojpa.model.Aluno;
import dev.fsantana.diojpa.repository.AlunoRepository;
import dev.fsantana.diojpa.service.IAlunoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AlunoServiceImpl implements IAlunoService {

  private final AlunoRepository alunoRepository;

  @Override
  public Aluno create(AlunoInput data) {
    return null;
  }

  @Override
  public Aluno get(Long id) {

    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public List<Aluno> getAll() {

    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }

  @Override
  public Aluno update(Long id, AlunoUpdateInput data) {

    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {

    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

}
