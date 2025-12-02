package caja_registradora;

import java.util.Scanner;

public class MainCaja {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        Datos datos = new Datos();
        Producto producto = new Producto("Sillas", 20, 20);
        Producto producto2 = new Producto("Mesas", 50, 10);
        Producto producto3 = new Producto("Armarios", 100, 5);

        producto.toString();
        producto2.toString();
        producto3.toString();

        int eleccion = sc.pedirNumero("Que producto quieres comprar (1-Sillas || 2: Mesa || 3: Armarios)");

        int cantidad = sc.pedirNumero("¿Cuantos quieres comprar?");

        if (eleccion == 1) {
            datos.Comprar(producto, cantidad);
            producto.toString();
        }else if (eleccion == 2) {
            datos.Comprar(producto, cantidad);
            producto2.toString();
        }else if (eleccion == 3) {
            datos.Comprar(producto, cantidad);
        }else {
            System.out.println("Opcion no valida");
        }

    }
}
