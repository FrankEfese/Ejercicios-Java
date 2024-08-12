package actividad.aplicacion.pkg6.pkg14;

//Diseña una app que se comporte como una pequeña agenda. Mediante un menu
//el usuario podra elegir entre : 
//-Añadir un nuevo contacto (nombre y telefono)
//-Buscar el telefono de un contacto a partir de su nombre. 
//-Mostrar la informacion de todos los contacto ordenados alfabeticamente mediante el nombre. 
import java.util.*;

public class ActividadAplicacion614 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int eleccion;
        String tabla[] = new String[0];
        int pos = -1;
        int indice = 0;

        do {
            System.out.println("\nPara agregar un contacto (PULSA 1)");
            System.out.println("Para buscar un telefono por el nombre (PULSA 2)");
            System.out.println("Para ver toda la informacion (PULSA 3)");

            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("Introduce el Nombre y el Telefono (Fran : 21324124 ) : ");
                    sc.nextLine();
                    String contacto = sc.nextLine().toUpperCase();
                    tabla = Arrays.copyOf(tabla, tabla.length + 1);
                    tabla[tabla.length - 1] = contacto;
                    Arrays.sort(tabla);
                    System.out.println("\nContacto Agregado");
                    break;

                case 2:
                    System.out.println("\nIntroduce el Nombre del Contacto que desea buscar : ");
                    sc.nextLine();
                    String nom = sc.nextLine().toUpperCase();

                    if (tabla.length == 0) {
                        System.out.println("\nAun no hay contactos. ");
                    } else {

                        for (int x = 0; x < tabla.length; x++) {

                            pos = tabla[x].indexOf(nom);
                            if (pos >= 0) {
                                indice = x;
                                break;
                            }

                        }

                        if (pos >= 0) {
                            System.out.println("\nDATOS DEL CONTACTO : ");
                            System.out.println(tabla[indice]);
                        } else {
                            System.out.println("\nNO EXISTE ESTE CONTACTO");
                        }

                        pos = -1;
                        indice = 0;

                    }

                    break;

                case 3:
                    Arrays.sort(tabla);

                    System.out.println("\nLOS CONTACTOS ORDENADOS POR NOMBRE : ");

                    System.out.println(Arrays.toString(tabla));
            }

        } while (eleccion > 0 && eleccion < 4);

        System.out.println("ADIOSS");

    }

}
