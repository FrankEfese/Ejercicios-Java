package actividad.resuelta.pkg12.pkg16;

//Implementa la clase Academico (nombre , fecha) , orden por nombre. Crear 5 objetos de Academico 
//insertandolos en un mapa , la clave es la letra del sillon que ocupan . Hacer diversos listados 
//sin letra , por orden de nombre y fecha. Con letra , nombre y fecha. 
import java.util.*;

public class ActividadResuelta1216 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Character, Academico> mapa = new TreeMap<>();

        for (int x = 0; x < 6; x++) {

            System.out.println("\nIntroduce una letra : ");
            Character c = sc.next().charAt(0);
            System.out.println("Introduce el Nombre : ");
            sc.nextLine();
            String nom = sc.nextLine();
            System.out.println("Introduce el año de ingreso : ");
            int n = sc.nextInt();

            Academico a = new Academico(nom, n);
            esta(mapa, c, a);

        }

        System.out.println("\nPor Clave : ");
        System.out.println(mapa);
        System.out.println("");

        Collection<Academico> l = mapa.values();
        ArrayList<Academico> ll = new ArrayList<>(l);
        Collections.sort(ll);

        System.out.println("Por Nombre sin Clave : ");
        System.out.println(ll);
        System.out.println("");

        Comparator<Academico> c = new Comparator<>() {
            @Override
            public int compare(Academico o1, Academico o2) {

                return o1.fecha - o2.fecha;

            }

        };

        System.out.println("Por Ingreso sin Clave : ");
        Collections.sort(ll, c);
        System.out.println(ll);
        System.out.println("");

        Set<Map.Entry<Character, Academico>> listaConL = mapa.entrySet();
        ArrayList<Map.Entry<Character, Academico>> listaL = new ArrayList<>(listaConL);

        System.out.println("Lista con Todo : ");
        System.out.println(listaL);
        System.out.println("");

        Collections.sort(listaL, new Comparator<>() {
            @Override
            public int compare(Map.Entry<Character, Academico> o1, Map.Entry<Character, Academico> o2) {

                return o1.getValue().fecha - o2.getValue().fecha;
            }

        });

        System.out.println("Lista con Todo por Ingreso : ");
        System.out.println(listaL);

        Collections.sort(listaL, new Comparator<>() {
            @Override
            public int compare(Map.Entry<Character, Academico> o1, Map.Entry<Character, Academico> o2) {

                return o1.getValue().compareTo(o2.getValue());
            }

        });

        System.out.println("");
        System.out.println("Lista con Todo por Nombre : ");
        System.out.println(listaL);

    }

    static boolean esta(Map<Character, Academico> m, Character c, Academico a) {

        boolean insertado = false;
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == 'ñ' || c == 'Ñ') {
            m.put(c, a);
            insertado = true;
        } else {
            insertado = false;
        }

        return insertado;

    }

}
