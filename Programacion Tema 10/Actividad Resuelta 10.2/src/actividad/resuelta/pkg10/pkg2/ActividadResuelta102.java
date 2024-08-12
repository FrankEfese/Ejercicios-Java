package actividad.resuelta.pkg10.pkg2;

//Leer el archivo de texto Main .java de uno de los proyectos que hayamos terminado y mostrarlo por pantalla.
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ActividadResuelta102 {

    public static void main(String[] args) {

        String texto = "";
        FileReader in = null;
        try {

            in = new FileReader("ActividadResuelta101.java");
            int c = in.read();
            while (c != -1) {
                texto = texto + (char) c;
                c = in.read();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        System.out.println(texto);
    }

}
