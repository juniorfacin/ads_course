import java.util.Scanner;

public class ValidacaoIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
