package seso.set.listaTarefas;

public class TestaListaTarefa {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa(new Tarefa("Limpar computador", false));
        listaTarefas.adicionarTarefa(new Tarefa("Estudar mais", false));
        listaTarefas.adicionarTarefa(new Tarefa("Checar email", false));
        listaTarefas.adicionarTarefa(new Tarefa("Concluir Bootcamp", false));
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Limpar comp");
        listaTarefas.exibirTarefas();

        System.out.println("Há "+ listaTarefas.contarTarefas() + " tarefas na lista de tarefas");

        System.out.println("Foram concluídas " + listaTarefas.obterTarefasConcluidas() + " tarefas");

        System.out.println("Estão pendentes " + listaTarefas.obterTarefasPendentes() + " tarefas");

        //listaTarefas.limparListaTarefas();

        listaTarefas.marcarTarefaConcluida("Estudar mais");
        listaTarefas.marcarTarefaConcluida("Concluir Bootcamp");
        listaTarefas.exibirTarefas();

    }
}
