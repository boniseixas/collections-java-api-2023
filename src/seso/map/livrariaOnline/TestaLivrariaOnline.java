package seso.map.livrariaOnline;

public class TestaLivrariaOnline {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3JjrxJl", new Livro("1984", "George Orwell", 19.60d));
        livrariaOnline.adicionarLivro("https://amzn.to/3PmYFnb", new Livro("Caixa de Pássaros - Bird Box: Não abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/43Sfzi0", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 26.90d));

        System.out.println(livrariaOnline.exibirLivrosOrdenadoPorPreco());

        System.out.println(livrariaOnline.exibirLivroMaisBarato());

    }
}
