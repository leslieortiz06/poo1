package Actividades;
import java.util.Scanner;

public class p57_TablasMultiplicar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char resp;

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Hasta que tabla quieres?: "); int n = obj.nextInt();
            System.out.print("Hasta donde la quieres?: "); int m = obj.nextInt();
    
            for (int i = 1; i <= n; i++) {
                System.out.println("\nTabla del " + i);
                for (int j = 1; j <= m; j++) {
                    System.out.println(i + " x " + j + " = " + i*j);
                }
            }
            System.out.print("\nDeseas continuar (S/N)? "); resp=Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado...");
        obj.close();
    }
}
