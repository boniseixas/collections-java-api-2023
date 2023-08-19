package seso.list.somaNumeros;

public class TestaSomaNumeros {
    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.exibirNumeros();
        soma.adicionarNumero(20);
        soma.adicionarNumero(5);
        soma.adicionarNumero(23);
        soma.adicionarNumero(33);
        soma.adicionarNumero(3);
        soma.adicionarNumero(6);

        System.out.println("A soma dos elementos é " + soma.calcularSoma());
        soma.exibirNumeros();

        System.out.println("O menor valor encontrado é: " + soma.encontrarMenorNumero());
        System.out.println("O maior valor encontrado é: " + soma.encontrarMaiorNumero());
    }
}
