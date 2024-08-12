package actividad.resuelta.pkg4.pkg7;

//Escribir una funcion a la que se le pase un numero entero y devuelva el numero
//de divisores primos que tiene. 
import java.util.Scanner;

public class ActividadResuelta47 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        a = Math.abs(a);

        divisoresPrimos(a);

    }

    static void divisoresPrimos(int n) {

        boolean esDivisor = false;
        boolean esPrimo = false;
        int cont = 0;
        for (int x = 1; x <= n; x++) {

            if (n % x == 0) {
                esDivisor = true;
            }
            for (int j = 1; j <= n; j++) {

                if (x % j == 0) {
                    cont++;
                }

            }

            if (cont <= 2) {
                esPrimo = true;
            }

            if (esDivisor && esPrimo) {
                System.out.println("Es un divisor primo : " + x);
            }

            esDivisor = false;
            esPrimo = false;
            cont = 0;

        }

    }

}
