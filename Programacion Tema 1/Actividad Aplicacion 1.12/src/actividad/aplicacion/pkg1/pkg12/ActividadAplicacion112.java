package actividad.aplicacion.pkg1.pkg12;

//Escribe un programa que tome como entrada un numero entero e indique que cantidad 
//hay que sumarle para que el resultado sea multiplo de 7.
import java.util.Scanner;

public class ActividadAplicacion112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero : ");
        int num = sc.nextInt();
        int multiplo = 0;
        while (multiplo * 7 < num) {

            multiplo++;

        }

        int res = (multiplo * 7) - num;
        System.out.println("Lo que hay que sumar para que sea multiplo de 7 : " + res);

    }

}
