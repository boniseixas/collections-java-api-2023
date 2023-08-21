package seso.map.contagemPalavras;


/*
2. Contagem de Palavras
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
 */

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for(Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            contagemTotal += entry.getValue();
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if(entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }
}
