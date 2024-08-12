package actividad.aplicacion.pkg11.pkg12;

//Abre el fichero de act anterior , lee el valor double contenido en el y
//muestralo por pantalla. 
import java.io.*;

public class ActividadAplicacion1112 {

    public static void main(String[] args) {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("valorDouble.dat"))) {

            double n = in.readDouble();

            System.out.println(n);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

}
