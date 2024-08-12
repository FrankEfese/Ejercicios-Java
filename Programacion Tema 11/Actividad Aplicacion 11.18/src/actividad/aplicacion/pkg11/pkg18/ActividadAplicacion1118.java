package actividad.aplicacion.pkg11.pkg18;

//Un libro de firmas es util para recoger los nombres. Crea una app que permita mostrar
//el libro de firmas o insertar un nuevo nombre (que no este repetido). 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1118 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("firmas.dat"))) {

            nombres = (ArrayList<String>) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        int eleccion;

        do {
            System.out.println("\nPara insertar Nuevo Nombre (Pulsa 1) : ");
            System.out.println("Para mostrar Nombres (Pulsa 2) ");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:

                    System.out.println("\nIntroduce nuevo Nombre : ");
                    sc.nextLine();
                    String n = sc.nextLine();
                    comprobar(nombres, n);
                    break;

                case 2:

                    if (nombres.isEmpty()) {
                        System.out.println("\nAun no hay nombres.");
                    } else {
                        System.out.println("\nEstos son los nombres : ");
                        System.out.println(nombres);
                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 3);

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("firmas.dat"))) {

            in.writeObject(nombres);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static ArrayList<String> comprobar(ArrayList<String> t, String n) {
        boolean ok = false;
        for (String f : t) {

            if (f.equals(n)) {
                ok = true;
            }

        }

        if (!ok) {

            t.add(n);
            System.out.println("\nAgregado");
            return t;
        } else {
            System.out.println("\nYa existe");
            return t;
        }

    }

}
