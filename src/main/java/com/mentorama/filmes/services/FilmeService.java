package com.mentorama.filmes.services;

import com.mentorama.filmes.entities.Filme;
import com.mentorama.filmes.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FilmeService implements InFilmeService{

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> findAll(String filme){
        if(filme != null){
            return filmeRepository.findAll(filme);
        }
        return filmeRepository.findAll();
    }

    public Filme findById(Integer id) {
        return filmeRepository.findById(id);
    }

    public Integer add(Filme filme) {
        if(filme.getId() == null){
            filme.setId(filmeRepository.count() + 1);
        }
        return filme.getId();
    }


}
