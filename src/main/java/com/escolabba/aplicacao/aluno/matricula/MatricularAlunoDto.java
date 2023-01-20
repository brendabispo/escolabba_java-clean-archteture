package com.escolabba.aplicacao.aluno.matricula;

import com.escolabba.dominio.aluno.Aluno;
import com.escolabba.dominio.aluno.Cpf;
import com.escolabba.dominio.aluno.Email;

public class MatricularAlunoDto {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno(){
        return new Aluno(new Cpf(cpfAluno), nomeAluno, new Email(emailAluno));
    }
}
