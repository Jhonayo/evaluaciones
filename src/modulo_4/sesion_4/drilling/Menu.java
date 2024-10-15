package modulo_4.sesion_4.drilling;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se instancia mensajes para mensaje de bienvenida y menu
        Mensajes mensajes = new Mensajes();
        mensajes.mensajeBienvenida();

        // Se pide al usuario los datos del vehiculo
        System.out.println("Ingrese la marca de su vehículo: ");
        String marca = sc.next();
        System.out.println("Ingrese el modelo de su vehículo: ");
        String modelo = sc.next();
        System.out.println("Ingrese el color de su vehículo: ");
        String color = sc.next();
        System.out.println("Ingrese la velocidad máxima de su vehículo: ");
        int velocidadMaxima = sc.nextInt();

        // Se crea un nuevo auto con los datos entregados por el usuario
        Auto auto = new Auto(marca, modelo, color, velocidadMaxima);

        // Menú principal
        boolean salir = false;
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

        sc.close();
    }
}
