package modulo_4.sesion_5.rebound;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
       /* En esta actividad usted deberá crear dos arreglos unidimensionales. En uno almacenará el
        nombre de 5 asignaturas y en el segundo el promedio de nota por cada asignatura. Finalmente,
                deberá sacar el promedio final y mostrar el promedio obtenido. El promedio por curso
        corresponderá al que se almacene en el indicé de su nombre. Ejemplo arreglo1, í ndice 0 =
                matemá ticas, arreglo dos, í ndice 0 = 4.5*/


        Scanner sc = new Scanner(System.in);

        String[] asignaturas = new String[5];
        double[] promedios = new double[5];
        double aux;

        for(int i = 0; i < asignaturas.lenght; i++){
        System.out.println("Ingrese el nombre de la asignatura")        
        asignaturas [i] = sc.next();
        System.out.printf("Ingrese el promedio de la asignatura %d\n", asignaturas [i]);
        promedis[i] = sc.nextInt();
        sc.nextLine();
        }

        System.out.println("Sus notas son las siguientes: ");
        for(int i = 0; i< asignaturas.lenght; i++){
                System.out.printf("\n%s = %f \n",asignaturas[i],promedios[i]);
                aux +=promedios[i];
        }
        System.out.println("Su promedio general es = " + (aux/promedios.lenght));


    }
}
