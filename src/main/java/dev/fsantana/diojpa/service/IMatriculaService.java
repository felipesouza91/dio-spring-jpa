package dev.fsantana.diojpa.service;

import java.util.List;

import dev.fsantana.diojpa.dto.MatriculaInput;
import dev.fsantana.diojpa.model.Matricula;

public interface IMatriculaService {

  Matricula create(MatriculaInput form);

  Matricula get(Long id);

  List<Matricula> getAll();
   
}