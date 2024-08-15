import java.util.Scanner;

public class LeituraDadosExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        double precoProduto = sc.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int qtdProduto = sc.nextInt();

        System.out.println("Produto: " + nomeProduto + "\n"
                + "Preço: R$ " + precoProduto + "\n"
                + "Quantidade: " + qtdProduto);

        sc.close();
    }
}
