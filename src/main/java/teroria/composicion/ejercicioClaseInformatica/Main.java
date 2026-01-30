package teroria.composicion.ejercicioClaseInformatica;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("juana", "molero fernández",
                LocalDate.of(2020, 2, 28), "12345678a", Grupo.ASIR);
        System.out.println(estudiante1);
    }
}
