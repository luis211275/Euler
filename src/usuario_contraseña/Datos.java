package usuario_contraseña;

import java.util.Scanner;

public class Datos {
    Scanner sc = new Scanner(System.in);

    private String nombre;
    private String gmail;
    private String contraseña;


    public Datos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String setContraseña(String contraseña) {
        this.contraseña = contraseña;
        return contraseña;
    }



    @Override
    public String toString() {
        return "Datos{" +
                "nombre='" + nombre + '\'' +
                ", gmail='" + gmail + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
