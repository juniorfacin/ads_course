package br.com.fiap.dados.listas;

import java.util.HashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {
        // Criação do conjunto usando HashSet
        Set<String> frutas = new HashSet<>();
        // Adicionando elementos ao conjunto
        System.out.println("Adicionando 'Maçã': " + frutas.add("Maçã"));
        System.out.println("Adicionando 'Banana': " + frutas.add("Banana"));
        System.out.println("Tentnado adicionar 'Maçã' novamente: " + frutas.add("Maçã"));

        System.out.println("Conjunto contém 'Banana': " + frutas.contains("Banana"));
        System.out.println("Conjunto contém 'Laranja': " + frutas.contains("Laranja"));

        System.out.println("Removendo'Banana': " + frutas.remove("Banana"));
        System.out.println("Tentando remover 'Laranja': " + frutas.remove("Laranja"));

        System.out.println("Número de elementos: " + frutas.size());

        System.out.println("Conjunto está vazio? " + frutas.isEmpty());

        // Como não existe índice, usar um for normal
        for (String item : frutas) {
            System.out.println(item);
        }

        frutas.clear();
        System.out.printf("Conjunto após limpar: %s\n", frutas);
        System.out.println("Conjunto está vazio? " + frutas.isEmpty());

    }
}
