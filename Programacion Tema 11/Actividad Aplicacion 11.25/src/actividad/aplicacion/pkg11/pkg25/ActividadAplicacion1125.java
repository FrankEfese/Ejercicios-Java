package actividad.aplicacion.pkg11.pkg25;

//Guardar en una tabla 4 nombres de ficheros . En cada uno hay una tabla de enteros ordenados. 
//Introducir un numero y decir en que fichero esta y si esta en que posicion . 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1125 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("tabla1.dat"))) {

            int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            in.writeObject(numeros);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("tabla2.dat"))) {

            int[] numeros = {33, 42, 13, 64, 45, 36, 76, 68, 79, 10};
            Arrays.sort(numeros);

            in.writeObject(numeros);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("tabla3.dat"))) {

            int[] numeros = {333, 422, 133, 64, 455, 366, 756, 698, 799, 190};
            Arrays.sort(numeros);

            in.writeObject(numeros);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("tabla4.dat"))) {

            int[] numeros = {333, 13, 4, 55, 36, 56, 98, 99, 90};
            Arrays.sort(numeros);

            in.writeObject(numeros);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String tabla[] = new String[4];
        tabla[0] = "tabla1.dat";
        tabla[1] = "tabla2.dat";
        tabla[2] = "tabla3.dat";
        tabla[3] = "tabla4.dat";

        System.out.println("Introduce un numero : ");
        int num = sc.nextInt();
        int cont = 0;

        for (String a : tabla) {

            int indice = esta(a, num);
            if (indice >= 0) {
                System.out.println("Fichero " + cont + " posicion : " + indice);
            }

            cont++;

        }

    }

    static int esta(String n, int num) {

        int indice = -1;
        int cont = 0;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(n))) {

            int tabla[] = (int[]) in.readObject();

            for (int x : tabla) {

                if (x == num) {
                    indice = cont;
                }
                cont++;

            }

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return indice;
    }

}
