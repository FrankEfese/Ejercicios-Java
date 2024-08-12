package actividad.resuelta.pkg10.pkg8;

//Escribir un programa que duplique el contenido de un fichero cuyo nombre
//se pide al usuario. El fichero copia tendra el mismo nombre con el prefijo copia_de_. 
import java.io.*;

public class ActividadResuelta108 {

    public static void main(String[] args) {

        String txt;

        try (BufferedReader r = new BufferedReader(new FileReader("ejemplo.txt")); BufferedWriter in = new BufferedWriter(new FileWriter("copia_de_ejemplo.txt"))) {
            txt = r.readLine();
            while (txt != null) {

                in.write(txt);
                in.newLine();
                txt = r.readLine();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
