package actividad.aplicacion.pkg11.pkg19;

//Implementar una app con un menu que nos permita agrgar el numero de llamadas de un dia y 
//ver la lista completa . 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1119 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numLlamadas = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("numLLamadas.dat"))) {

            numLlamadas = (ArrayList<Integer>) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        int eleccion;

        do {
            System.out.println("\nPara insertar Nuevo Numero de LLamadas (Pulsa 1) : ");
            System.out.println("Para mostrar numero de LLamadas (Pulsa 2) ");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:

                    System.out.println("\nIntroduce nuevo Numero : ");
                    sc.nextLine();
                    int n = sc.nextInt();
                    numLlamadas.add(n);

                    break;

                case 2:

                    if (numLlamadas.isEmpty()) {
                        System.out.println("\nAun no hay LLamadas.");
                    } else {
                        System.out.println("\nEstos son los numerod de LLamadas : ");
                        System.out.println(numLlamadas);
                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 3);

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("numLLamadas.dat"))) {

            in.writeObject(numLlamadas);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
