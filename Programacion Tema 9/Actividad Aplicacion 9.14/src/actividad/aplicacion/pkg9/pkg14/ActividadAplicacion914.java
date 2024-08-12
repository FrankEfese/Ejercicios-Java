package actividad.aplicacion.pkg9.pkg14;

//Añadir a la actividad anterior un comparador que ordene los futbolistas por edades y 
//para aquellos que tienen la misma edad , por nombres. 
import java.util.*;

public class ActividadAplicacion914 {

    public static void main(String[] args) {

        Futbolista f = new Futbolista("3245252A", "Aepe", 23, 5);
        Futbolista f2 = new Futbolista("4357324B", "Jose", 19, 6);
        Futbolista f3 = new Futbolista("7874722L", "Manu", 13, 7);
        Futbolista f4 = new Futbolista("7547434N", "Fran", 23, 2);
        Futbolista f5 = new Futbolista("2353245M", "Alex", 25, 9);

        Futbolista tabla[] = new Futbolista[5];
        tabla[0] = f;
        tabla[1] = f2;
        tabla[2] = f3;
        tabla[3] = f4;
        tabla[4] = f5;

        Arrays.sort(tabla, new CompEdad());
        System.out.println(Arrays.deepToString(tabla));
    }

}
