package dev.fsantana.diojpa.service.impl;

import java.util.List;

import dev.fsantana.diojpa.dto.MatriculaInput;
import dev.fsantana.diojpa.model.Matricula;
import dev.fsantana.diojpa.repository.MatriculaRepository;
import dev.fsantana.diojpa.service.IMatriculaService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MatriculaServiceImpl implements IMatriculaService {

  private final MatriculaRepository matriculaRepository;

  @Override
  public Matricula create(MatriculaInput form) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public Matricula get(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public List<Matricula> getAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }

}
