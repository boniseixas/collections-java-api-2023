package seso.set.listaTarefas;

import java.util.HashSet;
import java.util.Set;

/*
Desafio proposto por Cami
2. Lista de Tarefas
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa
possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os
seguintes métodos:

adicionarTarefa(Tarefa tarefa): Adiciona uma nova tarefa ao Set.
removerTarefa(String descricao): Remova uma tarefa do Set de acordo com a descrição, se estiver presente.
exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
contarTarefas(): Conta o número total de tarefas na lista de tarefas.
obterTarefasConcluidas(): Retornar um Set com tarefas concluídas.
obterTarefasPendentes(): Retornar um Set com tarefas pendentes.
marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
limparListaTarefas(): Remova todas as tarefas da lista de tarefas.
 */

public class ListaTarefas {
    //atributo
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public Set<Tarefa> getTarefaSet() {
        return tarefaSet;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefaSet.add(tarefa);
    }

    public void removerTarefa(String tarefa) {
        Tarefa removendoTarefa = null;
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t : tarefaSet) {
                if(t.getDescricaoTarefa().equalsIgnoreCase(tarefa)) {
                    removendoTarefa = t;
                    break;
                }
            }
            tarefaSet.remove(removendoTarefa);
        } else {
            System.out.println("Não há tarefas para remover!!");
        }

        if(removendoTarefa == null) {
            System.out.println("Ops! Tarefa não encontrada!!");
        }

    }

    public void exibirTarefas() {
        if(!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Não existem tarefas para exibir");
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tc : tarefaSet) {
            if(tc.isTarefaRealizada()) {
                tarefasConcluidas.add(tc);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tp : tarefaSet) {
            if(!tp.isTarefaRealizada()) {
                tarefasPendentes.add(tp);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa tc : tarefaSet) {
            if(tc.getDescricaoTarefa().contains(descricao)) {
                tc.setTarefaRealizada(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa marcandoTarefaComoPendente = null;
        for (Tarefa tp : tarefaSet) {
            if(tp.getDescricaoTarefa().contains(descricao)) {
                marcandoTarefaComoPendente = tp;
                break;
            }
        }

        if(marcandoTarefaComoPendente != null) {
            marcandoTarefaComoPendente.setTarefaRealizada(true);
            System.out.println("Tarefa marcada como pendente: " + marcandoTarefaComoPendente.getDescricaoTarefa());
        } else {
            System.out.println("Tarefa não encontrada!!");
        }
    }

    public void limparListaTarefas() {
        if(!tarefaSet.isEmpty()) {
            tarefaSet.clear();
        } else {
            System.out.println("A lista está vazia");
        }
    }
}
