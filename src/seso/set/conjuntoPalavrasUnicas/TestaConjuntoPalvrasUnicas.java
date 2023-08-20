package seso.set.conjuntoPalavrasUnicas;

public class TestaConjuntoPalvrasUnicas {

    public static void main(String[] args) {
    ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();
    //palavras.verificarPalavra("Pai");
    palavras.adicionarPalavra("Mãe");
    palavras.adicionarPalavra("Pai");
    palavras.adicionarPalavra("Filho");
    palavras.adicionarPalavra("Santo");
    palavras.adicionarPalavra("Mãe");
    palavras.verificarPalavra("mae");
    palavras.exbirPalavrasUnicas();

    palavras.removerPalavra("Filho");
    palavras.exbirPalavrasUnicas();

    }


}
