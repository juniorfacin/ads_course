package br.com.fiap.loja.model;

import br.com.fiap.loja.model.Produto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto");
        String nome = sc.next() + sc.nextLine();
        System.out.println("Digite o preço do produto");
        double preco = sc.nextDouble();

        Produto2 produto = new Produto2(nome, preco);

        System.out.println("Escolha um tipo de desconto:\n" +
                "1-Valor em reais\n" +
                "2-Valor em porcentagem\n" +
                "3-Cupom de desconto\n");

        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println("Digite o valor do desconto");
                double desconto = sc.nextDouble();
                //calcula e exibe o valor com desconto em reais (double)
                System.out.println("Valor com desconto: " +  produto.calcularDesconto(desconto));
                break;
            case 2:
                System.out.println("Digite o valor em porcentagem");
                int porcentagem = sc.nextInt();
                //calcula e exibe o valor com o desconto em porcentagem (int)
                System.out.println("Valor com desconto: " + produto.calcularDesconto(porcentagem));
                break;
            case 3:
                System.out.println("Digite o cupom de desconto");
                String cupom = sc.next() + sc.nextLine();
                //calcula e exibe o valor com desconto com cupom (String)
                System.out.println("Valor com desconto: " + produto.calcularDesconto(cupom));
                break;
            default:
                System.out.println("Opção inválida");
        }

        sc.close();

    }
}