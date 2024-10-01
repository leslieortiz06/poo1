package Practicas;
// Calcula el volumen de un cilindro

import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
       System.out.print("\033[H\033[2J"); System.out.flush();
       double volumen;
       int radio, altura;
       Scanner obj = new Scanner(System.in);

       System.out.print("Dame el radio: ");
       radio = obj.nextInt();
       System.out.print("Dame la altura: ");
       altura = obj.nextInt();

       volumen = Math.PI * (radio * radio) * altura;

       System.out.println(String.format("\nEl volumen es igual a: "+ volumen));
    }
}