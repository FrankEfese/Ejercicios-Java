package actividad.aplicacion.pkg4.pkg11;

//Diseña una funcion que calcule y muestre la superficie y el volumen de una esfera. 
import java.util.Scanner;

public class ActividadAplicacion411 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio de la esfera : ");
        double radio = sc.nextDouble();
        radio = Math.abs(radio); // Nos aseguramos de que no sea negativo. 

        esfera(radio);

    }

    static void esfera(double r) {

        double s = (4 * Math.PI) * (Math.pow(r, 2));
        double v = (4 * Math.PI) / 3 * (Math.pow(r, 3));

        System.out.println("La superficie es : " + s);
        System.out.println("El volumen es : " + v);

    }

}
