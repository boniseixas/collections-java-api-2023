package seso.map.agendaContatos;

public class TestaAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Cavalcante", 456789);
        agendaContatos.adicionarContato("Camila Cavalcante", 789123);
        agendaContatos.adicionarContato("Maria Flor", 321654);
        agendaContatos.adicionarContato("Flor Maria", 321654);
        agendaContatos.adicionarContato("Camila", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Flor Maria");
        System.out.println("O numero é " + agendaContatos.pesquisarPorNome("Camila Cavalcante"));
        agendaContatos.exibirContatos();
    }
}
