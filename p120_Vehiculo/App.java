package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Sedan m1 = new Sedan("Vochito", "Maria Diaz", 4);
        System.out.println(m1);
        System.out.println();
        m1.sistemaElectrico();
        m1.combustioninterna();
        m1.carroceriaTres();
        m1.chasisMonocasco();
        m1.repostar();
        m1.arrancar();
        m1.frenado();
        System.out.println();

        Suv m2 = new Suv("La mamalona", "Carlos Castañeda", 6);
        System.out.println(m2);
        System.out.println();
        m2.sistemaElectrico();
        m2.combustioninterna();
        m2.traccion4x4();
        m2.chasisIndependiente();
        m2.repostar();
        m2.arrancar();
        m2.frenado();
    }
}
