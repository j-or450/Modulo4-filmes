package com.mentorama.filmes.repositories;

import com.mentorama.filmes.entities.Filme;

import java.util.List;

public class FilmeRepository {

    private final List<Filme> filmes;

    public FilmeRepository(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public List<Filme> findAll(){
        return filmes;
    }
}
