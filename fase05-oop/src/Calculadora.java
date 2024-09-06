import java.util.Scanner;

public class Calculadora {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Escolha uma opção: ");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão\n");

        int opcao = sc.nextInt();

        System.out.println("Digite os números: ");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double resultado = num1 + num2;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado da soma: %.2f%n", resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("Resultado da subtração: %.2f%n", resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("Resultado da multiplicação: %.2f%n");
                break;
            case 4:
                resultado = num1 / num2;
                System.out.printf("Resultado da divisão: %.2f%n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
