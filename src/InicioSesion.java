
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
                break;







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
                break;


            case 5:
                System.out.println("===Divisibles del 1 al 20===");


                long num = 20;

                while (true){
                    boolean div = true;

                    for (int i = 1; i <= 20 ; i++) {

                        if (num % i != 0) {
                            div = false;
                            break;
                        }
                    }
                        if (div) {
                            System.out.println("El numero " + num + " es divisible entre todos los numeros del 1 al 20");
                            break;
                        }
                        num++;
                }
                break;



            case 6:
                System.out.println("===Suma de cuadrados del 1 al 100===");
                long sum = 0;
                long sumacuadrado = 0;

                for (int i = 1; i <= 100 ; i++) {

                    //suma de cuadrados
                    sum += i;
                    sumacuadrado += i * i;
                }
                //cuadrado de la suma
                long cuadradoSuma = sum * sum;
                // resta de las dos
                long resta = cuadradoSuma - sumacuadrado;

                System.out.println("La diferencia entre la suma de cuadrado y el cuadrado de la suma es " + resta);




//meter un usuario con un password cn minimo una MAYUS un un numero y un simbolo signo 8 caracteres, si no se cumble devolver info, otro login y compararlo login debe ser un correo gmai/hotmail, cuando pida el nombre, solo letras no numeros, si aciertan se les devuelve el nombre de usuario







            case 7:
                System.out.println("===Resta de cuadrados del 1 al 100===");

        }
    }
}
