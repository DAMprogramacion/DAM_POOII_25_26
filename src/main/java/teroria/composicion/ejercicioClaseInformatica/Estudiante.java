package teroria.composicion.ejercicioClaseInformatica;

import java.time.LocalDate;
import java.time.Period;

public class Estudiante {
    private String nombreEstudiante;
    private String apellidosEstudiante;
    private LocalDate fechaNacimiento;
    private String dni;
    private Grupo grupo;

    public Estudiante(String nombreEstudiante, String apellidosEstudiante, LocalDate fechaNacimiento, String dni, Grupo grupo) {
        this.nombreEstudiante = nombreEstudiante;
        this.apellidosEstudiante = apellidosEstudiante;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.grupo = grupo;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidosEstudiante() {
        return apellidosEstudiante;
    }

    public void setApellidosEstudiante(String apellidosEstudiante) {
        this.apellidosEstudiante = apellidosEstudiante;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    /*public void setDni(String dni) {
        this.dni = dni;
    }*/

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    private boolean esMayorEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }

    @Override
    public String toString() {
        String mensaje = esMayorEdad() ? "mayor de edad" : "menor edad";
        String dniLetraMayuscula = dni.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(apellidosEstudiante).append(", ").append(nombreEstudiante);
        stringBuilder.append(": alumno de ").append(grupo).append(" , dni: ").append(dniLetraMayuscula);
        stringBuilder.append(", ").append(mensaje);

        return stringBuilder.toString();
    }
}
