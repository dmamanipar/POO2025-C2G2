package pe.edu.upeu.conceptospoo.claseinterna;

public class ClaseExterna {
    int a,b;

    int operacion(){
        return a+b;
    }

    class claseinterna1 {
        int r;
            void mensaje(){
                r=(a+b);
                System.out.println("la suma es: "+r);
            }
    }

    class claseinterna2 {
        void otraoperacion(){
            System.out.println("La operacion de resta es: "+(a-b));
        }
    }

    public static void main(String[] args) {
        ClaseExterna ce = new ClaseExterna();
        ce.a=8;
        ce.b=2;
        System.out.println("La operacion de resta es: "+ce.operacion());

        claseinterna1 ci1=ce.new claseinterna1();
        ci1.mensaje();
        claseinterna2 ci2=ce.new claseinterna2();
        ci2.otraoperacion();

    }





}


class ClaseExternax{ }


