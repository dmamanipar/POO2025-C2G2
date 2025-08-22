package pe.edu.upeu.ejemplos;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class StalimJCC {
    static class Persona {
        String nombre;
        double nota;

        public Persona(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
        }

        @Override
        public String toString() {
            return nombre + ": " + nota;
        }
    }

    public static void main(String[] args) {
        String[] nombres = new String[3];
        nombres[0] = "Stalim";
        nombres[1] = "Chavi";
        nombres[2] = "Amaia";

        Persona[] notas = new Persona[2];
        notas[0] = new Persona("Stalim", 19.0);
        notas[1] = new Persona("Amaia", 18.0);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Stalim", 17.0));
        personas.add(new Persona("Chavi", 19.0));
        personas.add(new Persona("Amaia", 16.0));

        // Imprimir las notas
        System.out.println("Notas individuales:");
        for (Persona p : notas) {
            System.out.println(p);
        }

        System.out.println("\nLista de personas:");
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}