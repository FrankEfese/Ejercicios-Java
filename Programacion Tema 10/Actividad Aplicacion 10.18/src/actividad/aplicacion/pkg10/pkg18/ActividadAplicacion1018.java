package actividad.aplicacion.pkg10.pkg18;

//Escribe la funcion Integer [] numeros (String txt) al que se le pasa una cadena
//y devuelve una tabla con todos los enteros que aparecen en ella. 
import java.util.*;

public class ActividadAplicacion1018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto y escribe en el numero enteros :");
        String txt = sc.nextLine();

        System.out.println(Arrays.toString(numeros(txt)));
    }

    static Integer[] numeros(String txt) {

        Integer tabla[] = new Integer[0];

        for (int x = 0; x < txt.length(); x++) {

            if (Character.isDigit(txt.charAt(x))) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                String n = String.valueOf(txt.charAt(x));
                tabla[tabla.length - 1] = Integer.valueOf(n);

            }

        }

        return tabla;

    }

}
