package Practicas;
import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        double tempInicial, tempFinal, celsius, fahrenheit;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();

            System.out.println("Convertir de grados Centigrados a Farenheit\n");
            System.out.print("Introduce la temperatura inicial en grados Celsius: ");
            tempInicial = obj.nextDouble();

            System.out.print("Introduce la temperatura final en grados Celsius: ");
            tempFinal = obj.nextDouble();

            System.out.println("\nTemperaturas en grados Fahrenheit: \n");

            celsius = tempInicial;
            while (celsius <= tempFinal) {
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("%.2f °C   =   %.2f °F%n", celsius, fahrenheit);
                celsius ++;
            }
            
            System.out.print("\nDeseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
        System.out.println("\nProceso terminado");
    }
}