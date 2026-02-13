package mockExamen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventosAnuales {
    private int annoEventos;
    private List<Evento> eventos = new ArrayList<>();

    public EventosAnuales(int annoEventos) {
        this.annoEventos = annoEventos;
    }
    public void addEvento (Evento evento) {
        eventos.add(evento);
    }
    public int getTiempoTotal() {
        int duracionTotal = 0;
        for (Evento evento : eventos)
            duracionTotal += evento.getDuracionEvento();
        return duracionTotal;
    }
    public Evento getEventoMasReciente () {
        Evento eventoMasReciente = new Evento(null, 0, TipoEvento.CARRERA,
                LocalDate.of(annoEventos - 1, 1, 1));
        for (Evento evento : eventos)
            if (evento.getFechaEvento().isAfter(eventoMasReciente.getFechaEvento()))
                eventoMasReciente = evento;
        return eventoMasReciente;
    }
    public List<Evento> getEventosMasUnaHora() {
        List<Evento> eventosMasUnaHora = new ArrayList<>();
        for (Evento evento : eventos)
            if (evento.getDuracionEvento() > 60)
                eventosMasUnaHora.add(evento);
        return eventosMasUnaHora;
    }
    public String[] observacionDeEvento (Evento eventoObserv) {
        String[] observacionesArray = null;
        for (Evento evento : eventos) {
            if (evento.getNombreEvento().equalsIgnoreCase(eventoObserv.getNombreEvento())) {
                List<String> listaObservaciones = evento.getObservaciones();
                observacionesArray = new String[listaObservaciones.size()];
                for (int i = 0; i < observacionesArray.length; i++)
                    observacionesArray[i] = listaObservaciones.get(i);
            }
        }
        return observacionesArray;

        //return (String[]) evento.getObservaciones().toArray();
    }

}





