package modulo_4.sesion_5.drilling;

public class Mensajes {
    //Mensajes de menu
    private void mensajeBienvenida() {
        System.out.println("Bienvenido al sistema de gestión de productos");
    }

    //menu del sistema
    private void mostrarMenu() {
        System.out.println("\n¿Qué deseas hacer?");
        System.out.println("1. Ver productos");
        System.out.println("2. Agregar producto");
        System.out.println("3. Modificar producto");
        System.out.println("4. Salir");
    }

    private void menuSleepResponse() {
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
