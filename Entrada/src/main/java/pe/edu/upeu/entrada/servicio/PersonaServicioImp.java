package pe.edu.upeu.entrada.servicio;

import org.springframework.stereotype.Service;
import pe.edu.upeu.entrada.modelo.Persona;
import pe.edu.upeu.entrada.repositorio.PersonaRepositorio;

import java.util.List;

@Service
public class PersonaServicioImp extends PersonaRepositorio implements PersonaServicioI{

    //List<Persona> listaPersonas=new ArrayList<>();

    @Override
    public void save(Persona persona) {
        listaPersonas.add(persona);
    }

    @Override
    public List<Persona> findAll() {
        if(listaPersonas.isEmpty()){
            return super.findAll();
        }
        return listaPersonas;
    }

    @Override
    public void update(Persona persona, int index) {
        listaPersonas.set(index, persona);
    }

    @Override
    public void delete(int index) {
        listaPersonas.remove(index);
    }

    @Override
    public Persona findById(int index) {
        return listaPersonas.get(index);
    }
}
