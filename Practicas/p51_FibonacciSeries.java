package Practicas;
import java.util.Scanner;

public class p51_FibonacciSeries {
    public static void main(String[] args) {
        char resp;
        int n, a, b, i, temp;
        Scanner obj = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("¿Número de términos que deseas imprimir ?: ");
            n = obj.nextInt();
            a = 0;
            b = 1;

            System.out.println("\nLos primeros " + n + " términos de la sucesión Fibonacci son:");
            for (i = 0; i < n; i++) {
                System.out.print(a + " ");
                temp = a;
                a = b;
                b = temp + b;
            }
            System.out.print("\n\nDeseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
        System.out.println("\nProceso terminado");
    }
}