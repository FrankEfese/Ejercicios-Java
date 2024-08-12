package actividad.resuelta.pkg2.pkg6;

//Realizar de nuevo la Actividad Resuelta 2.3 considerando el caso 
//de que los numeros introducidos sean iguales. 

import java.util.Scanner;

public class ActividadResuelta26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("El mayor es : " + a);
        } else {
            if (a < b) {
                System.out.println("El mayor es : " + b);
            } else {
                System.out.println("SON IGUALES");
            }
        }

    }

}
