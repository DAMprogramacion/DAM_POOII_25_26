package teroria.fechas;

import java.time.*;

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
        boolean x = hoy.isLeapYear();
        System.out.println("====================");
        System.out.println(hoy);
        System.out.printf("¿Es x? %B%n", x);
        LocalDate hoyDentroDosAnnos = hoy.plusYears(2);
        boolean y = hoyDentroDosAnnos.isLeapYear();
        System.out.println(hoyDentroDosAnnos);
        System.out.printf("¿Es y? %B%n", y);
       // LocalDate fechaErronea = LocalDate.of(2026,2,29);
        DayOfWeek dayOfWeek = hoyDentroDosAnnos.getDayOfWeek();
        System.out.println(dayOfWeek);
        /// //////////////////////////////////
        System.out.println("/////////////////////////////");
        Period period1 = fechaNacimiento.until(hoy);
        System.out.println(period1);
        int annosTranscurridos = period1.getYears();
        int mesesTranscurridos = period1.getMonths();
        int diasTranscurridos = period1.getDays();
        System.out.printf("Esta persona tiene %d años, %d meses y %d dia%n",
                annosTranscurridos, mesesTranscurridos, diasTranscurridos);
        System.out.println("/////////////////////////////");
        Period period2 = Period.between(fechaNacimiento, hoy);
        System.out.println(period2);
        annosTranscurridos = period2.getYears();
        mesesTranscurridos = period2.getMonths();
        diasTranscurridos = period2.getDays();
        System.out.printf("Esta persona tiene %d años, %d meses y %d dia%n",
                annosTranscurridos, mesesTranscurridos, diasTranscurridos);
        //**************************************************
        System.out.println("********************************************");
        LocalDate fechaNac1 = LocalDate.of(2000,10,12);
        System.out.printf("Fecha de 1: %s%n", fechaNac1);
        LocalDate fechaNac2 = LocalDate.of(2000,9,12);
        System.out.printf("Fecha de 2: %s%n", fechaNac2);
        boolean esMayor1que2 = fechaNac1.isBefore(fechaNac2);
        System.out.printf("¿Es mayor 1 que 2 %B%n", esMayor1que2);


    }
}
