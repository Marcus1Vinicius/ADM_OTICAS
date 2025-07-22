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
    private Celular celular;
    private  Email email;
    private Produto produtos_adquiridos;
    private CPF CPF;
    private Endereco endereco;
    private Receita_cliente receita;
    private BufferedImage imagem_perfil;
}
