package Practicas;
// Calcula la hipotenusa de un triángulo rectángulo 

import java.util.Scanner;

public class p10_HipotenusaTriangulo {

    public static void main(String[] args) {
       System.out.print("\033[H\033[2J"); System.out.flush();
       double hipotenusa;
       int longLado1, longLado2;
       Scanner obj = new Scanner(System.in);

       System.out.print("Dame la longitud del lado 1: ");
       longLado1 = obj.nextInt();
       System.out.print("\nDame la longitud del lado 2: ");
       longLado2 = obj.nextInt();

       hipotenusa = Math.sqrt(longLado1 * longLado1 + longLado2 * longLado2);

       System.out.println(String.format("\nLa hipotenusa es igual a: %.2f ", hipotenusa));
    }
}