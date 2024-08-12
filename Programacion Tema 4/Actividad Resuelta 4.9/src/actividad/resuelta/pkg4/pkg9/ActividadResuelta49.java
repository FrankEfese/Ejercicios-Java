package actividad.resuelta.pkg4.pkg9;

//Repetir la Actividad resuelta 4.4 con una version que calcule el maximo de tres numeros. 
import java.util.Scanner;

public class ActividadResuelta49 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int c = sc.nextInt();

        System.out.println("El numero maximo es : " + numMax3(a, b, c));

    }

    static int numMax(int a, int b) {

        a = Math.max(a, b);
        return a;
    }

    static int numMax3(int a, int b, int c) {

        a = numMax(a, b);
        a = numMax(a, c);

        return a;

    }

}
