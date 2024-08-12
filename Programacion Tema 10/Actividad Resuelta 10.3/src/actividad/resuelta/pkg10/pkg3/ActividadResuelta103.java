package actividad.resuelta.pkg10.pkg3;

//Repetir la actividad anterior usando un flujo de texto con bufer. 
import java.util.*;
import java.io.*;

public class ActividadResuelta103 {

    public static void main(String[] args) {

        String texto = "";
        BufferedReader in = null;

        try {

            in = new BufferedReader(new FileReader("ActividadAplicacion611.java"));
            String linea = in.readLine();
            while (linea != null) {

                texto = texto + linea + '\n';
                linea = in.readLine();

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
