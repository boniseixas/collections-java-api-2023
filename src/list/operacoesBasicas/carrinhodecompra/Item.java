package list.operacoesBasicas.carrinhodecompra;

public class Item {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    //constructor
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "nome:'" + nome + '\'' +
                ", preco: " + preco +
                ", quantidade: " + quantidade
                ;
    }

    //método toString apenas com nome, preco e quantidade

//    @Override
//    public String toString() {
//        return nome + preco + quantidade;
//    }
}
