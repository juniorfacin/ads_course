public class Tabuada {

    public static void main(String[] args) {

        int resultado = 0;

        System.out.println("Bem-vindo à Tabuada!");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Tabuada do %d:%n", i);
            for(int j = 1; j <= 10; j++) {
                resultado = i * j;
                System.out.printf("%d x %d:%n ",i, j, resultado);
            }
        }
    }
}
