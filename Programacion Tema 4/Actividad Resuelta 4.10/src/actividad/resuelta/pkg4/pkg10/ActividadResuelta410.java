package actividad.resuelta.pkg4.pkg10;

//Diseñar una funcion que calcule el exponente de forma recursiva. 
import java.util.Scanner;

public class ActividadResuelta410 {

    static double factorial(double n, int b) {

        double resultado;

        if (b == 0) {
            resultado = 1;
        } else {
            resultado = n * factorial(n, b - 1);
        }

        return resultado;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base : ");
        double n = sc.nextDouble();
        System.out.println("Introduce el exponente : ");
        int b = sc.nextInt();

        System.out.println(factorial(n, b));
    }

}
