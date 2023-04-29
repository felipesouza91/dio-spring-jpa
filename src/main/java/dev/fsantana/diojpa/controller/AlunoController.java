package dev.fsantana.diojpa.controller;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.fsantana.diojpa.dto.AlunoInput;
import dev.fsantana.diojpa.dto.AlunoUpdateInput;
import dev.fsantana.diojpa.model.Aluno;
import dev.fsantana.diojpa.model.AvaliacaoFisica;
import dev.fsantana.diojpa.service.IAlunoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {

  private final IAlunoService alunoService;

  @GetMapping
  public List<Aluno> getAll() {
    return alunoService.getAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Aluno> getUnique(@PathVariable Long id) {
    try {
      return ResponseEntity.ok().body(this.alunoService.get(id));
    } catch (NoSuchElementException e) {
      return ResponseEntity.notFound().build();
    }
  }

  @GetMapping("/{id}/avaliacoes")
  public ResponseEntity<List<AvaliacaoFisica>> getAvaliacoesFisicas(@PathVariable Long id) {
    try {
      return ResponseEntity.ok().body(this.alunoService.get(id).getAvaliacoes());
    } catch (NoSuchElementException e) {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<Aluno> save(@Valid @RequestBody AlunoInput input) {
    return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.create(input));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Aluno> update(@PathVariable Long id, @Valid @RequestBody AlunoUpdateInput input) {
    try {
      return ResponseEntity.ok().body(this.alunoService.update(id, input));
    } catch (NoSuchElementException e) {
      return ResponseEntity.badRequest().build();
    }
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(value = HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    this.alunoService.delete(id);
  }
}
