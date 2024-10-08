package p109_Forma;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Rojo", true, 10.23);
        Circulo c2 = new Circulo("Verde", false, 99.12);
        Rectangulo r1 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        Rectangulo r2 = new Rectangulo("Azul", true, 15.0, 44.0);

        System.out.print("\033[H\033[2J");

        System.out.println("Todas las formas: ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("\nCalculando áreas y perimetros de las figuras: ");
        System.out.println("La forma es un Circulo");
        System.out.println("El área es: " + c1.getArea());
        System.out.println("El perimetro es: " + c1.getPerimetro());
        System.out.println("\nLa forma es un Circulo");
        System.out.println("El área es: " + c2.getArea());
        System.out.println("El perimetro es: " + c2.getPerimetro());
        System.out.println("\nLa forma es un Rectangulo");
        System.out.println("El área es: " + r1.getArea());
        System.out.println("El perimetro es: " + r1.getPerimetro());
        System.out.println("\nLa forma es un Rectangulo");
        System.out.println("El área es: " + r2.getArea());
        System.out.println("El perimetro es: " + r2.getPerimetro());
    }
}
