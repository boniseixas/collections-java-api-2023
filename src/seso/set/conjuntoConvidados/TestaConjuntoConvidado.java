package seso.set.conjuntoConvidados;

public class TestaConjuntoConvidado {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados no Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Marcela", 1234);
        conjuntoConvidados.adicionarConvidado("Baleia", 1235);
        conjuntoConvidados.adicionarConvidado("Caramelo", 1235);
        conjuntoConvidados.adicionarConvidado("Corrida", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " no Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " no Set de Convidados");

        conjuntoConvidados.exibirConvidado();
    }
}
