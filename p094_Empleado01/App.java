package p094_Empleado01;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        
        empleado1.Nombre = "Juan Perez";
        empleado1.Edad = 45;
        empleado2.Nombre = "Maria Lopez";
        empleado2.Edad = 25;

        Empleado empleado3;
        empleado3 = new Empleado();
        empleado3.Nombre = "El patito";
        empleado3.Edad = 1;
        
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Empleado 1 " + empleado1.Nombre);
        System.out.println("Empleado 1 " + empleado1.Edad);
        System.out.println(empleado1.toString());
        System.out.println("Empleado 2 " + empleado2.Nombre);
        System.out.println("Empleado 2 " + empleado2.Edad);
        System.out.println(empleado2.toString());
        System.out.println("\nEmpleado 3 ");
        System.out.println(empleado3.toString());
    }
}
