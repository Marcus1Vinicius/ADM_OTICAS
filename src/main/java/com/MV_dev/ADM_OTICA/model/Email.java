package com.MV_dev.ADM_OTICA.model;

public class Email {
    private String Email;
    // Construtor privado para evitar a criação de instâncias sem validação
    private Email(String email) {
        this.Email = email;
    }

    public String getEmail() {
        return this.Email;
    }

    public static boolean EmailValido(String Email) {



        return false;
    }
}
