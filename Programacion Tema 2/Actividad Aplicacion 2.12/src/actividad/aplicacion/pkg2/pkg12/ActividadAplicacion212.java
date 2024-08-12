package actividad.aplicacion.pkg2.pkg12;

//Diseña una aplicacion en la que , dando el DNI , calcule la letra que le corresponde. 
import java.util.Scanner;

public class ActividadAplicacion212 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu DNI sin letra : ");
        int dni = sc.nextInt();
        if (dni < 10000000 || dni > 99999999) {
            System.out.println("ERROR");
        } else {

            int letra = dni % 23;
          

            switch (letra) {

                case 0 ->
                    System.out.println("TU LETRA : T");
                case 1 ->
                    System.out.println("TU LETRA : R");
                case 2 ->
                    System.out.println("TU LETRA : W");
                case 3 ->
                    System.out.println("TU LETRA : A");
                case 4 ->
                    System.out.println("TU LETRA : G");
                case 5 ->
                    System.out.println("TU LETRA : M");
                case 6 ->
                    System.out.println("TU LETRA : Y");
                case 7 ->
                    System.out.println("TU LETRA : F");
                case 8 ->
                    System.out.println("TU LETRA : P");
                case 9 ->
                    System.out.println("TU LETRA : D");
                case 10 ->
                    System.out.println("TU LETRA : X");
                case 11 ->
                    System.out.println("TU LETRA : B");
                case 12 ->
                    System.out.println("TU LETRA : N");
                case 13 ->
                    System.out.println("TU LETRA : J");
                case 14 ->
                    System.out.println("TU LETRA : Z");
                case 15 ->
                    System.out.println("TU LETRA : S");
                case 16 ->
                    System.out.println("TU LETRA : Q");
                case 17 ->
                    System.out.println("TU LETRA : V");
                case 18 ->
                    System.out.println("TU LETRA : H");
                case 19 ->
                    System.out.println("TU LETRA : L");
                case 20 ->
                    System.out.println("TU LETRA : C");
                case 21 ->
                    System.out.println("TU LETRA : K");
                case 22 ->
                    System.out.println("TU LETRA : E");

            }

        }

    }

}
