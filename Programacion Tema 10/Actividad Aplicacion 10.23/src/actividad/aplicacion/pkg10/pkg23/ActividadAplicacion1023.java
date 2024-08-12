package actividad.aplicacion.pkg10.pkg23;

//Con el fichero deportistas de la act anterior implementa una aplicacion que lea los datos de los deportistas y los guarde en tres ficheros
//uno con los nmbres y las edades , otro con nombres y pesos , y otro con nombres y estatura. 
import java.io.*;
import java.util.*;

public class ActividadAplicacion1023 {

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("deportistas.txt")); BufferedWriter f = new BufferedWriter(new FileWriter("NombreYEdad.txt"))) {

            String linea = in.readLine();

            while (linea != null) {

                Scanner s = new Scanner(linea);

                String p = s.next();
                f.write(p);
                for (int x = p.length(); x < 15; x++) {
                    f.write(" ");
                }
                f.write(s.next());
                f.newLine();
                linea = in.readLine();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

        try (BufferedReader in2 = new BufferedReader(new FileReader("deportistas.txt")); BufferedWriter f2 = new BufferedWriter(new FileWriter("NombreYPeso.txt"))) {

            String linea = in2.readLine();

            while (linea != null) {

                Scanner s2 = new Scanner(linea);

                String p = s2.next();
                f2.write(p);
                for (int x = p.length(); x < 15; x++) {
                    f2.write(" ");
                }
                s2.next();
                f2.write(s2.next());
                f2.newLine();
                linea = in2.readLine();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

        try (BufferedReader in3 = new BufferedReader(new FileReader("deportistas.txt")); BufferedWriter f3 = new BufferedWriter(new FileWriter("NombreYEstatura.txt"))) {

            String linea = in3.readLine();

            while (linea != null) {

                Scanner s3 = new Scanner(linea);

                String p = s3.next();
                f3.write(p);
                for (int x = p.length(); x < 15; x++) {
                    f3.write(" ");
                }
                s3.next();
                s3.next();
                f3.write(s3.next());
                f3.newLine();
                linea = in3.readLine();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
