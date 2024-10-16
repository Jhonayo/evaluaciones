package modulo_4.sesion_5.drilling;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se instancia mensajes para mensaje de bienvenida y menu
       MensajesApp mensajesApp = new MensajesApp();
        Productos listaProductos = new Productos();

        mensajesApp.mensajeBienvenida();
        boolean salir = false;
        while (!salir) {
            mensajesApp.mostrarMenu();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Ver productos
                    listaProductos.mostrarProductos();
                    break;
                case 2:
                    // Agregar producto
                    listaProductos.agregarProducto(sc);
                    break;
                case 3:
                    // Modificar producto
                    listaProductos.modificarProducto(sc);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    mensajesApp.menuSleepResponse();
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        sc.close();

    }
}
