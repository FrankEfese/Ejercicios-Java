package actividad.resuelta.pkg4.pkg12;

//Diseñar una funcion recursiva que calcule el enesimo termino de la serie fibonacci. 
import java.util.Scanner;

public class ActividadResuelta412 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero menor de 40 : ");
        int n = sc.nextInt();

        int res = fibo(n);
        System.out.println("Fibonacci : " + res);
    }

    static int fibo(int n) {
        int res;

        if (n == 0 || n == 1) {
            res = 1;
        } else {

            res = fibo(n - 1) + fibo(n - 2);
        }
        return res;
    }

}
