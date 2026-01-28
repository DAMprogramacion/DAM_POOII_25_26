package teroria.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ejemplo1 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        int anno = hoy.getYear();
        int mes  = hoy.getMonthValue();
        int dia  = hoy.getDayOfMonth();
        StringBuilder sBuilder = new StringBuilder();
        //  28/1/2026
        sBuilder.append(dia).append('/').append(mes).append('/').append(anno);
        String fechaHoy = sBuilder.toString();
        System.out.println(fechaHoy);
        LocalTime horaActual = LocalTime.now();
        System.out.println(horaActual);
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println(fechaHoraActual);

        LocalDate fechaNacimiento = LocalDate.of(2000, 1, 10);
        System.out.printf("Fecha de nacimiento: %s%n", fechaNacimiento );
        System.out.printf("Fecha de nacimiento: %d/%d/%d%n",
             fechaNacimiento.getDayOfMonth(), fechaNacimiento.getMonthValue(), fechaNacimiento.getYear());
    }
}
