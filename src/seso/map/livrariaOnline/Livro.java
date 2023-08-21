package seso.map.livrariaOnline;

/*
2. Livraria Online
Crie uma classe chamada "LivrariaOnline" que representa uma livraria online.
Essa classe utiliza um Map para armazenar os livros disponíveis na livraria,
utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor.

A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

adicionarLivro(Livro livro): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
removerLivro(String titulo): Remova um livro da livraria, dado o título do livro.
exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
obterLivroMaisCaro(): Retornar o livro mais caro disponível na livraria.
exibirLivroMaisBarato(): Retornar o livro mais barato disponível na livraria.
*/

public class Livro implements Comparable<Livro> {
    //atributos
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Livro l) {
        return Double.compare(preco, l.getPreco());
    }
}
