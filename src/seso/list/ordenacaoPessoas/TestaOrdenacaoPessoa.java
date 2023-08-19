package seso.list.ordenacaoPessoas;

public class TestaOrdenacaoPessoa {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Miguelhito", 23, 1.49);
        ordenacaoPessoas.adicionarPessoa("Galerito", 31, 1.79);
        ordenacaoPessoas.adicionarPessoa("Carlos", 40, 1.72);
        ordenacaoPessoas.adicionarPessoa("Silvia", 19, 1.57);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
