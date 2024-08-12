package actividad.resuelta.pkg11.pkg9;

//Implementar un programa que registra la evolucion temporal de la temperatura en una ciudad. 
//La app mostrara un menu que permite añadir nuevos registros y mostrar el listado . 
import java.util.*;
import java.io.*;
import java.time.LocalDateTime;

public class ActividadResuelta119 {

    public static void main(String[] args) {

        Temperatura tabla[] = new Temperatura[0];
        Scanner sc = new Scanner(System.in);

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("temperaturas.dat"))) {

            tabla = (Temperatura[]) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Bienvenido");
        int eleccion;

        do {
            System.out.println("\nAgregar Temperatura (Pulsa 1)");
            System.out.println("Ver Listado (Pulsa 2)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:

                    System.out.println("\nIntroduce la temperatura : ");
                    double temp = sc.nextDouble();
                    tabla = Arrays.copyOf(tabla, tabla.length + 1);
                    tabla[tabla.length - 1] = new Temperatura(temp, LocalDateTime.now());

                    break;

                case 2:
                    if (tabla.length == 0) {
                        System.out.println("\nAun no hay Registros");
                    } else {
                        System.out.println("\nREGISTROS : ");
                        System.out.println(Arrays.deepToString(tabla));

                    }
                    break;

            }

        } while (eleccion > 0 && eleccion < 3);

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("temperaturas.dat"))) {

            in.writeObject(tabla);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
