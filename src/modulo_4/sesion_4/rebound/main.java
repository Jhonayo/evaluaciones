package modulo_4.sesion_4.rebound;

public class main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 18, 75.0, 1.70);
        Persona persona2 = new Persona("Maria", 22, 65.0, 1.66);
        Persona persona3 = new Persona("Pablo", 16, 68.0, 1.70);
        Persona persona4 = new Persona("Claudio",42, 85.0, 1.82);
        Persona persona5 = new Persona("Isabel", 10, 40.0, 1.10);

        persona1.calculoImc();
        System.out.println(persona1);
        persona2.calculoImc();
        System.out.println(persona2);
    }
}
