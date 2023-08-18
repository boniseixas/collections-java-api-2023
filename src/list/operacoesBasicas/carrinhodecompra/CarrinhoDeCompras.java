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
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itens) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public List<Double> calcularValorTotal() {
        List<Double> valorTotal = new ArrayList<>();
        for (Item i : itens) {
            valorTotal.add(i.getPreco() * i.getQuantidade());
        }
        System.out.println(valorTotal);
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itens);
    }
}
