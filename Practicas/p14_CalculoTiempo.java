package Practicas;
// Calcula su equivalente en días, minutos y segundos

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int horasTotales, horasRestantes, dias, minutos, segundos;

        Scanner obj = new Scanner(System.in);

        System.out.print("Introduce la cantidad de horas: ");
        horasTotales = obj.nextInt();

        dias = horasTotales / 24;
        horasRestantes = horasTotales % 24;

        minutos = horasRestantes * 60;
        segundos = minutos * 60;

        System.out.println(horasTotales + " horas son equivalentes a:");
        System.out.println(dias + " días");
        System.out.println(horasRestantes + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
    }
}