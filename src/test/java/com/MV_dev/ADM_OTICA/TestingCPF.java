package com.MV_dev.ADM_OTICA;

import com.MV_dev.ADM_OTICA.model.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void deveRetornarTrueParaCPFValido() {
        // Exemplo de CPF válido conhecido
        String cpfValido = "529.982.247-25";
        assertTrue(CPF.isValid(cpfValido), "O CPF válido deveria ser aceito");
    }

    @Test
    void deveRetornarFalseParaCPFInvalido() {
        String cpfInvalido = "123.456.789-00";
        assertFalse(CPF.isValid(cpfInvalido), "O CPF inválido deveria ser rejeitado");
    }

    @Test
    void deveRetornarFalseParaCPFComNumerosRepetidos() {
        String cpfInvalido = "111.111.111-11";
        assertFalse(CPF.isValid(cpfInvalido), "CPFs com números repetidos devem ser inválidos");
    }

    @Test
    void deveRetornarFalseParaCPFComMenosDe11Digitos() {
        String cpfCurto = "123.456.78-9";
        assertFalse(CPF.isValid(cpfCurto), "CPFs com menos de 11 dígitos devem ser inválidos");
    }

    @Test
    void deveRetornarFalseParaCPFNulo() {
        assertFalse(CPF.isValid(null), "CPFs nulos devem ser inválidos");
    }

    @Test
    void deveLancarExcecaoAoTentarCriarCPFInvalido() {
        assertThrows(IllegalArgumentException.class, () -> CPF.of("111.111.111-11"),
                "Deveria lançar exceção ao tentar criar CPF inválido");
    }

    @Test
    void deveCriarObjetoCPFValidoCorretamente() {
        String cpfValido = "529.982.247-25";
        CPF cpf = CPF.of(cpfValido);

        assertNotNull(cpf);
        assertEquals(cpfValido, cpf.getCpf());
        assertTrue(CPF.isValid(cpf.getCpf()), "O CPF criado deve ser válido");
    }
}
