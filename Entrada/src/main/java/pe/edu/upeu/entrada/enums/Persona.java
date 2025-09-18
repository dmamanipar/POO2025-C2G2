package pe.edu.upeu.entrada.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Persona {
    DIRECTOR(Posicion.P1,"Director"),
    PRESIDENTE(Posicion.P2,"Presidente"),
    VICEPRESIDENTE(Posicion.P3,"VicePresidente"),
    OPERARIO(Posicion.P4,"Operario"),

    General(Posicion.GENERAL,"General"),;

    private Posicion posicion;
    private String descripcion;

}
