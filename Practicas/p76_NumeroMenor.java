package Practicas;
// Diseña un programa con una función que pida 4 números enteros y devuelva el menor de ellos.

import java.util.Scanner;

public class p76_NumeroMenor {
    public static float NumeroMenor(float num1, float num2, float num3, float num4) {
        float menor = 0;
        if (num1 < num2 && num1 < num3 && num1 < num4) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            menor = num2;
        } else if (num3 < num1 && num3 < num2 && num3 < num4) {
            menor = num3;
        } else if (num4 < num1 && num4 < num2 && num4 < num3) {
            menor = num4;
        }
        return menor;
    }
     
    public static void main(String[] args) {
        float num1, num2, num3, num4;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Dame 4 números separados por espacios y te dire cual es el menor de ellos: ");
        num1 = obj.nextFloat(); num2 = obj.nextFloat(); num3 = obj.nextFloat(); num4 = obj.nextFloat();

        System.out.printf("\nEl menor de los 4 números es: %.0f",NumeroMenor(num1, num2, num3, num4));
    }
}