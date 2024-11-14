package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Utileria {
    public static ArrayList<Jugador> inicializarDatos(){
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Leo Messi", 37, 'H', "Casado", "Jugador de primera divicion", 247500));
        datos.add(new Jugador("Aitana Bonmatí", 26, 'M', "Soltera", "Jugadora de primera divicion", 217800));
        datos.add(new Jugador("Cristiano Ronaldo", 39, 'H', "Casado", "Jugador de primera divicion", 434000));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList <Jugador> datos) throws IOException{
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Jugador> desSeralizarDatos(String archivo) throws IOException, ClassNotFoundException{
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>)fpersonas.readObject();
        fpersonas.close();
        return datos;
    }
}
