package Actividades;
// Imprime tabla de conversion de peso a dolar en un rango determinado

import java.util.Scanner;

public class p46_TablaConversion {
    public static void main(String[] args) {
        int ini, fin, c;
        float tc = 19.65f, te = 21.72f;
        char resp;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Tabla de conversion de $Peso a $Dolar y a $Euro");

        do {
            do {
                System.out.print("\nDame inicio: ");
                ini = obj.nextInt();
                System.out.print("\nDame fin: ");
                fin = obj.nextInt();
            } while (fin < ini);

            c = ini;
            System.out.println("Peso \t\t Dollar \t Euro");
            System.out.println("============================================");
            while (c <= fin) {
                System.out.printf("%10d  = %10.2f \t %10.2f\n", c, c * tc, c * te);
                c++;
            }
            System.out.println("============================================");
            System.out.print("\nDeseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
    }
}