public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int soma = a + b; // 10 + 3 = 13
        int subtracao = a - b; //10 - 3 = 7
        int multiplicacao = a * b; // 10 * 3 = 30
        int divisao = a / b; // 10 / 3 = 3 (cuidado, a divisão por números inteiros descarta as casas decimais)
        int modulo = a % b; // 10 % 3 = 1 (resto da divisão)
        int incremento = a++; // 10 + 1 = 11
        int decremento = a--; //10 - 1 = 9

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(incremento);
        System.out.println(decremento);

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
