package teroria.composicion;

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
    }
}
