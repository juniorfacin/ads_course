package br.com.fiap.dados.listas;

import java.util.List;
import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
       // Declaração de inicialização de um ArrayList de Stings
        List<String> frutas = new ArrayList<>();

        // Adicionando elemento à lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Morango");

        System.out.printf("Lista de Frutas: %s%n", frutas);
    }
}
