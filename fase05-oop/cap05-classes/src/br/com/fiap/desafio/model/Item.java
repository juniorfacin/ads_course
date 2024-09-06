package br.com.fiap.desafio.model;

public class Item {
    private String nome;
    private String descricao;
    private boolean itemRaro;
    private int nivelPoder;

    public Item(String nome, String descricao, boolean itemRaro, int nivelPoder) {
        this.nome = nome;
        this.descricao = descricao;
        this.itemRaro = itemRaro;
        this.nivelPoder = nivelPoder;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isItemRaro() {
        return itemRaro;
    }

    public void setItemRaro(boolean itemRaro) {
        this.itemRaro = itemRaro;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }
}
