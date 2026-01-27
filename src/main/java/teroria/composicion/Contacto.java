package teroria.composicion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contacto {
    private String nombreContacto;
    private String numeroTelefono;

    @Override
    public String toString() {
        return String.format("Nombre: %s, Teléfono: %s", nombreContacto, numeroTelefono);
    }
}
