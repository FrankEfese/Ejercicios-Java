package actividad.propuesta.pkg10.pkg3;

//Crea con un editor el fichero de texto Jugadores.txt y escribe en el los nombres , edades y estaturas
//de los jugadores de un equipo cada uno en una linea. Implementa un programa que lea del fichero los datos
//muestre los nombres y calcule la media de la edad y de las estaturas , mostrandolas por pantalla. 
import java.util.*;
import java.io.*;

public class ActividadPropuesta103 {

    public static void main(String[] args) {

        int cont = 0;
        int sumaEdad = 0;
        double sumaEsta = 0;
        double mediaEdad;
        double mediaEsta;
        BufferedReader in = null;
        String linea = "";

        try {

            in = new BufferedReader(new FileReader("Jugadores.txt"));
            linea = in.readLine();

            while (linea != null) {

                Scanner s = new Scanner(linea);

                while (s.hasNext()) {

                    System.out.println(s.next());
                    sumaEdad += s.nextInt();
                    sumaEsta += s.nextDouble();
                    cont++;

                }

                linea = in.readLine();

            }
            in.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        mediaEdad = sumaEdad / cont;
        mediaEsta = sumaEsta / cont;
        System.out.println("\nLa media de edad es : " + mediaEdad);
        System.out.println("La media de estatura es : " + mediaEsta);
    }

}
