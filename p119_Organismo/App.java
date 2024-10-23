package p119_Organismo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Perro miPerro = new Perro("Lassie");
        System.out.println("Mi perro " + miPerro.getNombre() + ", en accion");
        miPerro.respiracion();
        miPerro.movimiento();
        miPerro.crecimiento();
        miPerro.multiCelular();
        miPerro.sangreCaliente();
        miPerro.correr();
        miPerro.cuatroPatas();
        System.out.println();
        
        Perico miPerico = new Perico("Sparrow");
        System.out.println("Mi perico " + miPerico.getNombre() + ", en accion");
        miPerro.respiracion();
        miPerro.movimiento();
        miPerro.crecimiento();
        miPerro.multiCelular();
        miPerro.sangreCaliente();
        miPerico.volar();
        miPerico.dosPatas();
        System.out.println();
    }
}
