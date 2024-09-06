package br.com.fiap.desafio;

import br.com.fiap.desafio.model.Aluno;
import br.com.fiap.desafio.model.Endereco;

import java.util.Scanner;

public class AlunoView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = null;

        int op;

        do {
            System.out.println("\nEscolha uma opção: \n1-Cadastrar Aluno \n2-Exibir Aluno \n3-Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do Aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a Matricula do Aluno: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();

                    aluno = new Aluno(nome, matricula);

                    System.out.println("Digite o Logradouro do Aluno: ");
                    String logradouro = sc.nextLine();
                    System.out.println("Número: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Cidade: ");
                    String cidade = sc.nextLine();
                    System.out.println("Estado: ");
                    String estado = sc.nextLine();
                    System.out.println("CEP: ");
                    String cep = sc.nextLine();

                    Endereco endereco = new Endereco(logradouro, numero, cidade, estado, cep);
                    aluno.setEndereco(endereco);
                    break;
                case 2:
                    if (aluno != null) {
                        System.out.printf("Nome: %s%n", aluno.getNome());
                        System.out.printf("Matricula: %d%n", aluno.getMatricula());

                        if (aluno.getEndereco() != null) {
                            Endereco end = aluno.getEndereco();

                            System.out.printf("Endereço: %s, n: %d, %s, %s, CEP: %s%n",
                                    end.getLogradouro(),
                                    end.getNumero(),
                                    end.getCidade(),
                                    end.getEstado(),
                                    end.getCep());
                        } else {
                            System.out.println("Endereço não cadastrado.");
                        }
                    } else {
                        System.out.println("Nenhum aluno cadastrado ainda.");
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
