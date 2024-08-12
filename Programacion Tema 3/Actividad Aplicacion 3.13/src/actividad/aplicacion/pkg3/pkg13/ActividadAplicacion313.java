package actividad.aplicacion.pkg3.pkg13;

//Escribe un programa que incremente la hora de un reloj. Se pediran por teclado 
//la hora, minutos y segundos , asi como cuantos segundos se desea incrementar la hora
//introducida. La aplicacion mostrara la nueva hora. 
import java.util.Scanner;

public class ActividadAplicacion313 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la Hora : ");
        int hora = sc.nextInt();
        System.out.println("Introduce los Minutos : ");
        int m = sc.nextInt();
        System.out.println("Introduce los Segundos : ");
        int s = sc.nextInt();
        System.out.println("Introduce cuantos segundos quieres aumentar la hora : ");
        int incremento = sc.nextInt();

        s += incremento;

        do {

            if (s > 60) {

                m += (s / 60);
                s = (s % 60);
            }

        } while (s > 59);

        do {
            if (m > 60) {

                hora += (m / 60);
                m = (m % 60);
            }

        } while (m > 59);

        if (hora > 23) {
            hora = 0;
        }

        System.out.println("Hora : " + hora + ":" + m + ":" + s);

    }

}
