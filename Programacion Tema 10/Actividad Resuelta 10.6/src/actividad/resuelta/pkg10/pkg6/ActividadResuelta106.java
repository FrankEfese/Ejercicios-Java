package actividad.resuelta.pkg10.pkg6;

//Crear con un editor el fichero Enteros.txt y escribir en el una serie de enteros separados por secuencias de espacios. 
//Implementar un programa que acceda a Enteros.txt con un objeto Scanner , lea los numeros y calcule su suma y su media aritmetica. 
import java.util.*;
import java.io.*;

public class ActividadResuelta106 {

    public static void main(String[] args) {

        String texto = "";
        BufferedReader in = null;
        int suma = 0;
        int cont = 0;

        try {

            in = new BufferedReader(new FileReader("Enteros.txt"));
            texto = in.readLine();

            while (texto != null) {

                Scanner s = new Scanner(texto);
                while (s.hasNext()) {

                    if (s.hasNextInt()) {

                        int n = s.nextInt();

                        System.out.println(n);

                        suma += n;
                        cont++;

                    }

                }
                texto = in.readLine();

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

        System.out.println("\nSuma : " + suma);
        System.out.println("Media : " + suma / cont);
    }

}
