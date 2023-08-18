package list.operacoesBasicas.listatarefa;

import list.operacoesBasicas.listatarefa.ListaTarefa;

public class TestaTarefa {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
