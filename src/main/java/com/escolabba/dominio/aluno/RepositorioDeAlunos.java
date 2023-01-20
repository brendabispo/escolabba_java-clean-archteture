package com.escolabba.dominio.aluno;

import com.escolabba.dominio.aluno.Aluno;
import com.escolabba.dominio.aluno.Cpf;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscarPorCpf(Cpf cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
