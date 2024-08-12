package actividad.aplicacion.pkg2.pkg17;

//Realiza el juego de la suma , que consiste en que aparezcan dos numeros aleatorios entre 1 y 99
//que el ususario tiene que suamar. La aplicacion debe indicar si el resultado es correcto o no.
import java.util.Scanner;

public class ActividadAplicacion217 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = (int) (Math.random() * 99 + 1);
        int y = (int) (Math.random() * 99 + 1);

        System.out.println("Realiza la suma de estos dos numero : " + x + " + " + y);

        int res = sc.nextInt();

        if (res == (x + y)) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("FALLASTE");
        }
    }

}
