package com.escolabba.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {//Esta classe, no contexto da clean archteture, é chamada Entidade, pois possui um atributo identificador único, no caso o cpf.
                    //Dois alunos podem ter o mesmo nome, mas o cpf será diferente.
    private Cpf cpf;
    private String nome;
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    private String senha;

    public Aluno(Cpf cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
