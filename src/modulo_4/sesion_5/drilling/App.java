package modulo_4.sesion_5.drilling;

import modulo_4.sesion_4.drilling.Mensajes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se instancia mensajes para mensaje de bienvenida y menu
        modulo_4.sesion_4.drilling.Mensajes mensajes = new Mensajes();
        mensajes.mensajeBienvenida();


        /*
        *         boolean salir = false;
        while (!salir) {
            mensajes.mostrarMenu();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    auto.encender();
                    break;
                case 2:
                    auto.apagar();
                    break;
                case 3:
                    if(auto.isEncendido()){
                        System.out.println("¿Cuánto desea acelerar?");
                        int incremento = sc.nextInt();
                        auto.acelerar(incremento);
                    }else {
                        System.out.println("No se puede acelerar, el auto está apagado.");
                    }
                    break;
                case 4:
                    auto.mostrarInformacion();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        sc.close();*/




    }
}
