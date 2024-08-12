package actividad.propuesta.pkg5.pkg2;

//Construye una tabla de 10 elementos del tipo que desees. Declara diferentes variables 
//de tabla que referenciaran la tabla creada. Comprueba , que todas las variables contienen
//la misma referencia. 
import java.util.*;

public class ActividadPropuesta52 {

    public static void main(String[] args) {

        int tabla[] = new int[10];
        int a[] = tabla;
        int b[] = tabla;

        System.out.println(tabla);
        System.out.println(a);
        System.out.println(b);

    }

}
