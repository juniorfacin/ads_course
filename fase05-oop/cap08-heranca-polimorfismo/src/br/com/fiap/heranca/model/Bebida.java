package br.com.fiap.heranca.model;

public class Bebida extends Produto {
    private int tamanho;
    public Bebida() {
        super();
    }

    public Bebida(String nome, String ingredientes, double preco, int tamanho) {
        super(nome, ingredientes, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getResumo() {
        return "Nome: " + this.getNome() + "\nIngredientes: " + this.getIngredientes() + "\nPreço: R$ " +
                this.getPreco() + "\nTamanho: " + this.getTamanho() + "ml";
    }
}

