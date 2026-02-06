package ejercicios;

public class Main {
    public static void main(String[] args) {
        Ordenador ordenador1 =
                new Ordenador("ID-001", 16, 3.6, true, 1);
       // System.out.println(ordenador);
        Ordenador ordenador2 =
                new Ordenador("ID-001", 16, 3.6, true, 1);
        Ordenador ordenador3 =
                new Ordenador("ID-002", 16, 3.6, true, 1);
        Ordenador ordenador4 =
                new Ordenador("ID-003", 32, 3.6, true, 1);
        Ordenador ordenador5 =
                new Ordenador("ID-004", 32, 3.6, true, 1);
        AulaInformatica aulaInformatica = new AulaInformatica("1.7");
        aulaInformatica.addOrdenador(ordenador1);
        aulaInformatica.addOrdenador(ordenador2);
        aulaInformatica.addOrdenador(ordenador3);
        aulaInformatica.addOrdenador(ordenador4);
        aulaInformatica.addOrdenador(ordenador5);
        System.out.println(aulaInformatica.getOrdenadores());
        System.out.println(aulaInformatica);
        System.out.println("Ordenador de mayor RAM");
        System.out.println(aulaInformatica.getOrdenadoresMayorRAM());
        System.out.println("eliminando un ordenador");
        aulaInformatica.eliminarOrdenador("ID-002");
        System.out.println(aulaInformatica);
        System.out.println("Datos de un ordenador existente");
        aulaInformatica.mostrarDatosOrdenador("ID-001");
        System.out.println("Datos de un ordenador NO existente");
        aulaInformatica.mostrarDatosOrdenador("ID-0011");
        System.out.println("Datos de un ordenador null");
        aulaInformatica.mostrarDatosOrdenador(null);
        System.out.println("Actualizando el orndenaor ID-001");
        aulaInformatica.mostrarDatosOrdenador("ID-001");
        Ordenador ordenadorActualizado = new Ordenador("ID-001", 64, 3.6, false, 10 );
        aulaInformatica.actualizarOrdenador(ordenadorActualizado);
        aulaInformatica.mostrarDatosOrdenador("ID-001");

    }
}
