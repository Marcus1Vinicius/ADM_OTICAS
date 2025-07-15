package com.MV_dev.ADM_OTICA.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.awt.image.BufferedImage;

@Entity
@Table
public class administrador_otica {
    private String nome;
    private String celular;
    private  String email;
    private String senha;
    private String CPF;
    private String otica;
    private BufferedImage imagem_perfil;



}
