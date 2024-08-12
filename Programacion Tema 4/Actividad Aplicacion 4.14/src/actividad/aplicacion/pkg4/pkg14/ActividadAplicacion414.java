package actividad.aplicacion.pkg4.pkg14;

//Escribe una funcion a la que se le pase como parametros una cantidad de dias , horas y
//minutos. La funcion calculara y devolvera el numero de segundos que existen en 
//los datos de entrada. 
import java.util.Scanner;

public class ActividadAplicacion414 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cantidad de Dias : ");
        int d = sc.nextInt();
        System.out.println("Introduce una cantidad de Horas : ");
        int h = sc.nextInt();
        System.out.println("Introduce una cantidad de Minutos : ");
        int m = sc.nextInt();
        System.out.println("La cantidad de segundos es : " + cantSeg(d, h, m));

    }

    static int cantSeg(int d, int h, int m) {

        h += (d * 24);
        m += (h * 60);
        int s = (m * 60);

        return s;

    }

}
