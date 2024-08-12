package actividad.aplicacion.pkg2.pkg11;

//Escribe una aplicacion que solicite al usuario un numero comprendido entre 0 y 99999. 
//La aplicacion tendra que indicar si el numero introducido es capicua. 

import java.util.Scanner;

public class ActividadAplicacion211 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int num = sc.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("ERROR");
        } else {
            int aux = num % 10;
            int n = num / 10;
            while (n / 10 != 0) {

                aux *= 10;
                int resto = n % 10;
                n = n / 10;
                aux += resto;

            }
            if (num >= 0 && num < 10) {
                System.out.println("ES CAPICUA");
            } else {

                aux *= 10;
                aux += n % 10;

                if (aux == num) {
                    System.out.println("ES CAPICUA");
                } else {
                    System.out.println("NO ES CAPICUA");
                }

            }

        }

    }

}
