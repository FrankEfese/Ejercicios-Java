package actividad.aplicacion.pkg10.pkg15;

//En el archivo numeros.txt. disponemos de una serie de numeros (uno por cada linea). 
//Diseña un programa que procese el fichero y nos muestre el menor y el mayor. 
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ActividadAplicacion1015 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader("numeros.txt"))) {

            String num = in.readLine();

            while (num != null) {

                if (!num.isEmpty()) {
                    Integer n = Integer.valueOf(num);
                    numeros.add(n);
                    num = in.readLine();
                }

            }

            Collections.sort(numeros);
            System.out.println("El menor es : " + numeros.get(0));
            System.out.println("El mayor es : " + numeros.get(numeros.size() - 1));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }

}
