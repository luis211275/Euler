
public class InicioSesion {
    private static final MyScanner sc = new MyScanner();
    public static void main(String[] args) {
        int ejercicio = sc.pedirNumero("Ingrese el ejercicio que quiere ejecurar");
        switch (ejercicio) {
            case 1:
                System.out.println("===CUADRADOS PERFECTOS===");
                long suma = 0;
                for (int i = 1; i <= 794000; i++) {
                    long potencia = (long) i * i;
                    if (potencia % 2 != 0){
                        suma += potencia;
                    }
                }
                System.out.println(suma);
                break;








            case 2:
                System.out.println("===MULTIPLOS DE 3 O DE 5===");
                long suma1 = 0;
                for (int i = 1; i < 1000; i++) {
                    if (i % 3 == 0 || i % 5 == 0){
                        suma1 += i;
                    }
                }
                System.out.println(suma1);
                break;





            case 3:
                System.out.println("===Numero Fibonacci===");
                int num2 = 4000000;
                long suma2 = 0;
                long a = 0;
                long b = 1;
                while (true){
                    long c = a + b;


                        if (c > num2) {
                            break;

                        }
                    if (c % 2 == 0) {
                        System.out.println(c);
                        suma2 += c;

                    }
                    a = b;
                    b = c;
                }
                System.out.println(suma2);








            case 4:
                System.out.println("===Factores primos===");
                long num3 = 600_851_475_143L;
                long factor = 2;
                long FactorMayor = 1;

                while (factor * FactorMayor <= num3) {

                    if (num3 % factor == 0) {
                        FactorMayor = factor;
                        num3 /= factor;
                    }else  {
                        factor++;
                    }
                }
                if (num3 > 1){
                    FactorMayor = num3;
                }
                System.out.println("El mayor factor primo es " + FactorMayor);
        }
    }
}
