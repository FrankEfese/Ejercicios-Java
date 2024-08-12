package actividad.resuelta.pkg4.pkg4;

//Diseñar una funcion que recibe como parametros dos numeros enteros y
//devuelve el maximo de ambos. 
import java.util.Scanner;

public class ActividadResuelta44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();

        System.out.println("El mayor es : " + numMax(a, b));

    }

    static int numMax(int a, int b) {

        a = Math.max(a, b);
        return a;
    }

}
