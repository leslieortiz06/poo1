package p116_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego{
    private int num, intentos;

    @Override
    public void iniciar() {
        num = 1 + (int) (Math.random() * 100);
    }
    
    @Override
    public void jugar() {
        Scanner obj = new Scanner(System.in);
        int num;
        do {
            System.out.println("\nDame numero entre 1 y 100:"); num = obj.nextInt();
            if (this.num > num) {
                System.out.println("Más abajo...");
            } else if (this.num < num) {
                System.out.println("Más arriba...");
            } 
            intentos ++;
        } while (this.num != num);
        obj.close();
    }
    
    @Override
    public void finalizar() {
        System.out.println("\n" + this.num + " era el numero !!1, ganaste despues de " + intentos);
    }
}
