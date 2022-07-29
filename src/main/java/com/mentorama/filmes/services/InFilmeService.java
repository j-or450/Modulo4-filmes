package com.mentorama.filmes.services;

import com.mentorama.filmes.entities.Filme;

import java.util.List;

public interface InFilmeService {
    public List<Filme> findAll(String filme);

    public Filme findById(Integer id);

    Filme add(final Filme filme);
}
