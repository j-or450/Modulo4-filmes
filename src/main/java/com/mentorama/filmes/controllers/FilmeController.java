package com.mentorama.filmes.controllers;

import com.mentorama.filmes.entities.Filme;
import com.mentorama.filmes.services.InFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private InFilmeService filmeService;

    @GetMapping
    public ResponseEntity<List<Filme>> findAll(@RequestParam(required = false) int id, String nome, int ano ){
        List<Filme> list = filmeService.findAll(id,nome,ano);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public Filme findById(@PathVariable("id") Integer id) {
        return filmeService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Integer> add(@RequestBody final Filme filme){
        Integer id = filmeService.add(filme);
        return new ResponseEntity(id, HttpStatus.ACCEPTED);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody final Filme filme){
       return new filmeService.update(filme);
    }

}
