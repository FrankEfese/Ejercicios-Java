package actividad.aplicacion.pkg3.pkg14;

//Realiza un programa que nos pida un numero n y nos diga cuantos numeros hay entre 
//1 y n que sean primos. 
import java.util.Scanner;

public class ActividadAplicacion314 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("ERROR");
        } else {
            int cont = 0;

            for (int x = 1; x <= n; x++) {
                for (int j = 1; j <= n; j++) {

                    if (x % j == 0) {
                        cont++;
                    }
                }
                if (cont == 2 || cont == 1) {
                    System.out.println(x + " es PRIMO ");
                }
                cont = 0;
            }
        }

    }

}
