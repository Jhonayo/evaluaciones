package modulo_4.sesion_5.drilling;

import modulo_4.sesion_4.drilling.Mensajes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se instancia mensajes para mensaje de bienvenida y menu
        Mensajes mensajes = new Mensajes();
        mensajes.mensajeBienvenida();


        /*
        boolean salir = false;
        while (!salir) {
            mensajes.mostrarMenu();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // metodo de ver productos
                    break;
                case 2:
                    // metodo de agregar productos
                    break;
                case 3:
                    //metodo de modificar productos
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    mensaje.mensajeSleepResponse();
                    Systen.out.println("Adios...")
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        sc.close();*/




    }
}
