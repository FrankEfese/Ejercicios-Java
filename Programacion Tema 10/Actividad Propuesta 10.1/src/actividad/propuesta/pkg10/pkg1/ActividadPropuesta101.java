package actividad.propuesta.pkg10.pkg1;

//Crea un fichero de texto con un editor e implementa un programa que lo abra y lo lea ,
//mostrando su contenido por pantalla. 
import java.util.*;
import java.io.*;

public class ActividadPropuesta101 {

    public static void main(String[] args) {

        String texto = "";
        FileReader in = null;

        try {

            in = new FileReader("HolaMundo.txt");
            int c = in.read();
            while (c != -1) {

                texto += (char) c;
                c = in.read();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {

            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

        System.out.println(texto);

    }

}
