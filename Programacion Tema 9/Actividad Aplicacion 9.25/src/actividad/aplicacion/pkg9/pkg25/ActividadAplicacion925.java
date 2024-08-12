package actividad.aplicacion.pkg9.pkg25;

//Usar la lista anterior para insertar cadenas de caracteres y ordenarlas.
import java.util.*;

public class ActividadAplicacion925 {
    
    public static void main(String[] args) {
        Object tabla[] = new Object[0];
        
        Lista l = new Lista(tabla);
        l.insertarFinal("bebe");
        l.insertarFinal("casa");
        l.insertarFinal("adios");
        l.ordenar();
        System.out.println(l.toString());
    }
    
}
