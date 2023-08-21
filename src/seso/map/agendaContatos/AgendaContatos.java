package seso.map.agendaContatos;

import java.util.HashMap;
import java.util.Map;

/*
1. Agenda de Contatos
Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos.
Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
 */

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("Nome não encontrado!!");
        }
    }

    public void exibirContatos() {
        if(!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("Lista está vazia!!");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("Lista está vazia!!");
        }
        return numeroPorNome;
    }
}
