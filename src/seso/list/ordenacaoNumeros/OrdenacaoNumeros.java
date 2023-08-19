package seso.list.ordenacaoNumeros;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Desafio proposto por Cami
2. Ordenação de Números
Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo.
Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista.
ordenarAscendente(): Ordena os números da lista em ordem ascendente usando uma interface Comparable ea class Collections.
ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable ea class Collections.
 */
public class OrdenacaoNumeros {
    private List<Integer> num;

    public OrdenacaoNumeros() {
        this.num = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.num.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosEmOrdemCrescente = new ArrayList<>(this.num);
        if(!num.isEmpty()) {
            Collections.sort(numerosEmOrdemCrescente);
            return numerosEmOrdemCrescente;
        } else {
            throw new RuntimeException("Não existem números para ordenar");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosEmOrdemDecrescente = new ArrayList<>(this.num);
        if(!num.isEmpty()) {
            numerosEmOrdemDecrescente.sort(Collections.reverseOrder());
            return numerosEmOrdemDecrescente;
        } else {
            throw new RuntimeException("Não existem numeros ordenar");
        }
    }

    public void exibirNumeros() {
        if(!num.isEmpty()) {
           System.out.println(this.num);
        } else {
            System.out.println("Não existem numeros para exibir, Por favor adicione numeros!!");
        }
    }
}
