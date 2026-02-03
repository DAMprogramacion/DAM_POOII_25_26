package teroria.composicion.ejercicioClaseInformatica;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("juana", "molero fernández",
                LocalDate.of(2020, 2, 28), "12345678a", Grupo.ASIR);
        Estudiante estudiante2 = new Estudiante("juana", "molero fernández",
                LocalDate.of(2020, 2, 28), "12345678a", Grupo.ASIR);
        //System.out.println(estudiante1);
        ClaseInformatica claseInformatica = new ClaseInformatica(Grupo.DAM, Aula.Aula_1_7);
        claseInformatica.addEstudiante(estudiante1);
        claseInformatica.addEstudiante(estudiante2);
        System.out.println(claseInformatica.getEstudiantes());
        claseInformatica.eliminarEstudiantePorDni("12345678b");
        System.out.println(claseInformatica.getEstudiantes());
        claseInformatica.eliminarEstudiantePorDni("12345678a");
        System.out.println(claseInformatica.getEstudiantes());

    }
}
