package the_chase;


import java.util.InputMismatchException;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int jugadores = 100;
        int simulaciones = 100;
        Acciones juego = new Acciones(jugadores);
        long rondas = juego.Jugar();
        double media = juego.simulacion(100000);
        System.out.println("Rondas totales: " + rondas);
        System.out.println("Media totales: " + media);
    }
}


//2 robots donde en cada robot puedo hacer 3 acciones, moverse, esperar y terminar, hay 100 pos, parten del 0, van por turnos, van moviendose de 1 en 1, hacerlo de la forma mas efectiva

