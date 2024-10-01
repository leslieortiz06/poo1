package Actividades;
import java.util.Scanner;

public class p59_FactorialNumeros {
    public static void main(String[] args) {
        int i, j, n;
        float f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Cuantos números ? ");
            n = obj.nextInt();

            for (i = 1; i <= n; i++) {
                f = 1;
                System.out.printf("%d! = ", i);
                for (j = 1; j <= i; j++) {
                    f = f * j;
                    System.out.printf("%d %s",j,(i==j ? "" : "* " ) );
                }
                System.out.printf("= %.0f ",f);
                System.out.println();
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}