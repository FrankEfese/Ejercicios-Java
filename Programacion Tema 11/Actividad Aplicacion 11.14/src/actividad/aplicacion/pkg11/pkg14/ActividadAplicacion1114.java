package actividad.aplicacion.pkg11.pkg14;

//Introduce por teclado una frase y guardala en un archivo binario. A continuacion
//recuperala y muestrala por pantalla. 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1114 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase : ");
        String frase = sc.nextLine();

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("frase.dat"))) {

            in.writeObject(frase);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream le = new ObjectInputStream(new FileInputStream("frase.dat"))) {

            String n = (String) le.readObject();

            System.out.println(n);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
