package com.MV_dev.ADM_OTICA.model;

public class CPF {

    private String CPF;

    // metodo para verificar se o CPF digitado é válido
    public static boolean CPFValido(String CPF){
        // linha de código que retira as linhas e pontos do CPF
        String cpfNumerico = CPF.replaceAll("[^0-9]", "");

        //linha que verifica se o CPF tem 11 dígitios e se nao sao uma sequencia de numeros iguais
        if(cpfNumerico.length() != 11 || cpfNumerico.matches("(\\d)\\1{10}")){
            return false;
        }
    }
}


