package com.mentorama.filmes.services;

import com.mentorama.filmes.entities.Filme;

import java.util.List;

public class FilmeService implements InFilmeService{

    public List<Filme> findAll(int id, String filme, int ano){
        if(filme != null){
            return filmeRepository.findAll(filme);



        }
    }
}
