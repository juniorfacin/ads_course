package br.com.fiap.desafio;

import br.com.fiap.desafio.model.HabilidadeEspecial;
import br.com.fiap.desafio.model.PersonagemMagico;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = null; // Inicializado como null
        int op;

        do {
            System.out.println("\nEscolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Atacar " +
                    "\n4-Aumentar Energia \n5-Ativar Habilidade Especial \n6-Habilitar a Habilidade Especial \n0-Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do personagem:");
                    String nome = sc.nextLine();
                    System.out.println("Digite o poder do personagem:");
                    String poder = sc.nextLine();
                    System.out.println("Digite o nível de energia:");
                    int energia = sc.nextInt();
                    sc.nextLine();

                    personagem = new PersonagemMagico(nome, poder, energia);

                    System.out.println("Digite o nome da habilidade especial:");
                    String nomeHabilidade = sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a habilidade especial:");
                    int custoEnergia = sc.nextInt();
                    sc.nextLine();
                    System.out.println("A habilidade está ativada? (true/false):");
                    boolean ativada = sc.nextBoolean();
                    sc.nextLine();

                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, custoEnergia, ativada);

                    personagem.setHabilidadeEspecial(habilidadeEspecial);
                    break;
                case 2:
                    if (personagem != null) {
                        System.out.printf("Nome: %s%nPoder: %s%nNível de energia: %d%n",
                                personagem.getNome(),
                                personagem.getPoderMagico(),
                                personagem.getNivelEnergia());
                        if (personagem.getHabilidadeEspecial() != null) {
                            HabilidadeEspecial h = personagem.getHabilidadeEspecial();
                            System.out.printf("Habilidade: %s%nCusto energia: %d%nHabilitada: %b%n",
                                    h.getNomeHabilidade(),
                                    h.getCustoEnergia(),
                                    h.isHabilitada());
                        } else {
                            System.out.println("Nenhuma habilidade especial cadastrada.");
                        }
                    } else {
                        System.out.println("Nenhum personagem cadastrado.");
                    }
                    break;
                case 3:
                    if (personagem != null) {
                        System.out.println("Digite o nome do ataque: ");
                        String ataque = sc.nextLine();
                        personagem.atacar(ataque);
                    } else {
                        System.out.println("Nenhum personagem cadastrado.");
                    }
                    break;
                case 4:
                    if (personagem != null) {
                        System.out.println("Digite a quantidade de energia: ");
                        int qtd = sc.nextInt();
                        sc.nextLine();
                        int nivelEnergiaAtual = personagem.aumentarEnergia(qtd);
                        System.out.printf("Nível de energia atual: %d%n", nivelEnergiaAtual);
                    } else {
                        System.out.println("Nenhum personagem cadastrado.");
                    }
                    break;
                case 5:
                    if (personagem != null) {
                        personagem.ativarHabilidadeEspecial();
                    } else {
                        System.out.println("Nenhum personagem cadastrado.");
                    }
                    break;
                case 6:
                    if (personagem != null && personagem.getHabilidadeEspecial() != null) {
                        personagem.getHabilidadeEspecial().ativarHabilidade();
                    } else {
                        System.out.println("Nenhuma habilidade especial cadastrada ou nenhum personagem cadastrado.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);

        sc.close();
    }
}
