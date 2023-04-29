package dev.fsantana.diojpa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.fsantana.diojpa.dto.AvaliacaoFisicaInput;
import dev.fsantana.diojpa.dto.AvaliacaoFisicaUpdateInput;
import dev.fsantana.diojpa.model.Aluno;
import dev.fsantana.diojpa.model.AvaliacaoFisica;
import dev.fsantana.diojpa.repository.AlunoRepository;
import dev.fsantana.diojpa.repository.AvaliacaoFisicaRepository;
import dev.fsantana.diojpa.service.IAvaliacaoFisicaService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AvaliacaoFinsicarServiceImpl implements IAvaliacaoFisicaService {

  private final AvaliacaoFisicaRepository avaliacaoFisicaRepository;
  private final AlunoRepository alunoRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaInput data) {
    Aluno aluno = alunoRepository.findById(data.getAlunoId()).get();
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setAltura(data.getAltura());
    avaliacaoFisica.setPeso(data.getPeso());
    return this.avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return this.avaliacaoFisicaRepository.findById(id).get();
  }

  @Override
  public List<AvaliacaoFisica> getAll() {
    return this.avaliacaoFisicaRepository.findAll();
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateInput data) {
    AvaliacaoFisica avaliacaoFisica = this.avaliacaoFisicaRepository.findById(id).get();
    avaliacaoFisica.setAltura(data.getAltura());
    avaliacaoFisica.setPeso(data.getPeso());
    return this.avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

}
