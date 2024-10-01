package Actividades;
// Muestra la estación del año que corresponde al número introducido;

import java.util.Scanner;

public class p25_EstacionesAño {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("\nDame un número entre 1 y4 y te dire q estacion del año es: ");
        int n = new Scanner(System.in).nextInt();

        if (n>=1 && n<=4) {
            System.out.println("Chido");
            if(n==1) System.out.println("\nPrimavera");
            if(n==2) System.out.println("\nVerano");
            if(n==3) System.out.println("\nOtoño");
            if(n==4) System.out.println("\nInvierno");
        }
        else{
            System.out.println("\nEsas estaciones del año no existen !!! ");
        }
        System.out.println("\nVamonos al comedor...");
    }   
}
