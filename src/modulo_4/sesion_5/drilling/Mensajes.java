package modulo_4.sesion_5.drilling;

public class Mensajes {
    //Mensajes de menu
    public void mensajeBienvenida() {
        System.out.println("Bienvenido al sistema de gestión de Autos");
    }

    public void mostrarMenu() {
        System.out.println("\n¿Qué deseas hacer?");
        System.out.println("1. Encender auto");
        System.out.println("2. Apagar auto");
        System.out.println("3. Acelerar auto");
        System.out.println("4. Mostrar estado del auto");
        System.out.println("5. Salir");
    }

    public void menuTimeResponse() {
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
