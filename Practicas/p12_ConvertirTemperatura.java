package Practicas;
// Convierte una temperatura de grados fahrenheit a grados celsius,

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
       System.out.print("\033[H\033[2J"); System.out.flush();
       double celsius, fahrenheit;
       Scanner obj = new Scanner(System.in);

       System.out.print("Dame los grados fahrenheit: ");
       fahrenheit = obj.nextDouble();

       celsius = (fahrenheit-32) * (5.0/9.0);

       System.out.println(String.format("\nLos grados celsius son igual a: "+ celsius));
    }
}