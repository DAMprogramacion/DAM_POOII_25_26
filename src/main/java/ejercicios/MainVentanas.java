package ejercicios;

import javax.swing.*;

public class MainVentanas {
    public static void main(String[] args) {
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione opcion",
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,    // null para icono por defecto.
                new Object[] { "insertar", "borrar", "actualizar" },   // null para YES, NO y CANCEL
                "opcion 1");

        if (seleccion != -1)
            System.out.println("seleccionada opcion " + (seleccion + 1));
       /* switch (seleccion) {
            case 0: System.out.println("llamamos a un método que inserte");
        }*/

    }
}
