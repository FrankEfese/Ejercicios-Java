package actividad.resuelta.pkg10.pkg5;

//Crear un txt de numeros reales , uno por linea . Abrirlo con un flujo de texto para lectura y leerlo linea a linea . 
//Convertir las cadenas leidas en numeros de tipo double por medio de Scanner y mostrar la suma de ellos. 
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ActividadResuelta105 {

    public static void main(String[] args) {

        String texto = "";
        BufferedReader in = null;

        double suma = 0;

        try {

            in = new BufferedReader(new FileReader("Numeros.txt"));
            texto = in.readLine();
            while (texto != null) {

                Scanner s = new Scanner(texto).useLocale(Locale.US);
                if (s.hasNextDouble()) {

                    suma += s.nextDouble();

                }

                texto = in.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {

            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }

        }

        System.out.println(suma);

    }

}
