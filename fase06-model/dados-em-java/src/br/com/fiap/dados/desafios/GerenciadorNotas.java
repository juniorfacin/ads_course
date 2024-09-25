package br.com.fiap.dados.desafios;

public class GerenciadorNotas {
    public static void main(String[] args) {

        double[] notasAluno = {7.5, 8.0, 9.0, 6.5, 8.0};
        double somaNotas = 0;

        for (int i = 0; i < notasAluno.length; i++) {
            somaNotas += notasAluno[i];
        }

        double mediaNotas = somaNotas / notasAluno.length;

        System.out.println("A média do aluno: " + mediaNotas);
        if (mediaNotas >= 7) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
