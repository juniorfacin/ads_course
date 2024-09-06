import java.util.Scanner;

public class SistemaPedidoCafe {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Café do Java!");
        System.out.println("Escolha o tamanho do seu café: (P) Pequeno, (M) Médio, (G) Grande");
        String tamanho = sc.nextLine().toUpperCase();

        System.out.println("Escolha o tipo de café: (E) Expresso, (C) Cappuccino, (L) Latte");
        String tipoCafe = sc.nextLine().toUpperCase();

        double preco = 0;

        switch (tamanho) {
            case "P":
                preco += 2.50;
                break;
            case "M":
                preco += 3.00;
                break;
            case "G":
                preco += 3.50;
                break;
            default:
                System.out.println("Opção de tamanho inválido!");
        }

        switch (tipoCafe) {
            case "E":
                preco += 1.50;
                break;
            case "C":
                preco += 2.00;
                break;
            case "L":
                preco += 2.50;
                break;
            default:
                System.out.println("Opção de café inválido.");
        }

        System.out.println("Seu pedido foi confirmado!");
        System.out.printf("O total à pagar será %.2f%n", preco);
    }
}
