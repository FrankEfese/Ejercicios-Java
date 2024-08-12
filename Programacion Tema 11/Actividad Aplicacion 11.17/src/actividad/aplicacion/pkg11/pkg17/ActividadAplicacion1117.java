package actividad.aplicacion.pkg11.pkg17;

//Escribe un texto , linea a linea ,  de forma que , cada vez que se pulse intro , se guarde 
//la linea en el archivo binario. El proceso termina cuando introduzca una linea vacia. 
//Despues lo lee y lo muestra. 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1117 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String txt = "";

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("texto.dat"))) {
            System.out.println("Introduce una frase (intro sin nada para terminar ) : ");
            String frase = sc.nextLine();

            while (frase.length() > 0) {

                in.writeObject(frase);
                frase = sc.nextLine();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream p = new ObjectInputStream(new FileInputStream("texto.dat"))) {

            String n = (String) p.readObject();

            while (n != null) {

                txt += n;
                txt += "\n";
                n = (String) p.readObject();

            }

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(txt);

    }

}
