package actividad.resuelta.pkg4.pkg6;

//Diseñar una funcion que devolvera true si n es primo y false en caso contrario. 
import java.util.Scanner;

public class ActividadResuelta46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        n = Math.abs(n); // en caso de ser negativo , lo pasamos a positivo. 

        System.out.println("Es " + n + " Primo : " + esPrimo(n));

    }

    static boolean esPrimo(int n) {

        int cont = 0;

        for (int x = 1; x <= n; x++) {

            if (n % x == 0) {
                cont++;
            }

        }

        return cont == 2;

    }

}
