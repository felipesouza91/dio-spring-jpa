package dev.fsantana.diojpa.service.impl;

import java.util.List;

import dev.fsantana.diojpa.dto.AvaliacaoFisicaInput;
import dev.fsantana.diojpa.model.AvaliacaoFisica;
import dev.fsantana.diojpa.repository.AvaliacaoFisicaRepository;
import dev.fsantana.diojpa.service.IAvaliacaoFisicaService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AvaliacaoFinsicarServiceImpl implements IAvaliacaoFisicaService {

  private final AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaInput data) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public List<AvaliacaoFisica> getAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }

}
