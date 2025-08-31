package com.MV_dev.ADM_OTICA.model;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@Embeddable
public class Celular {
    private String Celular;

    // .trim() -> remove os espaços em branco do inicio ao fim de uma string
    // .isEmpty -> verifica se uma string é vazia ou nao.
    // usando as duas expressçoes eu garanto que o celular nao sera vazio e nem vai ter espaco desnessarios
    public static boolean Isvalid(String celular){
        if (celular == null || celular.trim().isEmpty()) {
            return false;
        }
        // Remove qualquer caractere que não seja um dígito
        String digitos = celular.replaceAll("[^0-9]", "");

        // Verifica se a string tem exatamente 11 dígitos (formato com DDD e 9º dígito)
        return digitos.length() == 11;
    }
}
