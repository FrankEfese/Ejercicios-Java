package actividad.aplicacion.pkg4.pkg15;

//Diseña una funcion a la que se le pasan las horas y minutos de dos instantes de tiempo ,
//la funcion devolvera la cantidad de minutos que existen de diferencia entre los dos instantes. 
import java.util.Scanner;

public class ActividadAplicacion415 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cantidad de Horas : ");
        int h = sc.nextInt();
        System.out.println("Introduce una cantidad de Minutos : ");
        int m = sc.nextInt();
        System.out.println("Introduce una cantidad de Horas : ");
        int h2 = sc.nextInt();
        System.out.println("Introduce una cantidad de Minutos : ");
        int m2 = sc.nextInt();

        System.out.println("La diferencia de minutos es : " + diferencia(h, m, h2, m2));

    }

    static int diferencia(int h, int m, int h2, int m2) {

        m += (h * 60);
        m2 += (h2 * 60);
        int aux = m;
        m = Math.max(m, m2);
        m2 = Math.min(aux, m2);

        return m - m2;

    }

}
