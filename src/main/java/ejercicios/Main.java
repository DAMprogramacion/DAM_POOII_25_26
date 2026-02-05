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
        AulaInformatica aulaInformatica = new AulaInformatica("1.7");
        aulaInformatica.addOrdenador(ordenador1);
        aulaInformatica.addOrdenador(ordenador2);
        aulaInformatica.addOrdenador(ordenador3);
        aulaInformatica.addOrdenador(ordenador4);
        System.out.println(aulaInformatica.getOrdenadores());
        System.out.println(aulaInformatica);
        System.out.println("Ordenador de mayor RAM");
        System.out.println(aulaInformatica.getOrdenadorMayorRAM());
        System.out.println("eliminando un ordenador");
        aulaInformatica.eliminarOrdenador("ID-002");
        System.out.println(aulaInformatica);
    }
}
