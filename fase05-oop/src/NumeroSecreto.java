import java.util.Random;
import java.util.Scanner;


public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(20) + 1; // Gera um número aleatório entre 1 e 20
        System.out.println("Bem-vindo ao jogo de adivinhação");
        System.out.println("Tente advinhar o número entre 1 e 20");

        int tentativas = 0;
        boolean adivinhou = false;

        while (!adivinhou) {
            System.out.println("Digite o seu palpite: ");
            int tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa == numeroSecreto) {
                System.out.printf("Parabéns, você acertou o número em %d tentativas!", tentativas);
                adivinhou = true;
            } else if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
        scanner.close();

    }   
}
