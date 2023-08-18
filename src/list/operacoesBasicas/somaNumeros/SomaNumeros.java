package list.operacoesBasicas.somaNumeros;

import java.util.ArrayList;
import java.util.List;
/*
Segundo Desafio, proposto por Cami:
2. Soma de Números
Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista de números.
calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
encontrarMaiorNumero(): Encontra o número maior na lista e retorna o valor.
encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
 */
public class SomaNumeros {
    //atibuto
    private List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosInteiros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if(!numerosInteiros.isEmpty()) {
            for(Integer num : numerosInteiros) {
                soma += num;
            }
            return soma;
        } else {
            throw new RuntimeException(("Não existem números nesta lista, por favor adicione!!"));
        }
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if(!numerosInteiros.isEmpty()) {
            for(Integer num : numerosInteiros) {
                if(num >= maiorNumero) {
                    maiorNumero = num;
                }
            }
            return  maiorNumero;
        } else {
            throw new RuntimeException("Não existem numeros nesta lista!!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosInteiros.isEmpty()) {
            for(Integer num : numerosInteiros) {
                if(num <= menorNumero) {
                    menorNumero = num;
                }
            }
            return  menorNumero;
        } else {
            throw new RuntimeException("Não existem numeros nesta lista!!");
        }
    }

    public void exibirNumeros() {
        if(!numerosInteiros.isEmpty()) {
            System.out.println(this.numerosInteiros);
        } else {
            System.out.println("Não existem numeros nesta lista!!");
        }
    }
}
