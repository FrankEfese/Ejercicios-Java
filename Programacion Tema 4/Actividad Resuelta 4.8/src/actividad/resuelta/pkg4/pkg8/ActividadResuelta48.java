package actividad.resuelta.pkg4.pkg8;

//Diseñar la funcion calculadora() a la que se le pasan dos numeros reales y que operacion
//se desea realizar . (1 para suma , 2 para resta , 3 para multiplicar y 4 para dividir).
//La funcion devolvera el resultado. 
import java.util.Scanner;

public class ActividadResuelta48 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige :");
        System.out.println("1-Para Sumar");
        System.out.println("2-Para Restar");
        System.out.println("3-Para Multiplicar");
        System.out.println("4-Para Dividir");
        int eleccion;

        do {
            eleccion = sc.nextInt();

        } while (eleccion > 4 || eleccion < 1);

        System.out.println("Introduce el primer numero : ");
        double n = sc.nextDouble();
        System.out.println("Introduce el segundo numero : ");
        double m = sc.nextDouble();

        System.out.println("El resultado es : " + calculadora(eleccion, n, m));

    }

    static double calculadora(int elec, double n, double m) {

        double res = 0;

        switch (elec) {

            case 1:
                res = n + m;
                break;

            case 2:
                res = n - m;

                break;
            case 3:
                res = n * m;

                break;
            case 4:
                res = n / m;
                break;

        }

        return res;

    }

}
