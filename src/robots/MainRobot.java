package robots;

import usuario_contraseña.MyScanner;

public class MainRobot {
    private static MyScanner sc = new MyScanner();
    public static void main (String[] args) {
        AccionesRobot acciones = new AccionesRobot(0,0);
        System.out.println("=====JUEGO DEL ROBOT=====");

        System.out.println("Que vas a querer que hagan los robots:");
        int accion = sc.pedirNumero("Introduce los numeros que corresponden: \n 1. Mover. \n 2. No Mover. \n 3. Terminar. \n Solución: ");

        do {

            if (accion == 1) {
                acciones.Mover(0,0);
                return;
            }else if (accion == 2) {
                acciones.NoMover();
                return;
            }else if (accion == 3) {
                acciones.Terminar();
                return;
            }else  {
                System.out.println("Opcion incorrecta");
            }
        }while (accion != 3);

    }
}
