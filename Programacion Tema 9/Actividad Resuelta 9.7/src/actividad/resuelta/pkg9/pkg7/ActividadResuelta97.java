package actividad.resuelta.pkg9.pkg7;

//Implementar la interfaz Comparable en la clase Socio para que por defecto 
//se ordene segun los numeros de identificacion crecientes. 
import java.time.LocalDate;

import java.util.*;

public class ActividadResuelta97 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Socio a = new Socio(1111, "Pepe", LocalDate.now());
        Socio b = new Socio(123, "Raul", LocalDate.now());
        Socio c = new Socio(311111, "Jose", LocalDate.now());

        Socio tabla[] = new Socio[3];
        tabla[0] = a;
        tabla[1] = b;
        tabla[2] = c;

        Arrays.sort(tabla);
        System.out.println(Arrays.deepToString(tabla));

    }

}
