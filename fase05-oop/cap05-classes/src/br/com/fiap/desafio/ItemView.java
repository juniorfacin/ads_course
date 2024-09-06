package br.com.fiap.desafio;

import br.com.fiap.desafio.model.Item;
import java.util.Scanner;

public class ItemView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item = null; // Declarando o null para ser instanciado depois.
        int op;

        do {
            System.out.println("\nEscolha uma opção: \n1-Cadastrar Item \n2-Exibir Item \n3-Sair");
            op = sc.nextInt();
            sc.nextLine(); // Consome a nova linha após o número

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do item:");
                    String nome = sc.nextLine();
                    System.out.println("Digite uma descrição para o item:");
                    String descricao = sc.nextLine();
                    System.out.println("O item é raro? (true/false):");
                    boolean itemRaro = sc.nextBoolean();
                    System.out.println("Digite o nível do item:");
                    int nivelPoder = sc.nextInt();
                    sc.nextLine(); // Consome a nova linha após o número

                    item = new Item(nome, descricao, itemRaro, nivelPoder);
                    break;
                case 2:
                    if (item != null) {
                        System.out.printf("Nome: %s%n" +
                                        "Descrição: %s%n" +
                                        "Raridade: %b%n" +
                                        "Nível do Item: %d%n",
                                item.getNome(),
                                item.getDescricao(),
                                item.isItemRaro(),
                                item.getNivelPoder());
                    } else {
                        System.out.println("Nenhum item cadastrado ainda.");
                    }
                    break;
                case 3:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 3);

        sc.close();
    }
}
