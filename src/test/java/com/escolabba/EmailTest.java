package com.escolabba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaPermitirCriarEmailscomEnderecosValidos(){
        String endereco = "brenda@email.com";
        Email email = new Email(endereco);
        assertEquals(endereco, email.getEndereco());
    }
}
