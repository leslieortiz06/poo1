package Actividades;
// Verifica si un número es positivo, negativo o cero 

import java.util.Scanner;

public class p21_VerificaNumero {
    public static void main(String[] args) {
        int n;
        System.out.println("Verifica si un número es positivo, negativo o cero\n");
        System.out.print("Dame un número: ");
        n = new Scanner(System.in).nextInt();

        if (n>0) System.out.println("El número " + n + " es positivo");
        if (n<0) System.out.println("El número " + n + " es negativo");
        if (n==0) System.out.println("El número " + n + " es cero");

        System.out.println("\nGracias por utilizar este programa\n");
    }
}