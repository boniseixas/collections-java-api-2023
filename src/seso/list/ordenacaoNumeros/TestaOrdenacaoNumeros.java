package seso.list.ordenacaoNumeros;

public class TestaOrdenacaoNumeros {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        //ordenacaoNumeros.exibirNumeros();
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(13);
        ordenacaoNumeros.adicionarNumero(1);

        ordenacaoNumeros.exibirNumeros();
        System.out.println(" A ordem decrescente: " + ordenacaoNumeros.ordenarDescendente());
        System.out.println("A ordem crescente: " + ordenacaoNumeros.ordenarAscendente());
    }
}
