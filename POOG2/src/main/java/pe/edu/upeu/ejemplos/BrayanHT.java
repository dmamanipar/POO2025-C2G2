package pe.edu.upeu.ejemplos;

import java.util.ArrayList;
import java.util.List;

public class BrayanHT {
    static class Persona{
        String nombre;
        double nota;
        public Persona(String nombre, double nota){
            this.nombre=nombre;
            this.nota=nota;
        }
    }
    public static void main (String[]args){
        String[] nombres=new String[3];
        nombres[0]="Brayan";
        nombres[1]="zayu";
        nombres[2]="kevin";

        adrianSM.Persona notas[] = new adrianSM.Persona[2];
        notas[0]= new adrianSM.Persona("Brayan",15.0);
        notas[1]= new adrianSM.Persona("Zayu",12.0);

        List<adrianSM.Persona> personas = new ArrayList<>();
        personas.add(new adrianSM.Persona("Brayan",15.0));
        personas.add(new adrianSM.Persona("Zayu",15.0));

    }
}

