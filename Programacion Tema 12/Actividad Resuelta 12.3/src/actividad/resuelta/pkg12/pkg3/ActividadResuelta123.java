package actividad.resuelta.pkg12.pkg3;

//Definir la interfaz Pila con parametros genericos. Implementarla en Contenedor. 
//Usar contenedor como Pila , apilaremos nuemros hasta introducir -1. Despues 
//se desapilan todos los numeros y saldran por pantalla.
import java.util.*;

public class ActividadResuelta123 {

    public static void main(String[] args) {

        Pila<Integer> c = new Contenedor<>(new Integer[0]);
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero (-1 para terminar) : ");
        Integer a = sc.nextInt();

        while (a != -1) {

            c.apilar(a);
            System.out.println("Introduce un numero (-1 para terminar) : ");
            a = sc.nextInt();

        }

        Integer b = c.desapilar();

        while (b != null) {

            System.out.println(b);
            b = c.desapilar();
        }

    }

}
