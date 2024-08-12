package actividad.aplicacion.pkg9.pkg20;

//Repetir la actividad anterior para que se ordene por edades y si tienen la misma 
//edad vaya antes el que tenga el numero de socio menor. 
import java.util.*;

public class ActividadAplicacion920 {

    public static void main(String[] args) {

        Socio a = new Socio(1111, "Pepe", 12);
        Socio b = new Socio(3, "Raul", 43);
        Socio c = new Socio(311, "Aose", 23);
        Socio d = new Socio(23, "Zorro", 43);
        Socio e = new Socio(151, "Bueno", 20);

        Socio tabla[] = new Socio[5];
        tabla[0] = a;
        tabla[1] = b;
        tabla[2] = c;
        tabla[3] = d;
        tabla[4] = e;

        Arrays.sort(tabla, new Comparador());
        System.out.println(Arrays.deepToString(tabla));
    }

}
