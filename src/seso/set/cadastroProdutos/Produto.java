package seso.set.cadastroProdutos;

/*
Desafio resolvido por Cami
Ordenação em Conjunto
1. Cadastro de Produtos
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo.
Cada produto possui atributos como nome, bacalhau, preço e quantidade. Implemente os seguintes métodos:

adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.
 */

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    //atributos
    private String nome;
    private long codigoProduto;
    private double preco;
    private int quantidade;

    public Produto(long codigoProduto, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //compara por nome do produto
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigoProduto() == produto.getCodigoProduto();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoProduto());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigoProduto=" + codigoProduto +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
