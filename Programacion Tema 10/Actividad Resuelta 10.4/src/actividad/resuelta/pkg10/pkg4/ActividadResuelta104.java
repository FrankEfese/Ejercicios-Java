package actividad.resuelta.pkg10.pkg4;

//Crear con un editor el fichero NumerosReales.txt en la carpeta del proyecto actual y
//escribir en el una serie de numeros reales separados por espacios simples. 
//Lea los numeros y calcule la suma y la media aritmetica . 
import java.io.*;

public class ActividadResuelta104 {

    public static void main(String[] args) {

        char num;
        int suma = 0;
        int cont = 0;

        FileReader in = null;

        try {

            in = new FileReader("NumerosReales.txt");
            int c = in.read();

            while (c != -1) {

                num = (char) c;
                if (Character.isDigit(num)) {
                    cont++;
                    suma += Character.getNumericValue(num);

                }

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

        try {  // En caso de que no hubiese ningun numero.

            int media = suma / cont;
            System.out.println("SUMA : " + suma);
            System.out.println("MEDIA : " + media);

        } catch (Exception e) {
            System.out.println("No habia ningun numero");
        }

    }

}
