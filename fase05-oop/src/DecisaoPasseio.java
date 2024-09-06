import java.util.Scanner;

public class DecisaoPasseio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ensolarado, finalDeSemana;

        System.out.println("Está ensolarado? (true para sim / false para não");
        ensolarado = sc.nextBoolean();

        System.out.println("É fim de semana? (true para sim / false para não");
        finalDeSemana = sc.nextBoolean();

        if (ensolarado && finalDeSemana) {
            System.out.println("Vamos à praia aproveitar o sol!");
        }
    }
}
