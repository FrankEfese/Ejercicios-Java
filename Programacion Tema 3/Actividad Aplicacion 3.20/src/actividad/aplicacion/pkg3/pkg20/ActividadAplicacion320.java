package actividad.aplicacion.pkg3.pkg20;

//Escribe un programa que solicite al usuario las distintas cantidades de dinero 
//de las que dispone. La aplicacion mostrara la suma total .La manera de especificar 
//que no se desea introducir mas cantidades es mediante el cero. 
import java.util.Scanner;

public class ActividadAplicacion320 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double cantidad = 0;
        double n;

        do {
            System.out.println("Introduce las cantidades de dinero que tienes : (para terminar pulsa 0) ");
            n = sc.nextDouble();

            if (n > 0) {

                cantidad += n;

            }

        } while (n != 0);

        System.out.println("El total de dinero es : " + cantidad);

    }

}
