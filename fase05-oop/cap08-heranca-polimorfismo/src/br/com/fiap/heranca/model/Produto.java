package br.com.fiap.heranca.model;

// Inicio da superclasse Produto
public abstract class Produto {

    //Atributos comuns a todos os produtos
    // Como são privados, só são visíveis na própria classe
    private String nome;
    private String ingredientes;
    private double preco;

    // Construtores que não serão herdados, mas podem ser acessados através da super();
    public Produto (){}

    public Produto(String nome, String ingredientes, double preco) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preco = preco;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Criando um método abstrat que deverá ser implementado pela subclasse
    public abstract String getResumo();
}
