import java.util.ArrayList;
import java.util.Random;

public class SistemaDeNotas {
    public static void main(String[] args) {
        
        Random geradorAleatorio = new Random();
        ArrayList<Integer> listaDeNotas = new ArrayList<>();

        int somaDasNotas= 0;

        for (int i = 0; i < 10; i++) {
           int notaAleatoria = geradorAleatorio.nextInt(10) + 1;
           listaDeNotas.add(notaAleatoria);
           somaDasNotas += notaAleatoria; 
        }

        System.out.println("Lista de Notas: " + listaDeNotas);

        double mediaDasNotas = (double) somaDasNotas / listaDeNotas.size();
        System.out.println("Média das notas: " + mediaDasNotas);
        }
    }

