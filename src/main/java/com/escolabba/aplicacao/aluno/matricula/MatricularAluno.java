package com.escolabba.aplicacao.aluno.matricula;

import com.escolabba.dominio.aluno.Aluno;
import com.escolabba.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void executa(MatricularAlunoDto dados){
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}
