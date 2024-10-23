package p116_Juego;

public class App {
    public static void main(String[] args) {
        JuegosDados miDados = new JuegosDados();

        System.out.print("\033[H\033[2J");
        miDados.iniciar();
        miDados.jugar();
        miDados.finalizar();

        JuegoAdivina miAdivina = new JuegoAdivina();
        miAdivina.iniciar();
        miAdivina.jugar();
        miAdivina.finalizar();
    }
}
