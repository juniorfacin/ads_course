package br.com.fiap.heranca;

import br.com.fiap.heranca.model.Funcionario;
import br.com.fiap.heranca.model.Cliente;


public class Principal {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setNome("Júnior");
        f1.setEmail("juniordev@email.com");
        f1.setTelefone("18 98125-4455");
        f1.setCargo("Desenvolver JR");
        f1.setSalario(3000.00);

        System.out.printf(
                "Nome %s%n" +
                "E-mail: %s%n" +
                "Telefone: %s%n" +
                "Cargo: %s%n" +
                "Salário: R$ %.2f%n", f1.getNome(), f1.getEmail(), f1.getTelefone(), f1.getCargo(), f1.getSalario());

        // Pessoa p1 = new Pessoa(); Pessoa é uma classe abstrada e não pode ser instanciada.

        Cliente c1 = new Cliente();
        c1.setNome("Bia");
        c1.setEmail("biamedica@email.com");
        c1.setTelefone("18 98125-5588");


        System.out.printf(
                "Nome %s%n" +
                 "E-mail: %s%n" +
                 "Telefone: %s%n %n", c1.getNome(), c1.getEmail(), c1.getTelefone());

        c1.cumprimentar();
        c1.cumprimentar("esse é um exemplo de Sobrecarga!");


    }
}
