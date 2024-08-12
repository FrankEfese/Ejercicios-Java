package actividad.propuesta.pkg5.pkg8;

//Comprueba que produce la comparacion con el operador == de dos tabla del mismo tipo, 
//la misma longitud y los mismo valores. 
import java.util.*;

public class ActividadPropuesta58 {

    public static void main(String[] args) {

        int tabla[] = new int[3];
        int tabla2[] = new int[3];

        tabla[0] = 1;
        tabla[1] = 1;
        tabla[2] = 1;

        tabla2[0] = 1;
        tabla2[1] = 1;
        tabla2[2] = 1;

        System.out.println(tabla == tabla2);

    }

}
