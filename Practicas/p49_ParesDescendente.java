package Practicas;
import java.util.Scanner;

/**
 * p49_ParesDescendente
 */
public class p49_ParesDescendente {

    public static void main(String[] args) {
        int c, n, s, ci;
        double p;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            n = s = ci =0;
            System.out.println("Imprime pares de forma ascendente de 100 hasta n\n");
            System.out.print("Hasta donde deseas los pares? ");
            n = obj.nextInt();

            c = 100;

            while (c >= n) {
                System.out.printf("%d ", c);
                s += c;
                ci++;
                c -= 2;

            }
            p = ci > 0 ? (double) s / ci : 0;
            System.out.printf("\nLa suma de los pares hasta %d es %d \n", n, s);
            System.out.printf("\nEl promedio de los impares es %.2f \n", p);

            System.out.print("Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
        System.out.println("\nProceso terminado");
    }
}