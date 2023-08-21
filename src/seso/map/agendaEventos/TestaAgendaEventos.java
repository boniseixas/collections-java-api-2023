package seso.map.agendaEventos;

import java.time.LocalDate;
import java.time.Month;

public class TestaAgendaEventos {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao 3");
        //agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 21), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 20), "Evento 5", "Atracao 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
