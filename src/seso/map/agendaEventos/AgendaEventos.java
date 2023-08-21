package seso.map.agendaEventos;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Crie uma classe chamada "AgendaEventos" que utilize um Map para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.
exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
obterProximoEvento(): Retorna o próximo evento que ocorrerá.
 */
public class AgendaEventos {
    //atributo
    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void  adicionarEvento(LocalDate data, String nome, String atracao) {
        Eventos evento = new Eventos(nome, atracao);
        eventosMap.put(data, evento);
    }

    public  void  exibirAgenda() {
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá em: " + proximaData);
                break;
            }
        }
    }
}
