package actividad.aplicacion.pkg11.pkg21;

//Repite la act anterior pero usando la Lista para Object de la act 9.11 . 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1121 {

    public static void main(String[] args) {

        Cliente tabla[] = new Cliente[0];

        Lista l = new Lista(tabla);

        Scanner sc = new Scanner(System.in);

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("clientesLista.dat"))) {

            l = (Lista) in.readObject();

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
                    comprobarCliente(l, c);
                    break;

                case 2:

                    System.out.println("\nIntroduce el ID del Cliente que quieres modificar algun Dato : ");
                    id = sc.nextInt();

                    boolean x = false;
                    for (Object f : l.tabla) {

                        Cliente e = (Cliente) f;

                        if (e.id == id) {
                            x = true;
                            do {
                                System.out.println("\nCambiar Nombre (Pulsa 1)");
                                System.out.println("Cambiar Telefono (Pulsa 2)");
                                eleccion = sc.nextInt();

                                switch (eleccion) {

                                    case 1:

                                        System.out.println("Introduce su Nombre : ");
                                        sc.nextLine();
                                        e.nombre = sc.nextLine();
                                        System.out.println("\nCambio Agregado");
                                        break;

                                    case 2:
                                        System.out.println("Introduce su Telefono : ");
                                        sc.nextLine();
                                        e.telefono = sc.nextInt();
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

                    for (Object f : l.tabla) {
                        Cliente e = (Cliente) f;

                        if (e.id == id) {
                            n = l.buscar(e);

                        }

                    }

                    if (n >= 0) {
                        l.eliminar(n);
                        System.out.println("\nCliente Borrado");
                    } else {
                        System.out.println("\nNo hay nadie con este ID");
                    }

                    break;

                case 4:

                    if (l.tabla.length == 0) {
                        System.out.println("\nAun no hay Clientes");
                    } else {
                        System.out.println("\nEstos son los Clientes");
                        System.out.println(l.toString());
                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 5);

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("clientesLista.dat"))) {

            in.writeObject(l);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static Lista comprobarCliente(Lista l, Cliente n) {
        boolean ok = false;
        for (Object f : l.tabla) {

            Cliente e = (Cliente) f;

            if (e.id == n.id) {
                ok = true;
            }

        }

        if (!ok) {

            l.insertarFinal(n);
            System.out.println("\nAgregado");
            return l;
        } else {
            System.out.println("\nYa existe");
            return l;
        }

    }

}
