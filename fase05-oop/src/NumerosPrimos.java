import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo ao jogo dos Números Primos!");
            System.out.println("Digite um número para verificar se ele é primo ou não!");
            int numero = scanner.nextInt();

            if (numero <= 1) {
                System.out.println("Número inválido. Digite um número inteiro positivo maior que um!\n");
                continue;  // Reinicia o loop, pedindo um novo número
            }

            boolean isPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println("O número " + numero + " é um número primo!");
            } else {
                System.out.println("O número " + numero + " não é um número primo!");
            }

            break;  // Sai do loop após uma verificação válida
        }
    }
}
