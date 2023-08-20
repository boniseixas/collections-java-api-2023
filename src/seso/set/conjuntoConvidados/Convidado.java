package seso.set.conjuntoConvidados;

import java.util.Objects;

/*
Primeiro desafio da Collections Set, resolvido por Cami
1. Conjunto de Convidados
Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.
removerConvidadoPorCodigoConvite(String codigoConvite): Retire um convidado do conjunto com base no código do convite.
contarConvidados(): Conta o número total de convidados no Set.
exibirConvidados(): Exibe todos os convidados do conjunto.
 */

public class Convidado {
    //atributo
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    //método equals() and hashCode, verifica o código do convite se é único, impede de ter código de convite duplicado.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
