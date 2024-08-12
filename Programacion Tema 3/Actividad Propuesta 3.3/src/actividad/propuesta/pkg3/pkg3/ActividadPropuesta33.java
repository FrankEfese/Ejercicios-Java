package actividad.propuesta.pkg3.pkg3;

//Implementa un programa que pida al usuario un numero positivo y lo muestre guarismo 
//a guarismo . Por ejemplo , para el numero 123, debe mostrar primero el 3 , despues 2 y despues 1. 
import java.util.Scanner;

public class ActividadPropuesta33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero positivo : ");
        int n = sc.nextInt();
        int aux;

        if (n < 0) {
            System.out.println("ERROR");
        } else {

            if (n >= 0 && n < 10) {
                System.out.println("Su guarismo : " + n);
            } else {

                System.out.println("EL GUARISMO DE " + n);
                do {
                    aux = n % 10;
                    n = n / 10;
                    System.out.println(aux);
                } while (n > 10);

                System.out.println(n % 10);

            }

        }

    }

}
