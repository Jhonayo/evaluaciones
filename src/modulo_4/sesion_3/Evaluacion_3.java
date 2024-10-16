package modulo_4.sesion_3;

import java.util.Scanner;

public class Evaluacion_3 {
    public static void main(String[] args) {
        // Ejercio 1
        System.out.println("Ejercicio 1 :");
        int number;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero entre 1 y 100");
            number = sc.nextInt();
            int par = 0;
            int impar = 0;
            if (number > 100 || number < 1) {
                System.out.println(" ----------- Error");
            } else {
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        par++;
                    } else {
                        impar++;
                    }
                }
                System.out.println("El total de numeros pares es: " + par);
                System.out.println("El total de numeros impares es: " + impar);
                correcto = true;
            }
        } while (!correcto);

        //Ejercicio 2
        System.out.println("\nEjercicio  2");
        int cero =0;
        int positivo = 0;
        int negativo = 0;
        System.out.println("Ingrese 10 números enteros (positivos, negativos ó cero)");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Introduce el numero %d: ", i);
            number = sc.nextInt();
            if (number > 0) {
                positivo++;
            } else if (number == 0) {
                cero ++;
            }else {
                negativo++;
            }
        }
        System.out.printf("\nEl número de ceros introducidos es de : %d" ,cero);
        System.out.printf("\nEl número de positivos introducidos es de : %d",positivo);
        System.out.printf("\nEl número de negativos introducidos es de : %d",negativo);

    }
}
