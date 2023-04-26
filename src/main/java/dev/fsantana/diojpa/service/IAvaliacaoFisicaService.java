package dev.fsantana.diojpa.service;

import java.util.List;

import dev.fsantana.diojpa.dto.AvaliacaoFisicaInput;
import dev.fsantana.diojpa.model.AvaliacaoFisica;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaInput data);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();
}
