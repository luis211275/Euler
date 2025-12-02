package usuario_contraseña;

import java.util.Scanner;

public class Main {
    private static MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        Datos datos = new Datos();
        String nombre = sc.pedirSoloTexto("Introduce el nombre del usuario");
        datos.setNombre(nombre);

        String contraseña = sc.pideContraseña("Introduce la contraseña");
        datos.setContraseña(contraseña);

        String gmail = sc.PedirEmail("Introduce el email");
        datos.setGmail(gmail);

        System.out.println("TODOS LOS PARAMETROS HAN SIDO INTRODUCIDOS CORRECTAMENTE");
    }
}
