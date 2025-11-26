package the_chase;
import java.util.Random;

public class Acciones {
    private Random random;
    private int numJugadores;
    private int pos1;
    private int pos2;

    public Acciones(int numJugadores) {
        this.numJugadores = numJugadores;
        this.random = new Random();
        this.pos1 = 0;
        this.pos2 = numJugadores/2;
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


    public int getpos1() {
        return pos1;
    }

    public void setDado1(int dado1) {
        this.pos1 = dado1;
    }

    public int getDado2() {
        return pos2;
    }

    public void setDado2(int dado2) {
        this.pos2 = dado2;
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
        pos1 = TirarDado(pos1);
        pos2 = TirarDado(pos2);
        return pos1 == pos2;
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


    public double simulacion(int simular) {
        int numRondas = 0;
        for(int i = 0; i < simular; i++){
            Acciones juego = new Acciones(numJugadores);
            numRondas+=juego.Jugar();
        }
        return (double) numRondas/simular;
    }
}
