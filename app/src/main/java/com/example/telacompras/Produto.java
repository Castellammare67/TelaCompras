package com.example.telacompras;

import android.util.Pair;

public class Produto {
    private String nomeProduto;
    private Double valor;
    private Integer quantidade;
    private String marca;
    private String referencia;
    private Double desconto;
    private Pair<Integer, Integer> promocao;

    public Produto(String nomeProduto, double valor, int qtde, String marca, String ref, double desconto, Pair<Integer,Integer> promocao){
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = qtde;
        this.marca = marca;
        this.referencia = ref;
        this.desconto = desconto;
        this.promocao = promocao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public Double getDesconto() {
        return desconto;
    }

    public Pair<Integer, Integer> getPromocao() {
        return promocao;
    }
}
