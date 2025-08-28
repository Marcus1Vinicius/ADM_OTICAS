package com.MV_dev.ADM_OTICA.model;

public class Email {
    private String Email;

    // Construtor privado para evitar a criação de instâncias sem validação
    private Email(String email) {this.Email = email;}

    public static boolean EmailValido(String Email) {
            return Email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

}
