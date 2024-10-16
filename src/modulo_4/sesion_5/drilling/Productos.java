package modulo_4.sesion_5.drilling;

import java.util.Scanner;

public class Productos {
    private String[] nombres;
    private Integer[] valores;
    private String[] descripciones;

    // Constructor para inicializar el listado de productos
    public Productos() {
        nombres = new String[7];
        valores = new Integer[7];
        descripciones = new String[7];

        // Inicialización de productos
        nombres[0] = "chocolate";
        nombres[1] = "leche";
        nombres[2] = "arroz";
        valores[0] = 500;
        valores[1] = 800;
        valores[2] = 900;
        descripciones[0] = "Chocolate amargo, 500 gr.";
        descripciones[1] = "Leche entera, 1 litro.";
        descripciones[2] = "Arroz granado 2, 1 kilo";
    }

    // Metodo para mostrar productos
    public void mostrarProductos() {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null) {
                System.out.println("Producto: " + nombres[i] + ", Valor: " + valores[i] + ", Descripción: " + descripciones[i]);
            }
        }
    }

    // Metodo para agregar un nuevo producto
    public void agregarProducto(Scanner sc) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] == null) {
                System.out.println("Ingresa el nombre del producto:");
                nombres[i] = sc.next();

                System.out.println("Ingresa el valor del producto:");
                valores[i] = sc.nextInt();

                sc.nextLine(); // Para consumir la nueva línea
                System.out.println("Ingresa la descripción del producto:");
                descripciones[i] = sc.nextLine();

                System.out.println("Producto agregado con éxito.");
                break;
            }
        }
    }

    public void modificarProducto(Scanner sc) {
        System.out.println("Ingresa el nombre del producto a modificar:");
        String nombreProducto = sc.next();

        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null && nombres[i].equalsIgnoreCase(nombreProducto)) {
                encontrado = true;
                System.out.println("Producto encontrado. ");
                System.out.println("Ingresa el nuevo nombre del producto:");
                nombres[i] = sc.next();
                System.out.println("Ingresa el nuevo valor:");
                valores[i] = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa la nueva descripción:");
                descripciones[i] = sc.nextLine();
                System.out.println("Producto modificado con éxito.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

}