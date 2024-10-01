package Practicas;
/**
 * p90_Temperaturas
 */
public class p90_Temperaturas {
    public static void Mostrar(float[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void ElementosMayoresA10(float[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 10) {
               x[i] = 0; 
            }
        }
    }

    public static void main(String[] args) {
        float[] temps = { 2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f }; 

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Primer elemento: " + temps[0]);
        System.out.println("Tercer elemento: " + temps[2]);
        Mostrar(temps);
        System.out.print("\nElementos mayores de 10 a 0: ");
        ElementosMayoresA10(temps);
        Mostrar(temps);
    }
}