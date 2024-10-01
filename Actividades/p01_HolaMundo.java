package Actividades;
// Envia un saludo a la pantalla

public class p01_HolaMundo {
    public static void main(String[] args) {
        String amiga = "Karla";
        String hermana = "Nancy";
        String mensaje = String.format("Tanto %s como %s desean aprender Java",amiga,hermana);

        System.out.println("Hola Mundo desde el Lenguaje Java");
        System.out.println("\nHola amiga " + amiga + " bienvenida a Java");
        System.out.println("\nMi amiga es " + amiga + " mi hermana es " + hermana);
        System.out.println("\n" + mensaje);
    }
}