package actividad.aplicacion.pkg10.pkg12;

//Diseña una app que pida al usuario su nombre y edad. Estos datos deben guardarse en el fichero
//datos.txt. Si este fichero existe, deben añadirse al final en una nueva linea y en caso de no existir debe crearse. 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        String edad;

        try (BufferedWriter in = new BufferedWriter(new FileWriter("datos.txt", true))) {

            System.out.println("Introduce tu nombre :");
            nombre = sc.nextLine();
            in.write(nombre);
            in.write("\t");
            System.out.println("Introduce tu edad : ");
            edad = sc.nextLine();
            in.write(edad);
            in.newLine();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

    }

}
