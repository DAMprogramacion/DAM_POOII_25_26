package teroria.composicion.ejercicioClaseInformatica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClaseInformatica {
    private Aula aula;
    private final Grupo grupo; //aquí va haber redundancia
    private final Set<Estudiante> estudiantes = new HashSet<>();

    public ClaseInformatica(Grupo grupo, Aula aula) {
        this.grupo = grupo;
        this.aula = aula;
    }

    public Aula getAula() {
        return aula;
    }
    //metodo crud que actualiza el aula
    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Grupo getGrupo() {
        return grupo;
    }
    //metodo añadir estudiante
    public boolean addEstudiante (Estudiante estudiante) {
        return estudiantes.add(estudiante);
    }
    //metodo crud que devuelve todos los estuciantes
    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    //metodo crud, nos devuelve un estudiante dado su dni
    public Estudiante getEstudiantePorDni(String dni) {
        for (Estudiante estudiante : estudiantes)
            if (estudiante.getDni().equalsIgnoreCase(dni))
                return estudiante;
        return null;
    }
    //metodo crud que devuelva una lista de estudiantes menores de edad
    public List<Estudiante> getEstudiantesMenoresDeEdad() {
        List<Estudiante> estudiantesMenores = new ArrayList<>();
        for (Estudiante estudiante : estudiantes)
            if (! estudiante.esMayorEdad())
                estudiantesMenores.add(estudiante);
        return estudiantesMenores;
    }
    //metodo crud que devuelve la lista de  estudiantes que cumplen años el día actual
    public List<Estudiante> getEstudiantesCumplenEdad() {
        List<Estudiante> estudiantesCumple = new ArrayList<>();
        for (Estudiante estudiante : estudiantes)
            if (estudiante.esCumpleannosHoy())
                estudiantesCumple.add(estudiante);
        return estudiantesCumple;
    }
    public boolean eliminarEstudiantePorDni (String dni) {
        return estudiantes.remove(new Estudiante(null, null, null,
                dni, null));
    }



}




