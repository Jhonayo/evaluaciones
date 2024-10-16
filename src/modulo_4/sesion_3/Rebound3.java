package modulo_4.sesion_3;

import java.util.Scanner;

public class Rebound3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero  para ser impreso");
        int n = sc.nextInt();
        //Patron 1
        System.out.println("Patrón 1: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println("\n--------------------");
        // Patron 2
        System.out.println("Patrón 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}