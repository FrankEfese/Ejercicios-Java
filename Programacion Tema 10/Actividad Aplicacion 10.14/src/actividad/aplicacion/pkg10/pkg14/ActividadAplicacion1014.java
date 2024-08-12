package actividad.aplicacion.pkg10.pkg14;

//Escribe un programa que lea un fichero de texto llamado carta.txt. Tenemos que contar los caracteres
//las lineas y las palabras. 
import java.io.*;
import java.util.Scanner;

public class ActividadAplicacion1014 {

    public static void main(String[] args) {

        int contCaract = 0;
        int contLinea = 0;
        int contPalabra = 0;
        String linea;

        try (BufferedReader in = new BufferedReader(new FileReader("carta.txt"))) {

            linea = in.readLine();

            while (linea != null) {

                Scanner s = new Scanner(linea);
                String palabra;

                while (s.hasNext()) {

                    palabra = s.next();

                    contCaract += palabra.length();
                    contPalabra++;

                }

                contLinea++;

                linea = in.readLine();

            }

            System.out.println("Numero de Lineas : " + contLinea);
            System.out.println("Numero de Palabras : " + contPalabra);
            System.out.println("Numero de Caracteres : " + contCaract);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

    }

}
