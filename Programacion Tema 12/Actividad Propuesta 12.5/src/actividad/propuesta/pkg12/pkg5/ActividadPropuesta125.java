package actividad.propuesta.pkg12.pkg5;

//A partir de conjuntoCliente , crea otro conjunto con los mismos elementos ordenados por edad y 
//otro ordenados por nombre. 
import java.util.*;

public class ActividadPropuesta125 {

    public static void main(String[] args) {

        Cliente c = new Cliente(1213, "Fran", 15);
        Cliente c2 = new Cliente(1213, "Jose", 17);
        Cliente c3 = new Cliente(1213, "Luis", 23);
        Cliente c4 = new Cliente(1213, "Alex", 24);

        TreeSet<Cliente> lista = new TreeSet<>();
        ArrayList<Cliente> listaNom = new ArrayList<>();

        lista.add(c3);
        lista.add(c2);
        lista.add(c4);
        lista.add(c);

        listaNom.add(c);
        listaNom.add(c2);
        listaNom.add(c3);
        listaNom.add(c4);
        System.out.println(lista);
        Collections.sort(listaNom, new ComparadorNombre());
        System.out.println(listaNom);

    }

}
