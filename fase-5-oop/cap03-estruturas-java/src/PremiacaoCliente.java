import java.util.Scanner;

public class PremiacaoCliente {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double gastos;
    int qtdCompras;

    System.out.println("Valor gasto em compras: ");
    gastos = sc.nextDouble();

    System.out.println("Quantidade de compras: ");
    qtdCompras = sc.nextInt();

    if (gastos >= 2000.0 && qtdCompras > 10) {
        System.out.println("Categoria VIP: voucher de desconto!");
    } else if (gastos >= 1000.0) {
        System.out.println("Categoria Ouro: pontos extras no programa de fidelidade.");
    } else if (gastos >= 500.0 || qtdCompras > 5) {
        System.out.println("Categoria Prata: brinde especial!");
    } else {
        System.out.println("Categoria Bronze: não há premiações para essa categoria.");
     }
    }
}
