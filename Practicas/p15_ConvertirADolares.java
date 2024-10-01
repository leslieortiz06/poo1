package Practicas;
// Obtiene el equivalente en dólares.

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double dolar;
        int pesoMx;
        Scanner obj = new Scanner(System.in);
 
        System.out.print("Ingresa una cantidad en pesos: ");
        pesoMx = obj.nextInt();
 
        dolar = (pesoMx/18.69);
 
        System.out.println(String.format("\nTu equivalente en dólares es igual a: "+ dolar)); 
    }
}