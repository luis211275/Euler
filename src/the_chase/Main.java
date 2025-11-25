package the_chase;


import java.util.InputMismatchException;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int jugadores = 100;
        Acciones juego = new Acciones(jugadores);
        long rondas = juego.Jugar();
        System.out.println("Rondas totales: " + rondas);
    }
}
