package list.operacoesBasicas.carrinhodecompra;

public class TestaCarrinhoDeCompra {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Carregador", 35.25 , 3);
        carrinhoDeCompras.adicionarItem("Relógio", 325.59 , 2);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.removerItem("Carregador");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

    }
}
