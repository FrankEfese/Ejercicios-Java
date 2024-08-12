package actividad.resuelta.pkg4.pkg3;

//Realizar una funcion que calcule y muestre el area o el volumen de un cilindro,
//segun se especifique . Para distinguir un caso de otro se le pasara como opcion numero
//1 : (area) o 2 (para volumen). Ademas hay que pasarle a la funcion el radio de la base
//y la altura. 
import java.util.Scanner;

public class ActividadResuelta43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int eleccion;

        System.out.println("Introduce 1 para calcular el area / Introduce 2 para el volumen : ");
        do {
            eleccion = sc.nextInt();
        } while (eleccion > 2 || eleccion < 1);

        System.out.println("Introduce el radio : ");
        double radio = sc.nextDouble();
        System.out.println("Introduce la altura : ");
        double altura = sc.nextDouble();

        cilindro(eleccion, radio, altura);

    }

    static void cilindro(int elec, double r, double a) {

        double res;

        if (elec == 1) {

            res = (2 * Math.PI * r * (a + r));

            System.out.println("El area del Cilindro es : " + res);

        } else {

            res = Math.PI * Math.pow(r, 2) * a;

            System.out.println("El volumen del Cilindro es : " + res);

        }

    }

}
