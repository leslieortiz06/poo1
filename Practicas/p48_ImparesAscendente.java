package Practicas;
import java.util.Scanner;

/**
 * p48_ImparesAscendente
 */
public class p48_ImparesAscendente {

    public static void main(String[] args) {
        int c, n, s, ci;
        double p;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            c = 1;
            n = s = ci = 0;
            System.out.println("Imprime impares de forma ascendente de 1 hasta n\n");
            System.out.print("Hasta donde deseas los impares?: ");
            n = obj.nextInt();

            while (c <= n) {
                System.out.printf("%d ", c);
                s += c;
                ci++;
                c += 2;

            }
            p = ci > 0 ? (double) s / ci : 0;
            System.out.printf("\nLa suma de los impares hasta %d es %d ", n, s);
            System.out.printf("\nEl promedio de los impares es %.2f \n", p);

            System.out.print("Deseas continuar (S/N)?: ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
        System.out.println("\nProceso terminado...");
    }
}