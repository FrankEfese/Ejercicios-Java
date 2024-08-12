package actividad.aplicacion.pkg3.pkg18;

//De forma similar a la Actividad Aplicacion 3.17 , implementa un algoritmo que calcule
//el minimo comun multiplo de dos numeros dados. 
import java.util.Scanner;

public class ActividadAplicacion318 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aux;
        int mcm;

        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();

        a = Math.max(a, b);
        b = Math.min(a, b);

        int m = a; // Variables Auxiliares
        int n = b; // Variables Auxiliares

        if (a % b == 0) {

            aux = a / b;

            System.out.println("El mcm es : " + (a * b) / aux);

        } else {

            do {

                aux = a % b;
                a = b;
                b = aux;

            } while (a % b != 0);

            System.out.println("El mcm es : " + (m * n) / aux);

        }
    }

}
