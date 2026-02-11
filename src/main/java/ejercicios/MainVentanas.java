package ejercicios;

import javax.swing.*;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class MainVentanas {
    private static AulaInformatica aulaInformatica;
    public static void main(String[] args) {
        //solicitar el nombre del aula
        String nombreAula = getDialog("¿Cuál es el nombre del aula?",
                "nombre del aula");  // el icono sera un iterrogante
        aulaInformatica = new AulaInformatica(nombreAula);
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione opcion",
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,    // null para icono por defecto.
                new Object[] { "insertar", "borrar", "actualizar", "listar", "salir" },   // null para YES, NO y CANCEL
                "insertar");

      /*  if (seleccion != -1)
            System.out.println("seleccionada opcion " + (seleccion + 1));*/

            switch (seleccion) {
                case 0:
                    insertarOrdenador();
                    break;
                case 1: //System.out.println("llamamos a un método que borre");
                    eliminarOrdenador();
                    break;
                case 2:
                    actualizarOdenador();
                    break;
                case 3:
                    listarOrdenadores();
                    break;
                case 4:
                    return;

                default:
                    System.out.println("opción no permitida");
            }
        }

    }

    private static void actualizarOdenador() {
        Object seleccion = getSeleccion();
        String id = (String) seleccion;
        String sRAM = getDialog("Introduce la RAM","nuevo ordenador");
        int ram = Integer.parseInt(sRAM);
        String sVelocidad = getDialog("Introduce la velocidad","nuevo ordenador");
        double velocidad = Double.parseDouble(sVelocidad);
        String sDisco = getDialog("Introduce capacidad disco","nuevo ordenador");
        int disco = Integer.parseInt(sDisco);
        int iGrafica = getGrafica();
        boolean bGrafica = iGrafica != 0;
        Ordenador ordenador = new Ordenador(id, ram, velocidad, bGrafica, disco);
        aulaInformatica.actualizarOrdenador(ordenador);
    }

    private static void listarOrdenadores() {
        JOptionPane.showMessageDialog(
                null,
                aulaInformatica.toString());
    }

    private static String getDialog(String mensaje, String titulo) {
        return JOptionPane.showInputDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.QUESTION_MESSAGE
        );
    }

    private static void insertarOrdenador() {
        //id ID0, ID1, ID2, ID3..
        String id = UUID.randomUUID().toString();
        String sRAM = getDialog("Introduce la RAM","nuevo ordenador");
        int ram = Integer.parseInt(sRAM);
        String sVelocidad = getDialog("Introduce la velocidad","nuevo ordenador");
        double velocidad = Double.parseDouble(sVelocidad);
        String sDisco = getDialog("Introduce capacidad disco","nuevo ordenador");
        int disco = Integer.parseInt(sDisco);
        int iGrafica = getGrafica();
        boolean bGrafica = iGrafica != 0;
        Ordenador ordenador = new Ordenador(id, ram, velocidad, bGrafica, disco);
        aulaInformatica.addOrdenador(ordenador);
    }

    private static int getGrafica() {
        return JOptionPane.showOptionDialog(
                null,
                "Gráfica integrada",
                "nuevo ordenador",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                null,
                null
        );
    }

    private static void eliminarOrdenador() {
        Object seleccion = getSeleccion();
        aulaInformatica.eliminarOrdenador((String) seleccion);
    }

    private static Object getSeleccion() {
        return JOptionPane.showInputDialog(
                null,
                "Seleccione opcion",
                "Selector de opciones",
                JOptionPane.QUESTION_MESSAGE,
                null,  // null para icono defecto
                getClaves(),
                getClaves()[0]);
    }

    private static Object[] getClaves() {
        //obtener el Map: llamo al getter
        Map<String, Ordenador> ordenadoresMap = aulaInformatica.getOrdenadores();
        //obtener el Set de claves: KeySet
        Set<String > idsOrdenadores = ordenadoresMap.keySet();
        //crear un array de Object del tamaño del Set
        Object[] claves = idsOrdenadores.toArray();
        return claves;
    }
}
