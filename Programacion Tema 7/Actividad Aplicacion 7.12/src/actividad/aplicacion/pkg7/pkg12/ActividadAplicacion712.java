package actividad.aplicacion.pkg7.pkg12;

//Implementa una clase que permita resolver ecuaciones de segundo grado . Los coeficientes 
//pueden indicarse en el constructor y modificarse a posteriori. Es fundamental que la
//clase disponga de un metodo que devuelva distintas soluciones y de un metodo que nos informe si 
//el discriminante es positivo. 
import java.util.*;

public class ActividadAplicacion712 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de a:");
        double a = sc.nextDouble();

        System.out.println("Ingrese el valor de b:");
        double b = sc.nextDouble();

        System.out.println("Ingrese el valor de c:");
        double c = sc.nextDouble();

        Ecuacion ccc = new Ecuacion(a, b, c);

        ccc.discriminantes();
        ccc.solucion();
    }

}
