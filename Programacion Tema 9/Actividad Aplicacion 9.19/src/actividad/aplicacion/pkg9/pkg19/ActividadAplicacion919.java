package actividad.aplicacion.pkg9.pkg19;

//Implementa la interfaz comparable en la clase Socio para que el criterio de 
//ordenacion natural sea de menor a mayor edad. 
import java.util.*;

public class ActividadAplicacion919 {

    public static void main(String[] args) {

        Socio a = new Socio(1111, "Pepe", 12);
        Socio b = new Socio(123, "Raul", 43);
        Socio c = new Socio(311, "Aose", 23);
        Socio d = new Socio(123, "Zorro", 442);
        Socio e = new Socio(151, "Bueno", 20);

        Socio tabla[] = new Socio[5];
        tabla[0] = a;
        tabla[1] = b;
        tabla[2] = c;
        tabla[3] = d;
        tabla[4] = e;

        Arrays.sort(tabla);
        System.out.println(Arrays.deepToString(tabla));
    }

}
