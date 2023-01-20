package com.escolabba;

import com.escolabba.aplicacao.aluno.matricula.MatricularAluno;
import com.escolabba.aplicacao.aluno.matricula.MatricularAlunoDto;
import com.escolabba.infra.aluno.RepositorioDeAlunosEmMemoria;

public class Main {
    public static void main(String[] args) {

            String nome = "Fulano da Silva";
            String cpf ="123.456.789-00";
            String email = "fulano@email.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executa(new MatricularAlunoDto(nome, cpf, email));

    }
}