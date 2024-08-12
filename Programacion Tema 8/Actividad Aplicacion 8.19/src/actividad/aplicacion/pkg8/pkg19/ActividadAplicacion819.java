package actividad.aplicacion.pkg8.pkg19;

//Un conjunto es un objeto similar a las listas capaz de guardar valores de un tipo determinado 
//con la diferencia de que sus elementos no pueden estar repetidos . 
import java.util.*;

public class ActividadAplicacion819 {

    public static void main(String[] args) {

        Conjunto c = new Conjunto();
        Conjunto c1 = new Conjunto();
        c.insertarFinal(3);
        c.insertarFinal(2);
        c.insertarFinal(3);
        c.insertarPrincipio(1);
        c.insertarIndice(1, 4);
        System.out.println(c.toString());
        c.busqueda(4);
        System.out.println(c.numElementosLista());
        c.eliminarParametro(0);
        System.out.println(c.toString());
        c1.insertarFinal(3);
        c1.insertarFinal(2);
        c1.insertarFinal(3);
        c1.insertarPrincipio(1);
        c1.insertarIndice(1, 4);
        c1.eliminarParametro(0);
        c1.insertarPrincipio(11);
        System.out.println(c1.toString());
        c.insertarConjunto(c1);
        System.out.println(c.toString());

    }

}
