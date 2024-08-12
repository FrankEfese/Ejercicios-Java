package actividad.aplicacion.pkg4.pkg16;

//Implementa la funcion divisoresPrimos() que muestra por consola todos los
//divisores primos del numero que se le pasa. 
import java.util.Scanner;

public class ActividadAplicacion416 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        n = Math.abs(n);

        System.out.println("Los divisores primos de : " + n);
        divPrimos(n);
    }

    static void divPrimos(int n) {

        boolean esDiv = false;
        int cont = 0;

        for (int x = 1; x <= n; x++) {

            if (n % x == 0) {
                esDiv = true;
            }
            for (int j = 1; j <= n; j++) {

                if (x % j == 0) {
                    cont++;
                }

            }
            if (cont <= 2 && esDiv) {

                System.out.println(x);

            }

            esDiv = false;
            cont = 0;
        }

    }

}
