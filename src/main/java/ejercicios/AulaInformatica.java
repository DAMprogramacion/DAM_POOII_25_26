package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AulaInformatica {
    private String nombreAula;
    private final Map<String, Ordenador> ordenadores = new HashMap<>();
    //constructor

    public AulaInformatica(String nombreAula) {
        this.nombreAula = nombreAula;
    }
    //aunque no lo ponga el enunciado, voy a hacer getters y setters

    public String getNombreAula() {
        return nombreAula;
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }

    public Map<String, Ordenador> getOrdenadores() {
        return ordenadores;
    }

    //CRUD
    //añadir un ordenador
    public void addOrdenador (Ordenador ordenador) {
        ordenadores.put(ordenador.getId(), ordenador);
    }
    public void eliminarOrdenador (String idOrdenador) {
        ordenadores.remove(idOrdenador);
    }
    //cambiar a lista por si hay mas de un ordenador con mas RAM
    /*public Ordenador getOrdenadorMayorRAM () {
        Ordenador ordenadorMayorRAM = null;
        int ramMayor = 0;
        for (Ordenador ordenador : ordenadores.values()){
            if (ordenador.getRam() > ramMayor) {
                ramMayor = ordenador.getRam();
                ordenadorMayorRAM = ordenador;
            }
        }
        return ordenadorMayorRAM;
    }*/
    public List<Ordenador> getOrdenadoresMayorRAM () {
        List<Ordenador> ordenadoresMayorRAM = new ArrayList<>();
        int ramMayor = 0;
        for (Ordenador ordenador : ordenadores.values()){
            if (ordenador.getRam() > ramMayor) {
                ramMayor = ordenador.getRam();
                ordenadoresMayorRAM.clear();
                ordenadoresMayorRAM.add(ordenador);
            } else if (ordenador.getRam() == ramMayor)
                ordenadoresMayorRAM.add(ordenador);
        }
        return ordenadoresMayorRAM;
    }
    //CRUD:
    //METODO DADO LA id DEVUELVA MUESTRE EN CONSOLA LAS CARACTERÍSTICAS DEL ORDENADOR: RAM: ...
    public void mostrarDatosOrdenador (String idOrd) {
        Ordenador ordenador = ordenadores.get(idOrd);
        if (ordenador != null) {
            System.out.printf("Mostrando datos del ordenador %s%n", idOrd);
            System.out.printf("RAM %d%n", ordenador.getRam());
            System.out.printf("Capacidad disco %d%n", ordenador.getCapacidadDisco());
            System.out.printf("Procesador %.2f%n", ordenador.getProcesador());
            System.out.printf("Gráfica integrada %B%n", ordenador.isGraficaIntegrada());
            System.out.printf("Año de adquisición %d%n", ordenador.getFechaAdquisicion().getYear());
        } else
            System.out.printf("El ordenador %s no existe%n", idOrd);
    }
    //METODO ACTUALIZAR EL ORDENADOR
    public void actualizarOrdenador(Ordenador ordenadorActualizado) {
        Ordenador ordenador = ordenadores.get(ordenadorActualizado.getId());
        if (ordenador != null) {
            ordenador.setRam(ordenadorActualizado.getRam());
            ordenador.setCapacidadDisco(ordenadorActualizado.getCapacidadDisco());
            ordenador.setProcesador(ordenadorActualizado.getProcesador());
            ordenador.setGraficaIntegrada(ordenador.isGraficaIntegrada());
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Ordenador ordenador : ordenadores.values()){
            stringBuilder.append(ordenador.toString()).append('\n');
        }
        return stringBuilder.toString();  //hay que quitar el último salto de línea
    }
}
