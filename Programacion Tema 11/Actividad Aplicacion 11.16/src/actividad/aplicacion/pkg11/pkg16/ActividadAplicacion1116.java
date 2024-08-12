package actividad.aplicacion.pkg11.pkg16;

//Implementa una app que gestione una lista de nombres ordenadas por orden alfabetico.
//Al arrancar se leera el fichero y se pediran nuevos nombres hasta poner fin . 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1116 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("nombres.dat"))) {

            nombres = (ArrayList<String>) in.readObject();

        } catch (IOException ex) {
            System.out.println("No se encuentra el archivo.");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String nombre;
        do {
            System.out.println("Introduce un nuevo nombre (FIN para terminar) : ");
            nombre = sc.nextLine().toUpperCase();

            nombres.add(nombre);

        } while (!nombre.equals("FIN"));

        Collections.sort(nombres);
        System.out.println(nombres);

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("nombres.dat"))) {

            in.writeObject(nombres);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
