package seso.map.estoqueProdutos;

public class TestaEstoqueProduto {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 1, 50.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 11.0);
        estoqueProdutos.adicionarProduto(3L, "Prudot C", 3, 10.00);
        estoqueProdutos.adicionarProduto(3L, "Produto D", 2, 4.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto com maior quanriade em valor no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
