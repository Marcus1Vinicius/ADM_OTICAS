package com.MV_dev.ADM_OTICA.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    private String cliente;
    private String produto;
    private String valor;
    private String tipo_pagamento;
    private String responsavel_pela_venda;
    private String status_pagamento;
    private String imagem_venda;
}
