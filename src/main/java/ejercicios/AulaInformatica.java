package ejercicios;

import java.util.HashMap;
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
    public Ordenador getOrdenadorMayorRAM () {
        Ordenador ordenadorMayorRAM = null;
        int ramMayor = 0;
        for (Ordenador ordenador : ordenadores.values()){
            if (ordenador.getRam() > ramMayor) {
                ramMayor = ordenador.getRam();
                ordenadorMayorRAM = ordenador;
            }
        }
        return ordenadorMayorRAM;
    }
    //CRUD:
    //METODO DADO LA id DEVUELVA MUESTRE EN CONSOLA LAS CARACTERÍSTICAS DEL ORDENADOR: RAM: ...
    //METODO ACTUALIZAR EL ORDENADOR
    //public void actualizarOrdenador(Ordenador ordenador)
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Ordenador ordenador : ordenadores.values()){
            stringBuilder.append(ordenador.toString()).append('\n');
        }
        return stringBuilder.toString();  //hay que quitar el último salto de línea
    }
}
