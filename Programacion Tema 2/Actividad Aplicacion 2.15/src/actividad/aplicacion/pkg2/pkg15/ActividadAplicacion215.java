package actividad.aplicacion.pkg2.pkg15;

//Escribe una aplicacion que solicite por consola dos numeros reales que corresponden 
//a la base y a la altura de un triangulo. Debera mostrarse su area , comprobando que los 
//numeros introducidos por el usuario no son negativos . 
import java.util.Scanner;

public class ActividadAplicacion215 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base : ");
        int base = sc.nextInt();
        System.out.println("Introduce la altura : ");
        int altura = sc.nextInt();

        if (base < 0 || altura < 0) {
            System.out.println("NO PUEDEN SER NEGATIVOS");
        } else {

            int res = (base * altura) / 2;
            System.out.println("El area es : " + res);
        }

    }

}
