package com.escolabba.dominio.aluno;

public class Cpf {//Essa classe, em clean archteture é chamada de Value Object (VO) pois não tem um identificador único e duas instâncias são iguais a partir da comparação de todos seus atributos.
    private String numero;

    public Cpf(String numero) {
        if (numero == null ||
                !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF invalido!");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}