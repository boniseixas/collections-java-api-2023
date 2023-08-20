package seso.set.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

/*
Primeiro desafio da Collections Set, resolvido por Cami
1. Conjunto de Convidados
Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.
removerConvidadoPorCodigoConvite(String codigoConvite): Retire um convidado do conjunto com base no código do convite.
contarConvidados(): Conta o número total de convidados no Set.
exibirConvidados(): Exibe todos os convidados do conjunto.
 */
public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado removendoConvidado = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                removendoConvidado = c;
                break;
            }
        }
        convidadoSet.remove(removendoConvidado);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println(convidadoSet);
    }
}
