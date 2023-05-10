package com.example.relatorios;

import java.time.LocalDate;

public class Aluno {

    private String nome;
    private LocalDate dataNascimento;

    public Aluno(String nome, LocalDate dataNascimento, Boolean ativo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getDataNascimentoStr() {
        return dataNascimento.getDayOfMonth() +"/"+dataNascimento.getMonthValue()+"/"+dataNascimento.getYear();
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    private Boolean ativo;

}
