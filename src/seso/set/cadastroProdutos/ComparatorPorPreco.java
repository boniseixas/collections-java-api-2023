package seso.set.cadastroProdutos;

import java.util.Comparator;

/*
Classe criada para fazer a comparação dos produtos por preco, quando for invocado o método exibirProdutoPorPreco().
Por isso implemeta a interface Comparator<>
 */
public class ComparatorPorPreco implements Comparator<Produto> {

    //compara produtos por preços
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
