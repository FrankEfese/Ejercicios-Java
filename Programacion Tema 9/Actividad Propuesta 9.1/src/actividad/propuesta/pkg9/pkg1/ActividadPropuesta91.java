package actividad.propuesta.pkg9.pkg1;

//Utilizando la lista anterior escribe un programa en el que se apilen numeros enteros introducidos por teclado
//hasta que se introduzca uno negativo. A continuacion desapilalos todos mientras se muestran por pantalla. 
import java.util.*;

public class ActividadPropuesta91 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n;
        Lista l = new Lista();

        do {
            System.out.println("Introduce un numero (Negativo para terminar) : ");
            n = sc.nextInt();

            if (n >= 0) {
                l.apilar(n);
            }

        } while (n >= 0);

        for (int x = l.tabla.length - 1; x >= 0; x--) {
            System.out.println(l.desapilar());
        }

    }

}
