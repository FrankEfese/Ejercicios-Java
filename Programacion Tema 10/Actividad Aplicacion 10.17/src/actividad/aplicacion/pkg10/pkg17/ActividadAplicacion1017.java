package actividad.aplicacion.pkg10.pkg17;

//En Linux dispondremos del comando more , al que se le pasa un fichero y lo muestra poco a poco
//cada 24 lineas . Implementa un programa que funcione de forma similar. 
import java.io.*;

public class ActividadAplicacion1017 {

    public static void main(String[] args) {

        String linea;
        String text = "";
        int cont = 0;

        try (BufferedReader in = new BufferedReader(new FileReader("texto.txt"))) {

            linea = in.readLine();
            cont++;
            while (linea != null) {

                text += linea;

                linea = in.readLine();
                cont++;
                if (cont == 24) {
                    System.out.println(text);
                    cont = 0;
                    text = "";
                    linea = in.readLine();

                }
                text += "\n";

            }

            if (cont > 0) {
                System.out.println(text);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

}
