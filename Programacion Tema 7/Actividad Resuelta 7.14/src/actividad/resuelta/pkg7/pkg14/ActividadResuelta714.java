package actividad.resuelta.pkg7.pkg14;

//Implementar el metodo no estatico void insertarFinal(int n) que inserta un numero entero
//al final de tablaEnteros[] que es un atributo no estatico de Main. 
import java.util.*;

public class ActividadResuelta714 {

    int tablaEnteros[] = new int[0];

    public static void main(String[] args) {

        ActividadResuelta714 m = new ActividadResuelta714();

        for (int x = 0; x < 10; x++) {
            m.insertarFinal(x);
        }

        System.out.println(Arrays.toString(m.tablaEnteros));

    }

    void insertarFinal(int n) {

        tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length + 1);
        tablaEnteros[tablaEnteros.length - 1] = n;

    }

}
