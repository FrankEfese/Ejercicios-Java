package actividad.resuelta.pkg9.pkg2;

//Utilizando la lista anterior escribir un programa en el que se encolen numeros enteros
//introducidos por teclado hasta que se introduzca uno negativo. A continuacion
//desencolarlos todos a medida que salen por pantalla. 
import java.util.*;

public class ActividadResuelta92 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n;
        Lista l = new Lista();

        do {

            System.out.println("Intorduce un numero (Negativo para terminar) : ");
            n = sc.nextInt();

            if (n >= 0) {
                l.encolar(n);
            }

        } while (n >= 0);

        for (int x = l.tabla.length - 1; x >= 0; x--) {
            System.out.println(l.desencolar());
        }
    }

}
