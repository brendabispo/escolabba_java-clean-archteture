package com.escolabba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpfTest {

    @Test
    void naoDeveriaCriarCpfComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cpf(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Cpf(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Cpf("emailinvalido"));
    }

    @Test
    void deveriaPermitirCriarEmailscomEnderecosValidos(){
        String numeros = "123.456.789-11";
        Cpf cpf = new Cpf(numeros);
        assertEquals(numeros, cpf.getNumero());
    }
}