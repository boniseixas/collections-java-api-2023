package seso.list.carrinhoDeCompra;

import java.util.ArrayList;
import java.util.List;

/*
Primeiro desafio proposto pro Cami:
2. Carrinho de Compras:
Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens.
Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

adicionarItem(String nome, double preco, int quantidade): Adicione um item ao carrinho com o nome, preço e quantidade especificados.
removerItem(String nome): Remove um item do carrinho com base no seu nome.
calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e preços.
 */
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
