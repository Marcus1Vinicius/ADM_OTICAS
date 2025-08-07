package com.MV_dev.ADM_OTICA.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table
public class Receita_cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Produto produto;
    private String data;
    private String especialista_da_receita;
    private Endereco endereco_especialista;
    private String grau_esferico;
    private String observacoes;
    private Cliente cliente;
}
