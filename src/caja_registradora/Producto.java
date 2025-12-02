package caja_registradora;

public class Producto {
    private String NombreProducto;
    private double precio;
    private int stock;

    public Producto(String nombreProducto, double precio, int stock) {
        NombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean reducirStock(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("Cantidad invalida");
            return false;
        }
        if (cantidad > stock) {
            System.out.println("No hay suficiente stock");
            return false;
        }
        this.stock -= cantidad;
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "NombreProducto='" + NombreProducto + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
