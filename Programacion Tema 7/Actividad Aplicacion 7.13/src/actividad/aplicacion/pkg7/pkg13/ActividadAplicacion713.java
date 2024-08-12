package actividad.aplicacion.pkg7.pkg13;

//Diseña una clase colores que alberga por defecto una serie de colores (mediante una cadena)
//aunque es posible añadir tantos como necesitemos. La clase tendra un metodo que devuelve una tabla
//con n colores elegidos al azar. 
import java.util.*;

public class ActividadAplicacion713 {

    public static void main(String[] args) {

        Colores.agregarcolor("pepito");
        Colores.agregarcolor("magenta");
        Colores.agregarcolor("chillon");
        Colores.agregarcolor("pink");
        String a[] = Colores.color(5);
        System.out.println(Arrays.toString(a));
    }

}
