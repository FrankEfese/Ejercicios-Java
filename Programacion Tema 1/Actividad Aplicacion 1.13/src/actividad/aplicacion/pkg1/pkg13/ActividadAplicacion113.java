package actividad.aplicacion.pkg1.pkg13;

//Modifica la Actividad de Aplicacion 1.12 para que , indicando dos numeros n y m ,
//diga que cantidad hay que sumarle a n para que sea multiplo de m.
import java.util.Scanner;

public class ActividadAplicacion113 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero multiplo : ");
        int m = sc.nextInt();
        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        int multiplo = 0;
        while (multiplo * m < n) {
            multiplo++;
        }

        int cantidad = (multiplo * m) - n;
        System.out.println("La cantidad que hay que suma para que " + n + " sea multiplo de " + m + " es : " + cantidad);

    }

}
