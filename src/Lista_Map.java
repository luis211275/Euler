import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lista_Map {
    private static MyScanner sc = new MyScanner();
    public static void main (String[] args) {

        ArrayList<String> productos = new ArrayList<>();
        productos.add("Leche");
        productos.add("Agua");
        productos.add("Huevos");
        productos.add("Aceite");
        productos.add("Pan");


        Map<String,Double> mapa = new HashMap<>();

        for(String producto: productos){
            mapa.put(producto, sc.pedirDecimal("Ingrese el precio --> " + producto + ": "));
        }

        System.out.println("===PRECIO DE LOS PRODUCTOS===");
        for(String producto: mapa.keySet()){
            System.out.println(producto + ": " + mapa.get(producto));
        }
    }
}
