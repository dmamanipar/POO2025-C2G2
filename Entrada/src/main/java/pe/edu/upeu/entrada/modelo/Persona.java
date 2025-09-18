package pe.edu.upeu.entrada.modelo;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upeu.entrada.enums.Tipo;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Persona {
    private StringProperty dni;
    private StringProperty id;
    private StringProperty fecha;
    private StringProperty horaingreso;
    private StringProperty nombre;
    private StringProperty apellido;
    private StringProperty horasalida;
    private BooleanProperty estado;
    private pe.edu.upeu.entrada.enums.Persona persona;
    private Tipo tipo;
}
