package com.mentorama.filmes.repositories;

import com.mentorama.filmes.entities.Filme;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class FilmeRepository {

    private final List<Filme> filmes;

    public FilmeRepository() {
        this.filmes = new ArrayList<>();
    }

    public List<Filme> findAll(){
        return filmes;
    }

    public List<Filme> findAll(String nome){
        return filmes.stream()
                .filter(f -> f.getNome().contains(nome))
                .collect(Collectors.toList());
    }

    public Filme findById(Integer id){
        return this.filmes.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void add(final Filme filme){
        this.filmes.add(filme);
    }

    public int count(){
        return filmes.size();
    }

}
