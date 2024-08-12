package actividad.aplicacion.pkg12.pkg26;

//Crea la funcion List<List<String>> repartoAlumnos (List<String> lista , int num) que devuelve una lista de listas
//cada una de las cuales corresponde a un grupo. 
import java.util.*;

public class ActividadAplicacion1226 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Jose");
        nombres.add("Raul");
        nombres.add("Pepe");
        nombres.add("Fran");
        nombres.add("Manu");
        nombres.add("Luis");
        nombres.add("Rosa");
        nombres.add("Pepa");
        nombres.add("Gavi");
        nombres.add("Ansu");
        nombres.add("Luis");
        nombres.add("Rosa");
        nombres.add("Pepa");
        nombres.add("Gavi");
        nombres.add("Ansu");

        List<List<String>> listas = grupos(nombres, 4);
        for (int x = 0; x < listas.size(); x++) {
            System.out.println(listas.get(x));
        }

    }

    static List<List<String>> grupos(ArrayList<String> l, int num) {

        List<List<String>> listas = new ArrayList<>();

        int aux = l.size() % num;
        int numAlu = l.size() / num;
        int z = numAlu * num;
        int aumentoX = 0;
        int auxGene = numAlu;
        ArrayList<String> k = new ArrayList<>();

        if (num > l.size()) {
            return listas;
        } else {
            if (aux == 0) {

                while (num > 0) {

                    k = new ArrayList<>();
                    for (int x = aumentoX; x < numAlu; x++) {

                        k.add(l.get(x));

                    }

                    listas.add(k);
                    num--;
                    aumentoX += auxGene;
                    numAlu += auxGene;

                }

            } else {
                while (num > 0) {

                    k = new ArrayList<>();
                    for (int x = aumentoX; x < numAlu; x++) {

                        k.add(l.get(x));

                    }

                    listas.add(k);
                    num--;
                    aumentoX += auxGene;
                    numAlu += auxGene;

                }

                int p = 0;
                for (int x = z; x < l.size(); x++) {
                    listas.get(p).add(l.get(x));
                    p++;
                }

            }
        }

        return listas;

    }

}
