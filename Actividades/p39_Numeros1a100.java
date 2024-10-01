package Actividades;
// Imprimir numeros del 0 a n, en incrementos de i, usando un ciclo while

import java.util.Scanner;

public class p39_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Imrimiendo los números de 0 a n ");
        System.out.println("Hasta donde       : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("En incrementos de : ");
        int i = new Scanner(System.in).nextInt();

        int c = 0;

        while (c <= n) {
            System.out.printf("Chilaquil %d\n ", c);
            c = c + i;
        }
        System.out.println("\nEl ciclo a terminado...");
        System.out.println(c);
    }
}
