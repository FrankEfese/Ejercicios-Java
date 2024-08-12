package actividad.aplicacion.pkg3.pkg19;

//Calcula la raiz cuadrada de un numero natural mediante aproximaciones . En el caso de
//que no sea exacta , muestra el resto. 
import java.util.Scanner;

public class ActividadAplicacion319 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        int cont = 0;

        if (n < 1) {
            System.out.println("ERROR");
        } else {

            for (int x = 1; x <= n; x++) {

                if (Math.pow(x, 2) < n) {
                    cont++;
                } else {
                    if (Math.pow(x, 2) == n) {
                        System.out.println("La raiz cuadrada de : " + n + " es = " + Math.abs(Math.sqrt(n)));
                        System.out.println("Y su resto es : 0");
                    }
                }

            }

            System.out.println("La raiz cuadrada de : " + n + " es = " + Math.sqrt(n));
            System.out.println("Y su resto es : " + (n - (Math.pow(cont, 2))));

        }
    }

}
