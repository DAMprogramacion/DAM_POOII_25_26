package teroria.composicion.ejercicioClaseInformatica;

import java.util.HashSet;
import java.util.Set;

public class ClaseInformatica {
    private Aula aula;
    private Grupo grupo; //aquí va haber redundancia
    private Set<Estudiante> estudiantes = new HashSet<>();
}
