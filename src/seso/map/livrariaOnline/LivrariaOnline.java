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

import java.util.*;

public class LivrariaOnline {
    //atibuto
    private Map<String, Livro> livrariaOnlineMap;

    public LivrariaOnline() {
        this.livrariaOnlineMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livrariaOnlineMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        Livro removendoLivro = null;
        for(Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
            if(entry.getValue().getTitulo().equals(titulo)) {
                removendoLivro = entry.getValue();
                break;
            }
        }
        if(removendoLivro != null) {
            livrariaOnlineMap.remove(removendoLivro);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadoPorPreco() {
        return new TreeMap<>(livrariaOnlineMap);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Set<Map.Entry<String, Livro>> setLivroPorAutor = new TreeSet<>(new ComparatorPorAutor());
        for(Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
            if(entry.getValue().getAutor().equals(autor)) {
                setLivroPorAutor.add(entry);
            }
        }
        Map<String, Livro> LivroPorAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : setLivroPorAutor) {
            LivroPorAutor.put(entry.getKey(), entry.getValue());
        }
        return LivroPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = -1;
        for(Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
            Livro livro = entry.getValue();
            if(livro.getPreco() > maiorPreco) {
                maiorPreco = livro.getPreco();
                livroMaisCaro = livro;
            }
        }
        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = -1;
        for(Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
            Livro livro = entry.getValue();
            if(livro.getPreco() < menorPreco) {
                menorPreco = livro.getPreco();
                livroMaisBarato = livro;
            }
        }
        return livroMaisBarato;
    }

}
