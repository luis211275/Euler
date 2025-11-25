package the_chase;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Acciones {
    private static MyScanner sc = new MyScanner();
    private Random random;
    private int numJugadores;
    private int dado1;
    private int dado2;

    public Acciones(int numJugadores) {
        this.numJugadores = numJugadores;
        this.random = new Random();
        this.dado1 = 0;
        this.dado2 = numJugadores/2;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public int getDado1() {
        return dado1;
    }

    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }

    public int getDado2() {
        return dado2;
    }

    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }


    public int Lanzar() {
        return random.nextInt(6) + 1;
    }


    public int TirarDado(int posicion){
        int resultado = Lanzar();

        if(resultado == 1){
            return (posicion - 1 + numJugadores) % numJugadores;
        }
        else if(resultado == 6){
            return (posicion + 1) % numJugadores;
        }
        return posicion;
    }


    public boolean jugarRonda(){
        dado1 = TirarDado(dado1);
        dado2 = TirarDado(dado2);
        return dado1 == dado2;
    }


    public long Jugar () {
        long rondas = 0;

        while(true){
            rondas++;
            if(jugarRonda()){
                return rondas;
            }
        }
    }
}
