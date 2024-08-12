package actividad.aplicacion.pkg10.pkg11;

//Escribe un programa que solicite al usuario el nombre de un fichero de texto y muestre su contenido
//su contenido en pantalla. Si no se proporciona ningun nombre de fichero , la app utilizara por defecto prueba.txt. 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1011 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero (ej : texto.txt) : ");
        String fichero = sc.nextLine();
        String texto;

        try (BufferedReader in = new BufferedReader(new FileReader(fichero))) {

            texto = in.readLine();
            while (texto != null) {
                System.out.println(texto);
                texto = in.readLine();

            }

        } catch (IOException ex) {
            System.out.println("\nFichero no encontrado , veamos el de Prueba.txt :  ");

            try (BufferedReader in = new BufferedReader(new FileReader("Prueba.txt"))) {

                texto = in.readLine();
                while (texto != null) {
                    System.out.println(texto);
                    texto = in.readLine();

                }

            } catch (IOException e) {
                System.out.println(e.getMessage());

            }

        }

    }

}
