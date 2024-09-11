package br.com.fiap.loja.model;

// Testando o Polimorfismo Estático e Dinâmico

public class Vendedor2 extends Funcionario2{

    @Override
    public String getSaudacao() {
        return "Vendemos mais, vendemos tudo!";
    }

    public double getPercentualDeComissao() {
        return 12;
    }
}
