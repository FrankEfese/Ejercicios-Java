package actividad.resuelta.pkg11.pkg6;

//Recuperar la estrofra del archivo cancionPirata.dat de la act resuelta 11.2 y 
//mostrar por consola . 
import java.io.*;

public class ActividadResuelta116 {

    public static void main(String[] args) {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("cancionPirata.dat"))) {

            String cancion = (String) in.readObject();
            System.out.println(cancion);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        } catch (ClassNotFoundException a) {
            System.out.println(a.getMessage());
        }

    }

}
