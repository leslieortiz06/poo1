package p106_Persona;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan Perez", "Sierra de Cardos 123", 41);
        Persona p2 = new Persona("María Diaz", "Lo de Vega 34", 25);

        Estudiante e1 = new Estudiante("Carolos Castañeda", "Sierra Nevada 123", 25, "Ing de Software", 2000, 700);
        Estudiante e2 = new Estudiante("Miguel Perez", "Av. Hidalgo 345", 35, "Robotica", 2000, 300);

        Apoyo a1 = new Apoyo("Pablo Brayan", "Av. Mexico 114", 25, "Preparatoria", "Jardinero", 1500);
        Apoyo a2 = new Apoyo("Maclovia", "Lomas del pedregal 145", 40, "Preparatoria", "Lic. Contabilidad", 2500);


        System.out.print("\033[H\033[2J");

        System.out.println("Personas");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\nEstudiantes");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1 instanceof Persona);

        System.out.println("\nPersona apoyo");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 instanceof Persona);
    }
}
