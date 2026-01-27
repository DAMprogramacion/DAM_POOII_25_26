package teroria.composicion;


import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nombreAgenda;
    private List<Contacto> contactos = new ArrayList<>();

    public Agenda( String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    public String getNombreAgenda() {
        return nombreAgenda;
    }
    //CRUD
    //añadir un contacto
    public boolean insertarContacto (Contacto contacto) {
        return contactos.add(contacto);
    }
    //devuelva todos los contactos

    public List<Contacto> obtenerTodosContactos() {
        return contactos;
    }


    //devuelva el nombre del contacto, pasodo el teléfono
    //devuelva el teléfono dado el nombre del contact00o
    //actualizamos el número de teléfono
    //borrar el contacto






}
