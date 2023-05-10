package com.example.relatorios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.addAll(
                Arrays.asList(
                        new Aluno("João Santos", LocalDate.now().minusYears(20),true),
                        new Aluno("Maria Santos", LocalDate.now().minusYears(18),true),
                        new Aluno("José Santos", LocalDate.now().minusYears(16),false)
                )
        );

        Gerador.gerar(alunos);
        System.out.println("OLAAAAAAA");
    }


}