package seso.set.listaTarefas;

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

public class Tarefa {
    //atributo
    private String descricaoTarefa;
    private boolean tarefaRealizada;

    public Tarefa(String descricaoTarefa, boolean tarefaRealizada) {
        this.descricaoTarefa = descricaoTarefa;
        this.tarefaRealizada = tarefaRealizada;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public boolean isTarefaRealizada() {
        return tarefaRealizada;
    }

    public void setTarefaRealizada(boolean tarefaRealizada) {
        this.tarefaRealizada = tarefaRealizada;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricaoTarefa='" + descricaoTarefa + '\'' +
                ", tarefaRealizada=" + tarefaRealizada +
                '}';
    }
}
