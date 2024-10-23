package p118_Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora miCalc = new Calculadora();

        System.out.print("\033[H\033[2J");
        miCalc.sumar(5, 10);
        miCalc.restar(35, 15);
        miCalc.dividir(18, 9);
        miCalc.multiplicar(45, 6);
    }
}
