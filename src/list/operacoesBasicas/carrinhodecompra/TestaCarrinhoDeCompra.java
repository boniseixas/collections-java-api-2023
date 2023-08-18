package list.operacoesBasicas.carrinhodecompra;

public class TestaCarrinhoDeCompra {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Carregador", 35.25 , 3);
        carrinhoDeCompras.adicionarItem("Relógio", 325.59 , 2);
        carrinhoDeCompras.adicionarItem("Refrigerante", 9d, 8);
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Carregador");
        carrinhoDeCompras.exibirItens();

        System.out.println("Agora o valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());

    }
}
