package actividad.resuelta.pkg12.pkg9;

//Crear una lista de numeros enteros positivos introducidos por consola hasta que sea negativo. 
//Recorrer la lista y mostrar por pantalla los indices de los elementos de valor par , que sera 
//multiplicado por 100. 
import java.util.*;

public class ActividadResuelta129 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero (negativo para terminar) : ");
        Integer n = sc.nextInt();

        while (n >= 0) {

            lista.add(n);
            System.out.println("Introduce un numero (negativo para terminar) : ");
            n = sc.nextInt();

        }

        for (Integer a : lista) {

            if (a % 2 == 0) {

                Integer indice = lista.indexOf(a);

                System.out.println("Indice : " + indice);
                lista.set(indice, (lista.get(indice) * 100));
            }

        }

        System.out.println(lista);
    }

}
