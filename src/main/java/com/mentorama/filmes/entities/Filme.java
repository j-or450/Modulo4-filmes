package com.mentorama.filmes.entities;

public class Filme {
    private Integer id;
    private String nome;
    private String nomeDir;
    private int ano;
    private int nota;

    public Filme(Integer id, String nome, String nomeDir, int ano, int nota) {
        this.id = id;
        this.nome = nome;
        this.nomeDir = nomeDir;
        this.ano = ano;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDir() {
        return nomeDir;
    }

    public void setNomeDir(String nomeDir) {
        this.nomeDir = nomeDir;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
