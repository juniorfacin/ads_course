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
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o preco do produto:");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.println("Digite a quantidade em estoque:");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    produto = new Produto(nome, preco, quantidade);
                    break;

                case 2:
                    if (produto != null) {
                        produto.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum produto cadastrado!");
                    }
                    break;

                // Outros cases para as demais funcionalidades...

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
