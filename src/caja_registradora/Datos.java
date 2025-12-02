package caja_registradora;

public class Datos {
    private static MyScanner sc = new MyScanner();
    private double saldo;
    private double dineroCaja;


    public Datos(double saldo, String nombreProducto, double precio, int stock, double dineroCaja) {
        this.saldo = 2000;
        this.dineroCaja = 1000;
    }

    public Datos() {

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDineroCaja() {
        return dineroCaja;
    }

    public void setDineroCaja(double dineroCaja) {
        this.dineroCaja = dineroCaja;
    }


    public boolean Comprar (Producto p, int cantidad){
        if (cantidad <= 0) {
            System.out.println("Cantidad invalida");
            return false;
        }
        double CosteTotal = p.getPrecio() * cantidad;

        if (CosteTotal <= this.getSaldo() && p.getStock() <= cantidad) {
            this.setSaldo(this.getSaldo() - CosteTotal);
            p.reducirStock(cantidad);

            System.out.println("Felicidades, has comprado el producto");

            System.out.println("El precio total es " + CosteTotal);
            double devolucionCliente = sc.pedirDecimal("Introduce el dinero que le quiere dar al cajero para pagar: ");
            double devolucionCaja = devolucionCliente-CosteTotal;
            System.out.println("El precio que la caja devuelve al cliente es " + devolucionCaja);
            setDineroCaja(CosteTotal - devolucionCaja);
            return true;
        }else {
            System.out.println("No puede comprar el producto");
            return false;
        }
    }
}