package com.MV_dev.ADM_OTICA.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.awt.image.BufferedImage;
@Entity
@Table
public class Otica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String adm;
    private  String endereco;
    private String venda;
    private String celular;
    private String vendedor;
    private String cliente;
    private BufferedImage imagem_perfil;
    private String estoque;
    private String categorias;
    private String auto_mensagens;
    private String produto;
}
