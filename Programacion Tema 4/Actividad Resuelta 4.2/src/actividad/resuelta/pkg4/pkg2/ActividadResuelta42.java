package actividad.resuelta.pkg4.pkg2;

//Escribir una funcion a la que se le pasen dos enteros y muestre todos los
//numeros comprendidos entre ellos. 
import java.util.Scanner;

public class ActividadResuelta42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();

        int c = a;
        a = Math.max(a, b);
        b = Math.min(c, b);

        System.out.println("\nLos numeros comprendidos entre " + b + " y " + a);
        mostrarNum(a, b);

    }

    static void mostrarNum(int a, int b) {

        for (int x = b; x <= a; x++) {

            System.out.println(x);

        }

    }

}
