package com.MV_dev.ADM_OTICA.model;

public class CPF {

    private String CPF;

    // Construtor privado para evitar a criação de instâncias sem validação
    private CPF(String cpf) {
        this.CPF = cpf;
    }

    public String getCPF() {
        return this.CPF;
    }

    // Método estático para validar o CPF
    public static boolean CPFValido(String CPF) {
        // Remove caracteres não numéricos (pontos, traços, etc.)
        String cpfNumerico = CPF.replaceAll("[^0-9]", "");

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
}