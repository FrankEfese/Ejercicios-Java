package actividad.resuelta.pkg5.pkg3;

//Escribir una aplicacion que solicite al usuario cuantos numeros desea introducir. 
//A continuacion , introducir por teclado esa cantidad de numeros enteros , y por ultimo ,
//mostrar en el orden inverso al introducido. 
import java.util.*;

public class ActividadResuelta53 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros deseas introducir : ");

        int x = sc.nextInt();

        int tabla[] = new int[x];

        for (int i = 0; i < tabla.length; i++) {

            System.out.println("Introduce un numero : ");

            tabla[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(tabla));

        System.out.println("ORDEN INVERSO");

        int tablaDes[] = new int[tabla.length];
        int p = 0;

        for (int j = tabla.length - 1; j >= 0; j--) {

            tablaDes[p] = tabla[j];
            p++;

        }

        System.out.println(Arrays.toString(tablaDes));

    }

}
