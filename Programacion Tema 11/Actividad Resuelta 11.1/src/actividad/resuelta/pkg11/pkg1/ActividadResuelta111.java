package actividad.resuelta.pkg11.pkg1;

//Escribir en un archivo datos.dat los valores de una tabla de 10 enteros. 
import java.util.*;
import java.io.*;

public class ActividadResuelta111 {

    public static void main(String[] args) {

        int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {

            for (int a : enteros) {

                in.write(a);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }

}
