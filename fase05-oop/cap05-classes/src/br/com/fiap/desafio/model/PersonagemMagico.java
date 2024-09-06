package br.com.fiap.desafio.model;

public class PersonagemMagico {

    private String nome;
    private String poderMagico;
    private int nivelEnergia;
    private HabilidadeEspecial habilidadeEspecial;

    public PersonagemMagico(String nome, String poderMagico, int nivelEnergia) {
        this.nome = nome;
        this.poderMagico = poderMagico;
        this.nivelEnergia = nivelEnergia;
    }

    public String getNome() {
        return nome;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public HabilidadeEspecial getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public void setHabilidadeEspecial(HabilidadeEspecial habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void atacar(String ataque) {
        if (nivelEnergia >= 10) {
            System.out.printf("%s realizou o ataque: %s!%n", nome, ataque);
            nivelEnergia -= 10;
        } else {
            System.out.printf("%s está sem energia para atacar.%n", nome);
        }
    }

    public int aumentarEnergia(int energia) {
        nivelEnergia += energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if (habilidadeEspecial == null || !habilidadeEspecial.isHabilitada()) {
            System.out.println("Habilidade especial não habilitada!");
        } else if (nivelEnergia >= habilidadeEspecial.getCustoEnergia()) {
            System.out.printf("A habilidade %s foi ativada!%n", habilidadeEspecial.getNomeHabilidade());
            nivelEnergia -= habilidadeEspecial.getCustoEnergia();
        } else {
            System.out.printf("%s está sem energia para habilidade especial!%n", nome);
        }
    }
}
