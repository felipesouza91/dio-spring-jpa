package dev.fsantana.diojpa.controller;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.fsantana.diojpa.dto.MatriculaInput;
import dev.fsantana.diojpa.model.Matricula;
import dev.fsantana.diojpa.service.IMatriculaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/matricula")
@RequiredArgsConstructor
public class MatriculaController {

  private final IMatriculaService service;

  @GetMapping
  public List<Matricula> getAll() {
    return this.service.getAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Matricula> getUnique(@PathVariable Long id) {
    try {
      return ResponseEntity.ok().body(this.service.get(id));
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }

  @PostMapping
  public ResponseEntity<Matricula> save(@Valid @RequestBody MatriculaInput data) {
    try {
      return ResponseEntity.status(HttpStatus.CREATED).body(this.service.create(data));
    } catch (NoSuchElementException e) {
      return ResponseEntity.badRequest().build();
    }
  }
}
