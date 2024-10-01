package Practicas;
// Calcula 3er ángulo de un triángulo

import java.util.Scanner;

public class p11_CalcularAngulo {

    public static void main(String[] args) {
       System.out.print("\033[H\033[2J"); System.out.flush();
       double angulo3;
       int angulo1, angulo2;
       Scanner obj = new Scanner(System.in);

       System.out.print("Dame el valor del ángulo 1: ");
       angulo1 = obj.nextInt();
       System.out.print("\nDame el valor del ángulo 2: ");
       angulo2 = obj.nextInt();

       angulo3 = 180-(angulo1 + angulo2);

       System.out.println(String.format("\nEl ángulo es igual a: %.2f ", angulo3));
    }
}