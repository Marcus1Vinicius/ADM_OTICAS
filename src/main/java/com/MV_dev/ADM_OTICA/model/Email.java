package com.MV_dev.ADM_OTICA.model;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@Embeddable
public class Email {
    private String email;

    // Construtor privado para evitar a criação de instâncias sem validação
    private Email(String email) {this.email = email;}

    public static boolean isValid(String email) {
        // .trim() -> remove os espaços em branco do inicio ao fim de uma string
        // .isEmpty -> verifica se uma string éã vazia ou nao.
        // usando as duas expressçoes eu garanto que o email nao sera vazio e nem vai ter espaco desnessarios
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
    public static Email of(String email){
        if (!isValid(email)){
            // IllegalArgumentException é lançada quando um método recebe um argumento ilegal ou impróprio, ou seja, um valor que não atende aos requisitos ou condições esperadas pelo método.
            throw new IllegalArgumentException("Endereço de e-mail inválido: " + email);
        }
        return new Email(email);
    }

    @Override
    public String toString() {
        return email;
    }

}
