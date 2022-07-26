package com.mentorama.filmes.services;

import com.mentorama.filmes.entities.Filme;

import java.util.List;

public interface InFilmeService {
    public List<Filme> findAll(int id, String filme, int ano);

    public Filme findById(Integer id);

    void update(final Filme filme);

    Integer add(final Filme filme);
}
