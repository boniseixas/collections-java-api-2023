package seso.set.agendaContatos;

import java.util.HashSet;
import java.util.Set;

/*
Exercício resolvido por Cami
Pesquisa em Conjunto
1. Agenda de Contatos
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo.
Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

adicionarContato(String nome, int numero): Adicione um contato à agenda.
exibirContatos(): Exibe todos os contatos da agenda.
pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna um conjunto com os contatos encontrados.
atualizarNumeroContato(String nome, int novoNumero): Atualize o número de telefone de um contato específico.
 */

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        contatoSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                break;
            }
        }
        return contatoAtualizado;
    }
}
