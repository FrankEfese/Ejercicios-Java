package actividad.aplicacion.pkg4.pkg12;

//Implementa la funcion distancia (x1 , y1 , x2 , y2) que calcula y devuelve la distancia 
//euclidea que separa los puntos . 
import java.util.Scanner;

public class ActividadAplicacion412 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        double x1 = sc.nextDouble();
        System.out.println("Introduce un numero : ");
        double y1 = sc.nextDouble();
        System.out.println("Introduce un numero : ");
        double x2 = sc.nextDouble();
        System.out.println("Introduce un numero : ");
        double y2 = sc.nextDouble();

        System.out.println("Resultado : " + distancia(x1, y1, x2, y2));

    }

    static double distancia(double x1, double y1, double x2, double y2) {

        double res = Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)));

        return res;

    }

}
