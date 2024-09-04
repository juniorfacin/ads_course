public class PersonagemMagico {

    String nome;
    String poderMagico;
    int nivelEnergia;

    HabilidadeEspecial habilidadeEspecial;

    public PersonagemMagico() {
    }

    public PersonagemMagico(String nome) {this.nome = nome;}

    public void atacar(String ataque) {
        if (nivelEnergia >= 10 ) {
            System.out.printf("%s realizou o ataque: %s!%n", nome, ataque);
            nivelEnergia -= 10;
        } else {
            System.out.printf("%s está sem energia para atacar.", nome);
        }
    }

    public int aumentarEnergia(int energia) {
        nivelEnergia += energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if (!habilidadeEspecial.habilitada) {
            System.out.println("Habilidade especial não habilitada!");
        } else if (nivelEnergia >= habilidadeEspecial.custoEnergia) {
            System.out.printf("A habilidade %s foi ativada!%n", habilidadeEspecial.nomeHabilidade);
            nivelEnergia -= habilidadeEspecial.custoEnergia;
        } else {
            System.out.printf("%s está sem energia para habilidade especial!%n", nome);
        }
    }
}