package actividad.aplicacion.pkg10.pkg16;

//Un libro de firmas es util para recoger los nombres de todas las personas
//que han pasado por un determinado lugar. Vrea una app que permita mostrar el libro de firmas e insertar un nuevo nombre(si no esta). 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1016 {

    public static void main(String[] args) {

        String nombre;
        String nuevoNombre;
        int eleccion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Que deseas hacer : ");
        do {

            System.out.println("\nVer libro de Firmas (Pulsa 1)");
            System.out.println("Introducir nuevo Nombre (Pulsa 2)");

            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1: 
                    
                    
                    try (BufferedReader in = new BufferedReader(new FileReader("firmas.txt"))) {

                    nombre = in.readLine();

                    if (nombre == null) {
                        System.out.println("\nAun no hay Nombres");
                    } else {

                        System.out.println("\nNOMBRES : ");
                        while (nombre != null) {

                            System.out.println(nombre);
                            nombre = in.readLine();

                        }

                    }

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());

                }

                break;

                case 2:
                    
                    
                    
                    try (BufferedReader in = new BufferedReader(new FileReader("firmas.txt")); BufferedWriter w = new BufferedWriter(new FileWriter("firmas.txt", true))) {

                    System.out.println("\nIntroduce el Nombre : ");
                    sc.nextLine();
                    nuevoNombre = sc.nextLine();

                    nombre = in.readLine();

                    if (nombre == null) {
                        w.write(nuevoNombre);
                        w.newLine();
                    } else {

                        boolean estado = false;
                        while (nombre != null) {

                            if (nuevoNombre.equals(nombre)) {
                                estado = true;
                            }
                            nombre = in.readLine();

                        }

                        if (estado) {
                            System.out.println("\nYa esta este Nombre");
                        } else {

                            w.write(nuevoNombre);
                            w.newLine();

                        }

                    }

                } catch (IOException ex) {

                    System.out.println(ex.getMessage());

                }

                break;

            }

        } while (eleccion < 3 && eleccion > 0);

    }

}
