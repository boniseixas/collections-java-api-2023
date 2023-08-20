package seso.set.cadastroProdutos;

public class TestaCadastroProdutos {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Biscoito", 15d, 5);
        cadastroProduto.adicionarProduto(2L, "Mel", 20d, 10);
        cadastroProduto.adicionarProduto(1L, "Sabão em pó", 10d, 2);
        cadastroProduto.adicionarProduto(4L, "Manga", 2d, 2);

        System.out.println(cadastroProduto.exibirProdutoPorNome());

        System.out.println(cadastroProduto.exibirProdutoPorPreco());
    }
}
