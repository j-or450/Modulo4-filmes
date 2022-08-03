package com.mentorama.filmes.services;

import com.mentorama.filmes.entities.Filme;
import com.mentorama.filmes.excecoes.FilmeInexistenteException;
import com.mentorama.filmes.excecoes.NotaInexistenteException;
import com.mentorama.filmes.excecoes.RecursoInexistenteException;
import com.mentorama.filmes.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        if(filmeRepository.findById(id) == null){
            throw new FilmeInexistenteException();
        }
        return filmeRepository.findById(id);
    }

    public Filme add(final Filme filme) {
        if(filme.getId() == null){
            filme.setId(filmeRepository.count() + 1);
        }
        if(filme.getNota() < 1 || filme.getNota() > 5){
            throw new NotaInexistenteException();
        }
        if(filmeRepository.findAll().stream().anyMatch(f -> f.getNome().equalsIgnoreCase(filme.getNome()))){
            if(filmeRepository.findAll().stream().anyMatch(f -> f.getNomeDir().equalsIgnoreCase(filme.getNomeDir()))){
                throw new RecursoInexistenteException();
            }
        }
        filmeRepository.add(filme);
        return filme;
    }


}
