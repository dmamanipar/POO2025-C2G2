package pe.edu.upeu.conceptospoo.encapsulamiento;

public class ClaseGeneral {
    
    public  void probar(){
     persona p = new persona();
        p.setNombre("Juan");
        p.setEdad(18);
        p.saludar();
    
    }
    public  void apicandolombox(){
     personaX p = new personaX();
        p.setNombre("Juan");
        p.setEdad(18);
        p.saludar();
    
    }
    public static void main(String[] args) {
        ClaseGeneral cg=new ClaseGeneral();
        
        cg.probar();
        
     /*   persona persona = new persona();//Persona es un Objeto


        persona.nombre="David";
        persona.edad=18;
        persona.saludar();
        
        persona.setNombre("Maria");
        persona.setEdad(25);

        System.out.println("nombre: "+persona.getNombre());
        System.out.println("edad: "+persona.getEdad());

        persona.saludar();*/

    }
}
