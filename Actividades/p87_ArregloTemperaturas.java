package Actividades;
/**
 * p87_ArregloTemperaturas - Calcula mayor,promedio y busca en un arreglo de temperaturas
 */
public class p87_ArregloTemperaturas {
    public static void Mostrar(double[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static double Mayor(double[] t) {
        double m = t[0];
        for (int i = 0; i < t.length; i++){
            if (t[i] > m){
                m = t[i];
            }
        }
        return m;
    }

    public static double Menor(double[] t) {
        double m = t[0];
        for (int i = 0; i < t.length; i++){
            if (t[i] < m){
                m = t[i];
            }
        }
        return m;
    }

    public static int Buscar(double[] x, double bus) {
        int pos = -1;
        for (int i = 0; i < x.length; i++){
            if (x[i] == bus){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        double[] temps = { 12.34, 56.22, 56.78, 10.0, 10.25, 60.22, 10.0 };

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Arreglo de temperaturas: ");
        Mostrar(temps);
        System.out.println("El mayor es " + Mayor(temps));
        System.out.println("El menor es " + Menor(temps));

        int bus = 10;
        int pos = Buscar(temps, bus);

        if (pos != -1) {
            System.out.println("Elemento encontrado en la posicion " + pos);
        } else {
            System.out.println("I still Haven't foundfound what I'm Looking For");
        }
    }
}