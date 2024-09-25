package br.com.fiap.dados.desafios;

public class GerenciadorEstoque {
    public static void main(String[] args) {
        String[] produtosEstoque = {
                "Notebook",
                "Smartphone",
                "Tablet",
                "Fone de ouvido",
                "Carregador portátil"
        };

        String produtoProcurado = "Microfone";

        boolean produtoEncontrado = false;
        int i = 0;

        while (!produtoEncontrado && i < produtosEstoque.length) {
            if (produtosEstoque[i].equals(produtoProcurado)) {
                produtoEncontrado = true;
            }
            i++;
        }

        if (produtoEncontrado) {
            System.out.println(produtoProcurado + " está disponível no estoque");
        } else {
            System.out.println(produtoProcurado + " não está disponível no estoque");
        }
    }


}
