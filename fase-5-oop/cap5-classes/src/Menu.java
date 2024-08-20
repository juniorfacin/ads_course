import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
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
                    String poder =  sc.nextLine();
                    System.out.println("Digite o nível de energia");
                    int energia = sc.nextInt();
                    sc.nextLine();

                    personagem.nome = nome;
                    personagem.poderMagico = poder;
                    personagem.nivelEnergia = energia;

                    System.out.println("Digite o nome da habilidade especial:");
                    String nomeHabilidade = sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a habilidade especial:");
                    int nivelEnergia = sc.nextInt();
                    sc.nextLine();
                    System.out.println("A habilidade está ativada? (true/false):");
                    boolean ativada = sc.nextBoolean();
                    sc.nextLine();

                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);

                    personagem.habilidadeEspecial = habilidadeEspecial;
                    break;
                case 2:
                    System.out.printf("Nome: %s" +
                                    "%nPoder: %s" +
                                    "%nNível de energia: %d%n",
                            personagem.nome,
                            personagem.poderMagico,
                            personagem.nivelEnergia);
                    System.out.printf("%nHabilidade: %s" +
                                    "%nCusto energia: %d" +
                                    "%nHabilitada: %b%n",
                            personagem.habilidadeEspecial.nomeHabilidade,
                            personagem.habilidadeEspecial.custoEnergia,
                            personagem.habilidadeEspecial.habilitada);
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque: ");
                    String ataque = sc.nextLine();
                    personagem.atacar(ataque);
                    break;
                case 4:
                    System.out.println("Digite a quantiadade de energia: ");
                    int qtd = sc.nextInt();
                    int nivelEnergiaAtual = personagem.aumentarEnergia(qtd);
                    System.out.printf("Nível de energia atual: %d%n",nivelEnergiaAtual);
                    break;
                case 5:
                    personagem.ativarHabilidadeEspecial();
                    break;
                case 6:
                    personagem.habilidadeEspecial.ativarHabilidade();
                    break;
                case 0:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while(op != 0);

        sc.close();
    }
}