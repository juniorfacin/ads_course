import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo(a) ao Jogo da Adivinhação!");

        Random random = new Random();
        int numeroSecreto = random.nextInt(20) + 1; // Gera um número entre 1 e 20
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número secreto entre 1 e 20!");

        do {
            System.out.println("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.printf("Parabéns! Você acertou o número secreto: %d%n", numeroSecreto);
            } else if (palpite > numeroSecreto) {
                System.out.println("Ops, tente um número menor.");
            } else {
                System.out.println("Ops, tente um número maior.");
            }
        } while (palpite != numeroSecreto);

        System.out.printf("Você acertou o número secreto em %d tentativas!%n", tentativas);
    }
}