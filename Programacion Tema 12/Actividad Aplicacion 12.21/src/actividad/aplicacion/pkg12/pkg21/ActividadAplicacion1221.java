package actividad.aplicacion.pkg12.pkg21;

//Implementa una app donde se insertan 20 numeros aleatorios distintos menores que 100 en 
//una coleccion . Deberan guardarse por orden decreciente a medida que se vayan guardando y 
//mostrar por pantalla. 
import java.util.*;

public class ActividadAplicacion1221 {

    public static void main(String[] args) {

        Comparator<Integer> c = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2 - o1;
            }

        };

        TreeSet<Integer> lista = new TreeSet<>(c);

        int cont = 0;

        while (cont < 20) {

            Integer n = (int) (Math.random() * 99 + 1);

            if (!lista.contains(n)) {

                lista.add(n);
                System.out.println(lista);
                cont++;
            }

        }

    }

}
