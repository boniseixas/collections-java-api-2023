package seso.map.dicionario;

public class TestaDicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Computador", "dispositivo eletrônico que administra informações ou dados");
        dicionario.adicionarPalavra("Dicionário", "vocábulos de uma língua");
        dicionario.adicionarPalavra("Xícara", "Pequeno recipiente para tomar chá ou outra bebida");

        dicionario.exibirPalavras();
        System.out.println("A definição de xícara e " + dicionario.pesquisarPorPalavra("Xícara"));

        dicionario.removerPalavra("Computador");
        dicionario.exibirPalavras();
    }
}
