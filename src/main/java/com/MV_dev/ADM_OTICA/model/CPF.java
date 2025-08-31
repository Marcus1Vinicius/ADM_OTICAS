package com.MV_dev.ADM_OTICA.model;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@Embeddable
public class CPF {

    private String cpf;

    // Construtor privado para evitar a criação de instâncias sem validação
    private CPF(String cpf) {
        this.cpf = cpf;
    }

    // Método estático para validar o CPF
    public static boolean isValid(String cpf) {

        if (cpf == null) {
            return false;
        }
        // Remove caracteres não numéricos (pontos, traços, etc.)
        String cpfNumerico = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos e não é uma sequência de números iguais
        if (cpfNumerico.length() != 11 || cpfNumerico.matches("(\\d)\\1{10}")) {
            return false;
        }

        // --- Lógica para validar os 2 dígitos verificadores ---

        // Validação do 1º dígito
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpfNumerico.charAt(i)) * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }
        if (Character.getNumericValue(cpfNumerico.charAt(9)) != digito1) {
            return false;
        }

        // Validação do 2º dígito
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpfNumerico.charAt(i)) * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }
        if (Character.getNumericValue(cpfNumerico.charAt(10)) != digito2) {
            return false;
        }
        // Se todas as verificações passarem, o CPF é válido
        return true;
    }

    public static CPF of(String cpf){
        if (!isValid(cpf)){
            // IllegalArgumentException é lançada quando um método recebe um argumento ilegal ou impróprio, ou seja, um valor que não atende aos requisitos ou condições esperadas pelo método.
            throw new IllegalArgumentException("O CPF digitado é inválido: " + cpf);
        }
        return new CPF(cpf);
    }

}
