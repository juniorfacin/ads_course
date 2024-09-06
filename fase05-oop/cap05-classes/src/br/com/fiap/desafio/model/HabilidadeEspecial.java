package br.com.fiap.desafio.model;

public class HabilidadeEspecial {
    private String nomeHabilidade;
    private int custoEnergia;
    private boolean habilitada;

    public HabilidadeEspecial(String nomeHabilidade, int custoEnergia, boolean habilitada) {
        this.nomeHabilidade = nomeHabilidade;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public int getCustoEnergia() {
        return custoEnergia;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void ativarHabilidade() {
        // Implementar se necessário
    }
}
