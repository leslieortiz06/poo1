package Actividades;
// Imprime numeros del n a 1, en decrementos de d con while

import java.util.Scanner;

public class p40_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Imprimiendo numeros del n a 1 en decrementos de d\n");
        System.out.println("Desde donde quieres descender: ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Decrementos de: ");
        int d = new Scanner(System.in).nextInt();

        while (c <= 1) {
            System.out.printf("%d ", c);
            c = c - d;
        }
        System.out.println("El ciclo a terminado...");
        System.out.println(c);
    }
}