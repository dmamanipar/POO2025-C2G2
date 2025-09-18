package pe.edu.upeu.entrada.servicio;

import pe.edu.upeu.entrada.modelo.Persona;

import java.util.List;

public interface PersonaServicioI {

    void save(Persona persona);

    List<Persona> findAll();

    void update(Persona persona, int index);

    void delete(int index);

    Persona findById(int index);



}
