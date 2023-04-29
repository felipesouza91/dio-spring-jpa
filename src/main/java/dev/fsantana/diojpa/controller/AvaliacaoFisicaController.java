package dev.fsantana.diojpa.controller;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.fsantana.diojpa.dto.AvaliacaoFisicaInput;
import dev.fsantana.diojpa.dto.AvaliacaoFisicaUpdateInput;
import dev.fsantana.diojpa.model.AvaliacaoFisica;
import dev.fsantana.diojpa.service.IAvaliacaoFisicaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/avaliacao-fisica")
@RequiredArgsConstructor
public class AvaliacaoFisicaController {

  private final IAvaliacaoFisicaService service;

  @GetMapping
  public List<AvaliacaoFisica> getAll() {
    return this.service.getAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<AvaliacaoFisica> getUnique(@PathVariable Long id) {
    try {
      return ResponseEntity.ok().body(this.service.get(id));
    } catch (NoSuchElementException e) {
      return ResponseEntity.badRequest().build();
    }
  }

  @PostMapping
  public ResponseEntity<AvaliacaoFisica> save(@Valid @RequestBody AvaliacaoFisicaInput data) {
    try {
      return ResponseEntity.status(HttpStatus.CREATED).body(this.service.create(data));
    } catch (NoSuchElementException e) {
      return ResponseEntity.badRequest().build();
    }
  }

  @PutMapping("/{id}")
  public ResponseEntity<AvaliacaoFisica> update(@PathVariable Long id, @Valid @RequestBody AvaliacaoFisicaUpdateInput input) {
    try {
      return ResponseEntity.ok().body(this.service.update(id, input));
    } catch (NoSuchElementException e) {
      return ResponseEntity.badRequest().build();
    }
  }
}
