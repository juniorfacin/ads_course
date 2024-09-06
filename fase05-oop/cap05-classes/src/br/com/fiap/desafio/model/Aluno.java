package br.com.fiap.desafio.model;

public class Aluno {
    private String nome;
    private int matricula;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
}
