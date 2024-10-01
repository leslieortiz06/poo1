package Practicas;
import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Dame un número entre el 1 y 6 y te dire un continente: ");
        int cont = new Scanner(System.in).nextInt();

        switch (cont) {
            case 1:
                System.out.println("\nAsia");
                break;
            case 2:
                System.out.println("\nÁfrica");
                break;
            case 3:
                System.out.println("\nAmérica del Norte");
                break;
            case 4:
                System.out.println("\nAmérica del Sur");
                break;
            case 5:
                System.out.println("\nAntartida");
                break;
            case 6:
                System.out.println("\nEuropa");
                break;

            default:
                System.out.println("\nEl número que ingresaste no esta entre 1 y 6");
                break;
        }
        System.out.println("\nGracias por usar el sistema...");
    }
}
