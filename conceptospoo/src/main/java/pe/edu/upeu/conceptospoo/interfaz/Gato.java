package pe.edu.upeu.conceptospoo.interfaz;

public class Gato implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println("Miau...Miau...");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz Zzz...");
    }
}
