package actividad.aplicacion.pkg3.pkg17;

//Para dos numeros dados a y b , es posible buscar el maximo comun divisor mediante un algoritmo
//ineficiente pero sencillo : desde el menor de a y b , ir buscando , de forma decreciente , el primer 
//numero que divide a ambos simultaneamente. 
import java.util.Scanner;

public class ActividadAplicacion317 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aux;

        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();

        a = Math.max(a, b);
        b = Math.min(a, b);

        if (a < 1 || b < 1) {
            System.out.println("ERROR");
        } else {

            do {

                aux = a % b;
                if (aux == 0) {
                    System.out.println("El mcd es : " + b);
                } else {
                    a = b;
                    b = aux;
                }

            } while (aux != 0);

        }

    }

}
