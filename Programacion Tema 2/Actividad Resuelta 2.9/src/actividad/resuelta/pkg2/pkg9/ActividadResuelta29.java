package actividad.resuelta.pkg2.pkg9;

//Escribir una aplicacion que indique cuantas cifras tiene un numero entero introducido
//por teclado , que estara comprendido entre 0 y 99999. 
import java.util.Scanner;

public class ActividadResuelta29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int num = sc.nextInt();

        if (num > 99999 || num < 0) {
            System.out.println("ERROR");
        } else {
            int cont = 1;

            if (num < 10) {
                System.out.println("Numero de digitos : " + cont);
            } else {

                int aux = num / 10;

                while (aux >= 10) {
                    cont++;
                    aux = aux / 10;

                }
                cont++;

                System.out.println("Numero de digitos : " + cont);
            }

        }

    }

}
