package com.MV_dev.ADM_OTICA.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.awt.image.BufferedImage;
@Entity
@Table
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String celular;
    private  String email;
    private String produtos_adquiridos;
    private String CPF;
    private String endereco;
    private String RG;
    private String receita;
    private BufferedImage imagem_perfil;
}
