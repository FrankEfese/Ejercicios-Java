package actividad.aplicacion.pkg12.pkg18;

//Implementa la clase Pila generica utilizando un objeto ArrayList para guardar los elementos. 
import java.util.*;

public class ActividadAplicacion1218 {

    public static void main(String[] args) {

        Pila<Integer> p = new Pila(new ArrayList<>());
        p.apilar(5);
        p.apilar(13);
        p.apilar(33);
        System.out.println(p.toString());
        p.desapilar();
        System.out.println(p.toString());
    }

}
