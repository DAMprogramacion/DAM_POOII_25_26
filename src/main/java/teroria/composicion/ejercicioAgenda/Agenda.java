package teroria.composicion.ejercicioAgenda;


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
    public String obtenerNombreContactoPorTelefono(String numeroTelefono) {
        for (Contacto contacto : contactos)
            if (contacto.getNumeroTelefono().equals(numeroTelefono))
                return contacto.getNombreContacto();
        return null;
    }
    //devuelva el teléfono dado el nombre del contacto
    public String obtenerNumeroTelefonoContactoPorNombre(String nombre) {
        for (Contacto contacto : contactos)
            if (contacto.getNombreContacto().equalsIgnoreCase(nombre))
                return contacto.getNumeroTelefono();
        return null;
    }
    //actualizamos el número de teléfono
    public void actualizarTelefonoContacto(String nombreContacto, String nuevoTelefono) {
        for (Contacto contacto : contactos)
            if (contacto.getNombreContacto().equalsIgnoreCase(nombreContacto))
                contacto.setNumeroTelefono(nuevoTelefono);
    }
    //borrar el contacto
    public void eliminarContactoPorTelefono(Contacto contacto) {
        contactos.remove(contacto);
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("AGENDA: ").append(nombreAgenda).append('\n');
        for (int i = 0; i < contactos.size(); i++) {
            sBuilder.append(i+1).append(".- ").append(contactos.get(i).getNombreContacto()).
                    append(": ").append(contactos.get(i).getNumeroTelefono()).append('\n');
        }
        return sBuilder.toString();
    }
}







