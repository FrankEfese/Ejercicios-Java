package actividad.aplicacion.pkg11.pkg20;

//Implementa una app que guarde y recupere datos de los clientes. Crea la clase 
//Cliente (id , nombre ,telefono). Menu : 
//-Agregar
//-Modificar
//-Dar de Baja
//-Listar
import java.util.*;
import java.io.*;

public class ActividadAplicacion1120 {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("clientes.dat"))) {

            clientes = (ArrayList<Cliente>) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        int eleccion;
        do {
            System.out.println("\nAgregar Cliente (Pulsa 1)");
            System.out.println("Modificar Dato (Pulsa 2)");
            System.out.println("Dar de Baja (Pulsa 3)");
            System.out.println("Listar Clientes (Pulsa 4)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce su ID : ");
                    int id = sc.nextInt();
                    System.out.println("Introduce su Nombre : ");
                    sc.nextLine();
                    String nom = sc.nextLine();
                    System.out.println("Introduce su Telefono : ");

                    int tlf = sc.nextInt();

                    Cliente c = new Cliente(id, nom, tlf);
                    comprobarCliente(clientes, c);
                    break;

                case 2:

                    System.out.println("\nIntroduce el ID del Cliente que quieres modificar algun Dato : ");
                    id = sc.nextInt();

                    boolean x = false;
                    for (Cliente f : clientes) {

                        if (f.id == id) {
                            x = true;
                            do {
                                System.out.println("\nCambiar Nombre (Pulsa 1)");
                                System.out.println("Cambiar Telefono (Pulsa 2)");
                                eleccion = sc.nextInt();

                                switch (eleccion) {

                                    case 1:

                                        System.out.println("Introduce su Nombre : ");
                                        sc.nextLine();
                                        f.nombre = sc.nextLine();
                                        System.out.println("\nCambio Agregado");
                                        break;

                                    case 2:
                                        System.out.println("Introduce su Telefono : ");
                                        sc.nextLine();
                                        f.telefono = sc.nextInt();
                                        System.out.println("\nCambio Agregado");
                                        break;

                                }

                            } while (eleccion > 0 && eleccion < 3);
                        }

                    }

                    if (!x) {
                        System.out.println("\nNo hay nadie con este ID");
                    }

                    break;

                case 3:
                    System.out.println("\nIntroduce el ID del Cliente que quieres dar de Baja : ");
                    id = sc.nextInt();

                    int n = -1;

                    for (Cliente f : clientes) {

                        if (f.id == id) {
                            n = clientes.indexOf(f);

                        }

                    }

                    if (n >= 0) {
                        clientes.remove(n);
                        System.out.println("\nCliente Borrado");
                    } else {
                        System.out.println("\nNo hay nadie con este ID");
                    }

                    break;

                case 4:

                    if (clientes.isEmpty()) {
                        System.out.println("\nAun no hay Clientes");
                    } else {
                        System.out.println("\nEstos son los Clientes");
                        System.out.println(clientes);
                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 5);

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("clientes.dat"))) {

            in.writeObject(clientes);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static ArrayList<Cliente> comprobarCliente(ArrayList<Cliente> t, Cliente n) {
        boolean ok = false;
        for (Cliente f : t) {

            if (f.id == n.id) {
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
