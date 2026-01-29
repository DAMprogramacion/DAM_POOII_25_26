package teroria.fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejemplo2 {
    public static void main(String[] args) {
        LocalDateTime fechaConHora = LocalDateTime.of(2015, 8, 15, 23, 12, 0);
        System.out.println("Formato por defecto: " + fechaConHora);
        System.out.println("Formato ISO 8601 (explícito): " +
                fechaConHora.format(DateTimeFormatter.ISO_DATE_TIME));
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss ");
        System.out.println("Formato español (manual): " + fechaConHora.format(esDateFormat));
    }
}
