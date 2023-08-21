package seso.map.agendaEventos;


/*
Crie uma classe chamada "AgendaEventos" que utilize um Map para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.
exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
obterProximoEvento(): Retorna o próximo evento que ocorrerá.
 */
public class Eventos {
    //atributos
    private String nome;
    private String atracao;

    public Eventos(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
