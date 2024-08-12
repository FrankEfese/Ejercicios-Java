package actividad.resuelta.pkg4.pkg11;

//Escribir una funcion que calcule de forma recursiva el maximo comun divisor
//de dos numeros.
import java.util.Scanner;

public class ActividadResuelta411 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();
        int c = a;
        a = Math.max(a, b);
        b = Math.min(c, b);

        if (b == 0) {
            System.out.println("El mcd es : " + a);
        } else {

            System.out.println(mcd(a, b));
        }
    }

    static int mcd(int a, int b) {

        int res;

        if (a % b == 0) {
            res = b;
        } else {

            int aux = b;
            b = a % b;
            a = aux;
            res = mcd(a, b);

        }

        return res;

    }

}
