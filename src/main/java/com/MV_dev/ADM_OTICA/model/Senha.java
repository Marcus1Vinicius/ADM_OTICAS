package com.MV_dev.ADM_OTICA.model;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@Embeddable

public class Senha {
    private String Semha;

    public static boolean SenhaValido(String Senha){

    }
}
