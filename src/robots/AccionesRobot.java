package robots;

import usuario_contraseña.MyScanner;

public class AccionesRobot {
    private static MyScanner sc = new MyScanner();
    private int pos1;
    private int pos2;

    public AccionesRobot(int pos1, int pos2) {
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public int getPos1() {
        return pos1;
    }

    public void setPos1(int pos1) {
        this.pos1 = pos1;
    }

    public int getPos2() {
        return pos2;
    }

    public void setPos2(int pos2) {
        this.pos2 = pos2;
    }

    public void Terminar() {
        System.out.println("Terminando el juego...");
    }

    public void NoMover() {
        System.out.println("Los robots en estas rondas no se moveran");
    }

    public void Mover(int pos1, int pos2) {

        int MoverRobot1 = sc.pedirNumero("Introduce el numero de casillas que quieres que se mueva el primer robot");
        int MoverRobot2 = sc.pedirNumero("Introduce el numero de casillas que quieres que se mueva el segundo robot");
        setPos1(MoverRobot1 + getPos1());
        setPos2(MoverRobot2 + getPos2());


        if (getPos1() >= 100) {
            System.out.println("Bien!!!, el robot uno ha llegado a la meta");
        } else if (getPos2() >= 100) {
            System.out.println("Bien!!!, el robot dos ha llegado a la meta");
        }

    }
}


