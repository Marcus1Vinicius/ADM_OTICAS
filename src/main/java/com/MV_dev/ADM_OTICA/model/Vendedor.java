package com.MV_dev.ADM_OTICA.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.awt.image.BufferedImage;
@Entity
@Table
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Celular celular;
    private  Email email;
    private Senha senha;
    private CPF CPF;
    private BufferedImage imagem_perfil;
}
