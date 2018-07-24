package com.example.joel.recyclerviewexample.model;

public class FilmeIMDB {

    private String titulo;
    private String pontuacao;
    private String ano;
    private String genero;

    public FilmeIMDB(String titulo, String pontuacao, String ano, String genero) {
        this.titulo = titulo;
        this.pontuacao = pontuacao;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}