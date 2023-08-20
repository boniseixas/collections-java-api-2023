package seso.set.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

/*
Segundo desafio da Colllections Set, proposto por Cami
2. Conjunto de Palavras Únicas
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
removerPalavra(String palavra): Remova uma palavra do conjunto.
verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
 */
public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> conjuntoPalavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicasSet = new HashSet<>();
    }

    public Set<String> getConjuntoPalavrasUnicasSet() {
        return conjuntoPalavrasUnicasSet;
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!conjuntoPalavrasUnicasSet.isEmpty()) {
            if(getConjuntoPalavrasUnicasSet().contains(palavra)) {
                conjuntoPalavrasUnicasSet.remove(palavra);
            }
        } else {
            System.out.println("Conjunto de palavras está vazio, por favor adicione palavras!!");
        }
    }

    public void verificarPalavra(String palavra) {
        if(!conjuntoPalavrasUnicasSet.isEmpty()) {
            if(conjuntoPalavrasUnicasSet.contains(palavra)) {
                System.out.println(palavra);
            } else {
                System.out.println("A palavra " + palavra + " não está contida na lista");
            }
        } else {
            System.out.println("Conjunto de palavras está vazio, por favor adicione palavras!!");
        }
    }

    public void exbirPalavrasUnicas() {
        if(!conjuntoPalavrasUnicasSet.isEmpty()) {
            System.out.println(conjuntoPalavrasUnicasSet);
        } else {
            System.out.println("Conjunto de palavras está vazio, por favor adicione palavras!!");
        }
    }
}
