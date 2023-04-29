package dev.fsantana.diojpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.fsantana.diojpa.dto.AlunoInput;
import dev.fsantana.diojpa.dto.AlunoUpdateInput;
import dev.fsantana.diojpa.model.Aluno;
import dev.fsantana.diojpa.repository.AlunoRepository;
import dev.fsantana.diojpa.service.IAlunoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements IAlunoService {

  private final AlunoRepository alunoRepository;

  @Override
  public Aluno create(AlunoInput data) {
    Aluno aluno = new Aluno();
    aluno.setBairro(data.getBairro());
    aluno.setCpf(data.getCpf());
    aluno.setDataNascimento(data.getDataNascimento());
    aluno.setNome(data.getNome());

    return alunoRepository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {
    return this.alunoRepository.findById(id).get();
  }

  @Override
  public List<Aluno> getAll() {
    return this.alunoRepository.findAll();
  }

  @Override
  public Aluno update(Long id, AlunoUpdateInput data) {
    Aluno savedAluno = this.alunoRepository.findById(id).get();
    savedAluno.setNome(data.getNome());
    savedAluno.setBairro(data.getBairro());
    savedAluno.setDataNascimento(data.getDataNascimento());
    return this.alunoRepository.save(savedAluno);
  }

  @Override
  public void delete(Long id) {
    this.alunoRepository.deleteById(id);
  }

}
