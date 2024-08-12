package actividad.aplicacion.pkg11.pkg24;

//Implementa el metodo void fusion (String n , String n2) que añade a n , los elementos n2 .
import java.util.*;
import java.io.*;

public class ActividadAplicacion1124 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del Primer Fichero : ");
        String f1 = sc.nextLine();
        System.out.println("Introduce el nombre del Segundo Fichero : ");
        String f2 = sc.nextLine();
        Integer tabla[] = fusion(f1, f2);
        System.out.println(Arrays.toString(tabla));

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream(f1))) {

            for (Integer a : tabla) {

                in.writeInt(a);

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) {

            Integer a = in.readInt();

            while (a != null) {

                System.out.println(a);
                a = in.readInt();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static Integer[] fusion(String n, String n2) {

        Integer tabla[] = new Integer[0];

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(n))) {

            Integer a = in.readInt();

            while (a != null) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = a;
                a = in.readInt();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(n2))) {

            Integer a = in.readInt();

            while (a != null) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = a;
                a = in.readInt();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Arrays.sort(tabla);

        return tabla;

    }
}
