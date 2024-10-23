package p117_FiguraGeometrica;

public class App {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(100);

        System.out.print("\033[H\033[2J");
        System.out.println("Probando circulo: ");
        System.out.println(miCirculo);
        miCirculo.ajustar(0.03);
        System.out.println(miCirculo);

        Rectangulo miRectangulo = new Rectangulo(100, 200);
        System.out.println("Probando rectangulo: ");
        System.out.println(miRectangulo);
        miRectangulo.ajustar(0.5);
        System.out.println(miRectangulo);
    }
}
