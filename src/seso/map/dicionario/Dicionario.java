package seso.map.dicionario;

import java.util.HashMap;
import java.util.Map;

/*
2. Dicionário
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições.
Implemente os seguintes métodos:

adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.

 */

public class Dicionario {
    //atributo
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada");
        }
    }

    public void exibirPalavras() {
        if(!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Dicionário está vazio!!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPalavra = null;
        if(!dicionarioMap.isEmpty()) {
            definicaoPalavra = dicionarioMap.get(palavra);
        } else {
            System.out.println("Palavra não encontrada");
        }
        return definicaoPalavra;
    }
}
