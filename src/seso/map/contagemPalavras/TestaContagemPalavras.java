package seso.map.contagemPalavras;

public class TestaContagemPalavras {
    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("Palavra 1", 2);
        palavras.adicionarPalavra("Palavra 2", 8);
        palavras.adicionarPalavra("Palavra 3", 1);
        palavras.adicionarPalavra("Palavra 4", 6);
        System.out.println("Existem " + palavras.exibirContagemPalavras() + " palavras.");
        System.out.println("A palavra mais frequente é: " + palavras.encontrarPalavraMaisFrequente());
    }
}
