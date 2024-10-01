package Actividades;
import java.util.Scanner;

public class p60_SumaTerminos {
    public static void main(String[] args) {
        int i, j, n;
        float f, s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            s = 0;
            System.out.print("Cuantos números ? ");
            n = obj.nextInt();
            
            for (i = 1; i <= n; i++) {
                f = 1;
                for (j = 1; j <= i; j++) {
                    f = f * j;
                }
                s = s + 1 / f;
                System.out.printf("1/%.0f %s", f, (i == n ? "" : "+ "));
            }
            System.out.printf(" = %f\n", s);
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}