package actividad.aplicacion.pkg10.pkg13;

//Implementa un programa que lea dos listas de numeros enteros no ordenados de sendos archivos
//con un numero por linea , los reuna en una unica lista y los guarde en orden decreciente en un tercer archivo. 
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ActividadAplicacion1013 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        String linea;

        try (BufferedReader in = new BufferedReader(new FileReader("Numeros1.txt")); BufferedReader fi = new BufferedReader(new FileReader("Numeros2.txt")); 
                BufferedWriter b = new BufferedWriter(new FileWriter("NumerosDecrecientes.txt"))) {

            linea = in.readLine();

            while (linea != null) {

                Scanner s = new Scanner(linea);

                numeros.add(s.nextInt());
                linea = in.readLine();

            }

            linea = fi.readLine();

            while (linea != null) {

                Scanner s = new Scanner(linea);

                numeros.add(s.nextInt());
                linea = fi.readLine();

            }

            Collections.sort(numeros, new Comparador());
            System.out.println(numeros);

            for (Integer a : numeros) {
                String num = String.valueOf(a);
                b.write(num);
                b.newLine();

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

    }

}
