package seso.set.agendaContatos;

public class TestaAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 456789);
        agendaContatos.adicionarContato("Camila Cavalcante", 987654);
        agendaContatos.adicionarContato("Helena Seso", 321654);
        agendaContatos.adicionarContato("Helena Seso", 321654);
        agendaContatos.exibirContato();
        agendaContatos.atualizarNumeroContato("Camila Cavalcante", 222222);
        agendaContatos.exibirContato();


        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
    }
}
