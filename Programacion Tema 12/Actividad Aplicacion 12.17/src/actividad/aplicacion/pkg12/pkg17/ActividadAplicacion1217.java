package actividad.aplicacion.pkg12.pkg17;

//Implementa la clase Cola generica utilizando un objeto ArrayList para guardar
//los elementos. 
import java.util.*;

public class ActividadAplicacion1217 {

    public static void main(String[] args) {

        Cola<Integer> cola = new Cola<>(new ArrayList<Integer>());

        cola.encolar(3);
        cola.encolar(5);
        cola.encolar(23);
        System.out.println(cola.toString());
        cola.desencolar();
        System.out.println(cola.toString());

    }

}
