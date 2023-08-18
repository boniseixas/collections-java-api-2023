package list.operacoesBasicas.carrinhodecompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    //constructor instancia um novo objeto
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    //methods
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itens.isEmpty()) {
            for (Item i : itens) {
                if(i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itens.removeAll(itensParaRemover);

        } else {
            System.out.println("A lista está vazia!! Começe a comprar!!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if(!itens.isEmpty()) {
            for (Item item : itens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!!");
        }
    }

    public void exibirItens() {
        if(!itens.isEmpty()) {
            System.out.println(this.itens);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itens +
                '}';
    }
}
