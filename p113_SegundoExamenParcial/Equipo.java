package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.Total;
        }
        return total;
    }

    public int getTotalH() {
        int hombres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.Sexo == 'H') {
                hombres++;
            }
        }
        return hombres;
    }

    public int getTotalM() {
        int mujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.Sexo == 'M') {
                mujeres++;
            }
        }
        return mujeres;
    }

    public void reporte() {
        System.out.println(">>" + this);
        System.out.println();
        for (Jugador jugador : jugadores) {
            System.out.println("- " + jugador);
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + nombre + ", Liga=" + liga + ", Jugadores=" + jugadores.size() + ", Bono=" + getTotalBono() + ", Total=" + getTotal() + ", Hombres=" + getTotalH() + ", Mujeres=" + getTotalM() + "]";
    }
}
