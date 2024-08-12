package actividad.resuelta.pkg13.pkg2;

//Utilizando la interfaz Saludo implementa un metodo estatico que aplique un saludo a un grupo de personas 
//que se le pasa como parametro en una tabla. 
import java.util.*;

public class ActividadResuelta132 {

    public static void main(String[] args) {

        String[] nombres = {"Juan", "María", "Carlos", "Ana", "Luis", "Elena", "Pedro", "Laura", "José", "Sofía"};

        ArrayList<String> saludosNombres = lista(nombres, s -> "Hola " + s);
        System.out.println(saludosNombres);

    }

    static <T> ArrayList<String> lista(T[] nombres, Saludo<T> s) {

        ArrayList<String> lista = new ArrayList<>();

        for (T a : nombres) {

            lista.add(s.saludo(a));

        }

        return lista;

    }

}
