package br.com.fiap.heranca;

import br.com.fiap.heranca.model.Bebida;

public class TestandoHeranca {
    public static void main(String[] args) {

        Bebida bebida = new Bebida("Suco de laranja", "Água, laranja, gelo, açúcar",
                7.85, 500);

        System.out.println(bebida.getResumo());

//        System.out.printf(
//                "A bebida informada foi: %s%n" +
//                "É composta por: %s%n" +
//                "Custa: R$ %.2f%n" +
//                "Seu tamanho: %d ml %n%n",
//                bebida.getNome(), bebida.getIngredientes(), bebida.getPreco(), bebida.getTamanho());

        // Podemos configurar o códido para que os atributos sejam definidos através dos métodos de cofiguração (setters)

        Bebida bebida2 = new Bebida();
        bebida2.setNome("Suco de Acerola");
        bebida2.setIngredientes("Água, acerola, gelo, açúcar");
        bebida2.setPreco(8.50);
        bebida2.setTamanho(600);

//        System.out.printf(
//                "A bebida informada foi: %s%n" +
//                 "É composta por: %s%n" +
//                 "Custa: R$ %.2f%n" +
//                 "Seu tamanho: %d ml %n",
//                bebida2.getNome(), bebida2.getIngredientes(), bebida2.getPreco(), bebida2.getTamanho());

        System.out.println(bebida2.getResumo());;
    }
}
