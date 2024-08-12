package actividad.aplicacion.pkg2.pkg16;

//Utiliza el operador ternario para calcular el valor absoluto de un numero , que 
//se solicita al usuario por teclado. 
import java.util.Scanner;

public class ActividadAplicacion216 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        double num = sc.nextDouble();

        num = num > 0 ? num : Math.abs(num);

        System.out.println("El valor absoluto : " + num);

    }

}
