package modulo_4.sesion_5.rebound;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] asignaturas = new String[5];
        double[] promedios = new double[5];
        double aux = 0;

        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Ingrese el nombre de la asignatura");
            asignaturas[i] = sc.next();
            System.out.printf("Ingrese el promedio de la asignatura %s\n", asignaturas[i]);
            promedios[i] = sc.nextDouble();
        }

        System.out.print("Sus notas son las siguientes: ");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.printf("\n%s = %.1f ", asignaturas[i], promedios[i]);
            aux += promedios[i];
        }
        System.out.println("\nSu promedio general es = " + (aux / promedios.length));

    }
}
