package actividad.propuesta.pkg5.pkg4;

//Escribe la funcion int buscar (int t [] , int clave) que busca de forma secuencial 
//en la tabla t el valor clave . En caso de encontrarlo , devuelve la posicion donde esta 
//y si no esta devuelve un -1. 
import java.util.*;

public class ActividadPropuesta54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla[] = new int[5];

        for (int x = 0; x < tabla.length; x++) {

            System.out.println("Introduce un numero : ");
            tabla[x] = sc.nextInt();
        }

        System.out.println("Introduce que valor quieres buscar : ");
        int v = sc.nextInt();

        System.out.println("En que lugar esta : " + clave(tabla, v));

    }

    static int clave(int t[], int clave) {
        int pos = -1;
        for (int x = 0; x < t.length; x++) {

            if (t[x] == clave) {
                pos = x;

                break;
            }

        }

        return pos;
    }
}
