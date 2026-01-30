package teroria.composicion.ejercicioAgenda;

public class MainAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("amigos");
       /* System.out.println("Nombre de la agenda: " + agenda.getNombreAgenda());
        System.out.println("Contactos: " + agenda.getContactos());*/
        Contacto contacto1 = new Contacto("juan", "123456789");
        Contacto contacto2 = new Contacto("juana", "123456780");
        Contacto contacto3 = new Contacto("pedro", "123456788");
        Contacto contacto4 = new Contacto("isabel", "123456787");
        agenda.insertarContacto(contacto1);
        agenda.insertarContacto(contacto2);
        agenda.insertarContacto(contacto3);
        agenda.insertarContacto(contacto4);
        System.out.println(agenda.obtenerTodosContactos());
        String numeroTelefono = "123456789";
        String nombreContacto = agenda.obtenerNombreContactoPorTelefono(numeroTelefono);
        System.out.printf("Al nº telefono %s le corresponde el nombre de %s%n",
                numeroTelefono, nombreContacto);
        System.out.printf("Al nombre %s le corresponde el telefono de %s%n",
                nombreContacto, agenda.obtenerNumeroTelefonoContactoPorNombre(nombreContacto));
        agenda.actualizarTelefonoContacto("Juan", "000000000");
        agenda.obtenerTodosContactos().forEach(System.out::println);
        agenda.eliminarContactoPorTelefono(contacto1);
        System.out.println("Borrado el contacto de juan");
        agenda.obtenerTodosContactos().forEach(System.out::println);
        System.out.println(agenda);

    }
}
