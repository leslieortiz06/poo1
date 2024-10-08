package p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Compacto c1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        Compacto c2 = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);

        Camioneta ca1 = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        Camioneta ca2 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);
        
        System.out.print("\033[H\033[2J");
        
        System.out.println("Datos de los Vehiculos de la flota\n");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();
        System.out.println(ca1);
        System.out.println(ca2);

        System.out.println("\nCalculando el total de precio de todos los vehiculos...");
        System.out.println(c1.getPrecio());
        System.out.println(c2.getPrecio());
        System.out.println(ca1.getPrecio());
        System.out.println(ca1.getPrecio());
        System.out.println("La suma de precios es: " + (c1.getPrecio() + c2.getPrecio() + ca1.getPrecio() + ca2.getPrecio()));

    }
}
