package br.com.fiap.heranca.model;

public class Cliente extends Pessoa {

    @Override
    public void cumprimentar() {
        System.out.printf("Olá %s, esse é um exemplo de Sobrescrita!%n", getNome()); // comportamento da classe filha
        super.cumprimentar(); // comportamento da superclasse - Classe Mãe
    }

    public void cumprimentar(String msg) {
        System.out.printf("%nOlá %s, %s%n", getNome(), msg);
    }
}
