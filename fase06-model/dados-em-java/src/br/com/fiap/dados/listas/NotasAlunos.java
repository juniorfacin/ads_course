package br.com.fiap.dados.listas;

import java.util.Map;
import java.util.HashMap;

public class NotasAlunos {
    public static void main(String[] args) {
        Map<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Maria", 9.5);
        notasAlunos.put("João", 7.8);
        notasAlunos.put("Ana", 8.7);
        notasAlunos.put("Pedro", 5.4);

        // Acessando a nota de um aluno específico
        System.out.println("Nota de Ana: " + notasAlunos.get("Ana"));

        // Atualizando a nota de um aluno
        notasAlunos.put("Ana", 9.0);
        System.out.println("Nota atualizada de Ana: " + notasAlunos.get("Ana"));

        // Removendo um aluno do mapa
        notasAlunos.remove("Pedro");
        System.out.println("Mapa após a remoção de um Aluno: " + notasAlunos);

        // Iterando sobre o mapa para exibir todos os alunos e suas notas
        System.out.println("\nLista de Alunos e suas Notas");

        for(Map.Entry<String, Double> entrada : notasAlunos.entrySet()){
            // getKey para pegar a Strig (chave) e getValue para pegar o valor (Double)
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

}
