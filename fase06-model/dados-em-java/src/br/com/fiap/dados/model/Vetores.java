package br.com.fiap.dados.model;

public class Vetores {
    public static void main(String[] args) {

        int[] meuVetor = {10, 20, 30, 40, 50}; // Inicializando o vetor com valores

        System.out.println("Valor do índice 2: " + meuVetor[2]);

        meuVetor[2] = 35;

        for (int i = 0; i < meuVetor.length; i++) {
            System.out.println("[" + i + "] = " + meuVetor[i]);
        }

        int[] novoVetor = new int[5]; // Inicilaizando um novo vetor com 5 posições com valor default = 0
        for (int i = 0; i < novoVetor.length; i++) {
            System.out.println("[" + i + "] = " + novoVetor[i]);
        }
    }
}
