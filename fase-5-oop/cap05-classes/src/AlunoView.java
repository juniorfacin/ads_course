import java.util.Scanner;

public class AlunoView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = null;

        int op;

        do {
            System.out.println("\nEscolha uma opção: \n1-Cadastrar Aluno \n2-Exibir Aluno \n3-Sair");
            op = sc.nextInt();
            sc.nextLine(); // Consome a nova linha após o número

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do Aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a Matricula do Aluno: ");
                    int matricula = sc.nextInt();
                    sc.nextLine(); // Consome a nova linha após o número

                    aluno = new Aluno(nome, matricula);

                    System.out.println("Digite o Logradouro do Aluno: ");
                    String logradouro = sc.nextLine();
                    System.out.println("Número: ");
                    int numero = sc.nextInt();
                    sc.nextLine(); // Consome a nova linha após o número
                    System.out.println("Cidade: ");
                    String cidade = sc.nextLine();
                    System.out.println("Estado: ");
                    String estado = sc.nextLine();
                    System.out.println("CEP: ");
                    String cep = sc.nextLine();

                    Endereco endereco = new Endereco(logradouro, numero, cidade, estado, cep);

                    aluno.endereco = endereco;
                    break;
                case 2:
                    if (aluno != null) {
                        System.out.printf("Nome: %s%n", aluno.nome);
                        System.out.printf("Matricula: %d%n", aluno.matricula);

                        if (aluno.endereco != null) {
                            System.out.printf("Endereço: %s, n: %d, %s, %s, CEP: %s%n",
                                    aluno.endereco.logradouro,
                                    aluno.endereco.numero,
                                    aluno.endereco.cidade,
                                    aluno.endereco.estado,
                                    aluno.endereco.cep);
                        } else {
                            System.out.println("Endereço não cadastrado.");
                        }
                    } else {
                        System.out.println("Nenhum aluno cadastrado ainda.");
                    }
                    break;
                case 3:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 3);

        sc.close();
    }
}
