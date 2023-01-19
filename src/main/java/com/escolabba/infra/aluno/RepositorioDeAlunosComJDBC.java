package com.escolabba.infra.aluno;

import com.escolabba.dominio.aluno.Aluno;
import com.escolabba.dominio.aluno.Cpf;
import com.escolabba.dominio.aluno.RepositorioDeAlunos;

import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    @Override
    public void matricular(Aluno aluno) {

    }

    @Override
    public Aluno buscarPorCpf(Cpf cpf) {
        return null;
    }

    @Override
    public List<Aluno> ListarTodosAlunosMatriculados() {
        return null;
    }
}
