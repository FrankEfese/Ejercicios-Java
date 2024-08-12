package actividad.aplicacion.pkg10.pkg19;

//Un encriptador es una app que transforma un texto haciendolo ilegible para aquellos que desconocen el codigo. 
//Diseña un programa que lea un fichero de texto , lo codifique y cree un nuevo archivo con el mensaje cifrado . El alfabeto de codificacion 
//se encontrara en el fichero codec.txt. 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1019 {

    public static void main(String[] args) {

        char alfabeto[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char alfabetoDes[] = {'d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c'};
        String txt;

        try (BufferedReader in = new BufferedReader(new FileReader("texto.txt")); BufferedWriter f = new BufferedWriter(new FileWriter("textoCodi.txt"))) {

            txt = in.readLine();

            while (txt != null) {
                int cont = 0;

                for (int x = 0; x < txt.length(); x++) {

                    for (int i = 0; i < alfabeto.length; i++) {

                        if (txt.charAt(x) == alfabeto[i]) {

                            f.write(alfabetoDes[i]);
                            cont++;

                        }

                    }

                    if (cont == 0) {
                        f.write(txt.charAt(x));
                    }
                    cont = 0;

                    if (Character.isSpaceChar(txt.charAt(x))) {
                        f.write(" ");

                    }

                }

                txt = in.readLine();
                f.newLine();

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
