package pe.edu.upeu.entrada.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.entrada.enums.Persona;
import pe.edu.upeu.entrada.enums.Tipo;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonaRepositorio {
    public List<pe.edu.upeu.entrada.modelo.Persona> listaPersonas = new ArrayList<>();

    public List<pe.edu.upeu.entrada.modelo.Persona> findAll(){
        listaPersonas.add(
                new pe.edu.upeu.entrada.modelo.Persona(
                    new SimpleStringProperty("45609093"),
                    new SimpleStringProperty("01"),
                    new SimpleStringProperty("01/17/2025"),
                    new SimpleStringProperty("8:30am"),
                    new SimpleStringProperty("Anthony"),
                    new SimpleStringProperty("Chavez"),
                    new SimpleStringProperty("12:00pm"),
                    new SimpleBooleanProperty(true), Persona.DIRECTOR,
                        Tipo.EMPRESA
                )
        );

        listaPersonas.add(
                new pe.edu.upeu.entrada.modelo.Persona(
                        new SimpleStringProperty("60909364"),
                        new SimpleStringProperty("02"),
                        new SimpleStringProperty("01/17/2025"),
                        new SimpleStringProperty("8:00am"),
                        new SimpleStringProperty("Leonel"),
                        new SimpleStringProperty("Perez"),
                        new SimpleStringProperty("12:30pm"),
                        new SimpleBooleanProperty(true), Persona.DIRECTOR,
                        Tipo.EMPRESA
                )
        );

        return listaPersonas;
    }
}
