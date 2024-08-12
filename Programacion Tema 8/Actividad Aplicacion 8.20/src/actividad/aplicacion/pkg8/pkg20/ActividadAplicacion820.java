package actividad.aplicacion.pkg8.pkg20;

//Implementa el metodo equals() en la clase Conjunto. 
import java.util.*;

public class ActividadAplicacion820 {

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
        c1.eliminarParametro(0);

        System.out.println(c1.toString());
        c.insertarConjunto(c1);
        System.out.println(c.toString());
        System.out.println(c.equals(c1));

    }

}
