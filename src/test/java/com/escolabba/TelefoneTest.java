package com.escolabba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefonesComDddsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefonesComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("73", null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("73", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("73", "12345"));
    }

    @Test
    void deveriaPermitirCriarTelefonescomDddENumerosValidos(){
        String ddd = "73";//variavel com valor
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);//instancia um objeto telefone do tipo Telefone
        assertEquals(ddd, telefone.getDdd()); //Uma variavel por vez no assrtEquals
        assertEquals(numero, telefone.getNumero());
    }

}