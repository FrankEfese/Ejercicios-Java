package actividad.aplicacion.pkg12.pkg19;

//Escribe un programa donde se introduzca por consola una fraseque conste exclusivamente de palabras 
//separadas por espacios. Las palabras de la frase se almacenaran en una lista . Finalmente se mostraran por pantalla 
//las repetidas y a continuacion las que no. 
import java.util.*;

public class ActividadAplicacion1219 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase llena de palabras separadas por un espacio : ");
        String frase = sc.nextLine();

        Scanner s = new Scanner(frase);
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> sinRepes = new ArrayList<>();
        ArrayList<String> repes = new ArrayList<>();
        while (s.hasNext()) {

            lista.add(s.next());

        }

        for (int x = 0; x < lista.size(); x++) {

            String a = lista.get(x);
            int cont = 0;

            for (int j = 0; j < lista.size(); j++) {

                if (a.equals(lista.get(j))) {
                    cont++;
                }
            }

            if (cont == 1) {

                sinRepes.add(a);
            } else {
                if (!repes.contains(a)) {
                    repes.add(a);
                }

            }

        }

        System.out.println("Sin Repetidas : ");
        System.out.println(sinRepes);
        System.out.println("Con Repetidas : ");
        System.out.println(repes);

    }

}
