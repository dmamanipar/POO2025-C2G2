package pe.edu.upeu.entrada.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Tipo {
    VISITA("Visita"),
    EMPRESA("Empresa"),
    TRABAJADOR("Trabajador"),
    OPERADOR("Operador"),;
    private String descripcion;

}
