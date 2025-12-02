package usuario_contraseña;

import java.util.Scanner;

public class Datos {

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

}
