package br.com.fiap.loja.model;

import br.com.fiap.loja.model.Funcionario2;
import br.com.fiap.loja.model.Vendedor2;


public class TestandoPolimorfismo {

    public static void main(String[] args) {

        Funcionario2 funcionario = new Funcionario2();
        System.out.println(funcionario.getSaudacao());

        Vendedor2 vendedor = new Vendedor2();
        System.out.println(vendedor.getSaudacao());

        Funcionario2 estagiario = new Vendedor2();
        System.out.println(estagiario.getSaudacao());
        System.out.println(((Vendedor2) estagiario).getPercentualDeComissao() + "%"); // Uso do cast

        var estagiario2 = new Vendedor2();
        System.out.println(estagiario2.getPercentualDeComissao() + "%");


    }
}
