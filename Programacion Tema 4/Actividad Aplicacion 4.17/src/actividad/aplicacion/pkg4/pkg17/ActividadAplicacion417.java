package actividad.aplicacion.pkg4.pkg17;

//Escribe una funcion que decida si dos numeros enteros positivos son amigos. 
//Son amigos si la suma de los divisores propios de a es igual a b. 
import java.util.Scanner;

public class ActividadAplicacion417 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        amigos(a, b);

    }

    static void amigos(int a, int b) {

        int sumaA = 0;
        int sumaB = 0;

        for (int x = 1; x < a; x++) {

            if (a % x == 0) {
                sumaA += x;
            }
        }

        for (int x = 1; x < b; x++) {

            if (b % x == 0) {
                sumaB += x;
            }
        }

        if (sumaA == b && sumaB == a) {
            System.out.println("SON AMIGOS");
        } else {
            System.out.println("NO LO SON");
        }

    }

}
