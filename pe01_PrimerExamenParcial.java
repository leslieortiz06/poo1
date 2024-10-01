//Leslie Nathali Ortiz Sifuentes
/**
 * pe01_PrimerExamenParcial
 */
import java.util.Scanner;

public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        String nombre;
        int edad, totalDin, alumnosC, docentesC, trabajadoresC, rechazados, aceptados, cobro, mujer, hombre;
        int alumnos, docentes, trabajadores, participante, prom, sumaEdades;
        char resp, sexo, tipoPar;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        totalDin = rechazados = aceptados = cobro = mujer = hombre = participante = prom = sumaEdades = 0;
        alumnos = docentes = trabajadores = alumnosC = docentesC = trabajadoresC = 0;
        do {
            participante++;
            System.out.printf("Participante: %d",participante); 
            System.out.print("\nDame tu nombre: ");
            nombre = obj.next();
            System.out.print("Dame tu edad  : ");
            edad = obj.nextInt();
            System.out.print("Dame tu sexo [H] o [M]: ");
            sexo = obj.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            System.out.print("Dame el tipo de participante [A]lumno  [D]ocente  [T]rabajador: ");
            tipoPar = obj.next().charAt(0);
            tipoPar = Character.toUpperCase(tipoPar);
    
            if (edad < 23) {
                rechazados++;
            } else {
                sumaEdades += edad;
                System.out.printf(
                        "\n%s bienvenid@ al curso, ingresas con una edad de %d, eres del sexo %s y tu tipo de participante es %s ",
                        nombre, edad, sexo, tipoPar);
                aceptados++;
                if (sexo == 'M') {
                    mujer++;
                } else if (sexo == 'H') {
                    hombre++;
                }
        
                if (tipoPar == 'A') {
                    alumnosC = 40;
                    alumnosC += cobro;
                    alumnos++;
                } else if (tipoPar == 'D') {
                    docentesC = 60;
                    docentesC += cobro;
                    docentes++;
                } else if (tipoPar == 'T') {
                    trabajadoresC = 80;
                    trabajadoresC += cobro;
                    trabajadores++;
                }
                totalDin = trabajadoresC + docentesC + alumnosC;
                prom = sumaEdades/participante;
            }
    

            System.out.print("\n\nQuieres inscribir a alguien más (S/N)?  ");
            resp = Character.toUpperCase(obj.next().charAt(0));
            System.out.println("\n------------------------------------------");
        } while (resp != 'N');

        System.out.println("\n------------------------------------------");
        System.out.printf("\nEl total de alumnos es de: %d", alumnos);
        System.out.printf("\nEl total de docentes es de: %d", docentes);
        System.out.printf("\nEl total de trabajadores es de: %d", trabajadores);
        System.out.printf("\nEl total de hombres es de: %d", hombre);
        System.out.printf("\nEl total de mujeres es de: %d", mujer);
        System.out.printf("\nEl total de participantes es de: %d", aceptados);
        System.out.printf("\nPromedio de la edad de todos los participantes: %d",prom);
        System.out.printf("\nEl total de rechazados es de: %d", rechazados);
        System.out.println("\n------------------------------------------");
        System.out.printf("\nTotal de dinero recaudado de alumnos: %d", alumnosC);
        System.out.printf("\nTotal de dinero recaudado de docentes: %d", docentesC);
        System.out.printf("\nTotal de dinero recaudado de trabajadores: %d", trabajadoresC);
        System.out.printf("\nTotal de dinero recaudado de todos los participantes es de: %d", totalDin);
        

        if (totalDin < 50) {
        System.out.println("\n\nEl evento concluye con ganancias BAJAS");
        } else if (totalDin > 50 & totalDin <1000) {
        System.out.println("\n\nEl evento concluye con ganancias MODERADAS");
        } else if (totalDin > 1000) {
        System.out.println("\n\nEl evento concluye con BUENAS ganancias.");
        }
    }
}