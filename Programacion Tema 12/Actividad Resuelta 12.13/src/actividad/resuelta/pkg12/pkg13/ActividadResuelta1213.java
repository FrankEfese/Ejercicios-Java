package actividad.resuelta.pkg12.pkg13;

//Implementa la clase Sorteo con parametros genericos. Debera guardar un conjunto de valores
//distintos de tipo generico, suministrados por consola y sera capaz dde generar una combinacion premiada de un 
//tamaño determinado . 
//-boolean add (T n)
//-Set <T> prem (int munPremi).
import java.util.*;

public class ActividadResuelta1213 {

    public static void main(String[] args) {

        Sorteo<Integer> s = new Sorteo<>();
        for (int x = 0; x < 50; x++) {
            s.add(x);
        }

        System.out.println(s);

        ArrayList<Integer> l = new ArrayList<>(s.premio(20));
        System.out.println(l);

    }

}
