public class Item {
    String nome;
    String descricao;
    boolean itemRaro;
    int nivelPoder;

    public Item (String nome, String descricao, boolean itemRaro, int nivelPoder) {
        this.nome = nome;
        this.descricao = descricao;
        this.itemRaro = itemRaro;
        this.nivelPoder = nivelPoder;
    }
}