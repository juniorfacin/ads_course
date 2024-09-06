package br.com.fiap.refactor;

import br.com.fiap.refactor.model.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1-Cadastrar Produto");
            System.out.println("2-Exibir Produto");
            System.out.println("3-Comprar");
            System.out.println("4-Adicionar Estoque");
            System.out.println("5-Aplicar Desconto");
            System.out.println("0-Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o preco do produto:");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Digite a quantidade em estoque:");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    produto = new Produto(nome, preco, quantidade);
                    break;

                case 2:
                    if (produto != null) {
                        produto.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum produto cadastrado!");
                    }
                    break;
                case 3:
                    System.out.println("Informe a quantiadade comprada: ");
                    int quantidadeComprada = scanner.nextInt();
                    scanner.nextLine();
                    produto.comprarProduto(quantidadeComprada);
                case 4:
                    System.out.println("Informe a quantidade adicionada: ");
                    int quantidadeAdicionada = scanner.nextInt();
                    scanner.nextLine();
                    produto.adicionarEstoque(quantidadeAdicionada);
                case 5:
                    System.out.println("Informe um número entre 10 e 30 para cálculo do desconto: ");
                    int desconto = scanner.nextInt();
                    scanner.nextLine();
                    if (desconto >= 10 && desconto <= 30) {
                        produto.aplicarDesconto(desconto);
                    } else {
                        System.out.printf("O número informado é inválido.\n");
                    }
                case 0:
                    System.out.println("Saindo...\n");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

