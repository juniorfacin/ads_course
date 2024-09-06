import java.util.Scanner;

public class DesafioIntegrado {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número para X: ");
    int x = sc.nextInt();

    System.out.println("Digite um número para Y: ");
    int y = sc.nextInt();

    int soma = x + y;
    int subtracao = x - y;
    int multiplicacao = x * y;
    int divisao = x / y;

    // usando o prinf para formação de strings
    System.out.printf("Soma: %d%n Subtração: %d%n Multiplicação: %d%n Divisão: %d%n \n", soma, subtracao, multiplicacao, divisao);

    System.out.println("Digite a Nota 1: ");
    double nota1 = sc.nextDouble();

    System.out.println("Digite a Nota 2: ");
    double nota2 = sc.nextDouble();

    double media = (nota1 + nota2) / 2;

    System.out.printf("A média do aluno foi: %.2f%n", media);

    }
}

