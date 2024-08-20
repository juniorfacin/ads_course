public class HabilidadeEspecial {
    String nomeHabilidade;
    int custoEnergia;
    boolean habilitada;

    public HabilidadeEspecial(String nomeHabilidade, int custoEnergia, boolean habilitada) {
        this.nomeHabilidade = nomeHabilidade;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }

    public void ativarHabilidade() {
        habilitada = true;
        System.out.println("Habilidade ativada com sucesso!");
    }
}