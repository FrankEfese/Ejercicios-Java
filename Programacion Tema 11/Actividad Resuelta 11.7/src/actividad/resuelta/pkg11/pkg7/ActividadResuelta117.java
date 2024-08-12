package actividad.resuelta.pkg11.pkg7;

//Grabar en el fichero numeros.dat una serie de numeros enteros no negativos introducidos
//por teclado . La serie acabara cuando escribamos -1 . Abrir de nuevo numeros.dat para lectura y leer todos los numeros 
//hasta el final del fichero , mostrandolos por pantalla y copiandolos en un segundo fichero numerosCopia.dat 
import java.util.*;
import java.io.*;

public class ActividadResuelta117 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("numeros.dat"))) {

            System.out.println("Introduce numeros Positivos : ");
            int n = sc.nextInt();

            while (n >= 0) {

                in.writeInt(n);
                System.out.println("Introduce numeros Positivos : ");
                n = sc.nextInt();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream le = new ObjectInputStream(new FileInputStream("numeros.dat")); ObjectOutputStream in2 = new ObjectOutputStream(new FileOutputStream("numerosCopia.dat"))) {

            while (true) {

                int n = le.readInt();
                System.out.println(n);
                in2.writeInt(n);

            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

}
