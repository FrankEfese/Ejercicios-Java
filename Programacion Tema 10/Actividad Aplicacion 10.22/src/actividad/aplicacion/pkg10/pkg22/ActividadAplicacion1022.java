package actividad.aplicacion.pkg10.pkg22;

//Crea el fichero deportistas.txt donde se recogen los datos de un grupo de deportistas , uno en cada linea. 
//Nombre , edad , peso y altura. Usando un Scanner que aparezca por pantalla. 
import java.io.*;
import java.util.*;

public class ActividadAplicacion1022 {

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("deportistas.txt"))) {

            String linea = in.readLine();

            while (linea != null) {
                Scanner s = new Scanner(linea);
                while (s.hasNext()) {

                    System.out.print(s.next());
                    System.out.print("\t");

                }
                System.out.println("");

                linea = in.readLine();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }

}
