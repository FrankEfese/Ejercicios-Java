package actividad.aplicacion.pkg11.pkg22;

//Crear la clase Empleado (dni , nombre y sueldo) usando la Lista Object. 
//-Alta
//-Baja
//-Mostrar Dato Empleado
//-Listar
import java.util.*;
import java.io.*;

public class ActividadAplicacion1122 {

    public static void main(String[] args) {

        Empleado tabla[] = new Empleado[0];

        Lista l = new Lista(tabla);

        Scanner sc = new Scanner(System.in);

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("empleadoLista.dat"))) {

            l = (Lista) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        int eleccion;
        do {
            System.out.println("\nAgregar Empleado (Pulsa 1)");
            System.out.println("Mostrar Empleado (Pulsa 2)");
            System.out.println("Dar de Baja (Pulsa 3)");
            System.out.println("Listar Empleados(Pulsa 4)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce su Dni : ");
                    sc.nextLine();
                    String dni = sc.nextLine();
                    System.out.println("Introduce su Nombre : ");

                    String nom = sc.nextLine();
                    System.out.println("Introduce su Sueldo : ");

                    int sueldo = sc.nextInt();

                    Empleado c = new Empleado(dni, nom, sueldo);
                    comprobarCliente(l, c);
                    break;

                case 2:

                    System.out.println("\nIntroduce el DNI del Empleado que quieres Ver : ");
                    sc.nextLine();
                    dni = sc.nextLine();

                    boolean x = false;
                    for (Object f : l.tabla) {

                        Empleado e = (Empleado) f;

                        if (e.dni.equals(dni)) {
                            x = true;
                            System.out.println("\nSus Datos : ");
                            System.out.println(e.toString());

                        }

                    }

                    if (!x) {
                        System.out.println("\nNo hay nadie con este ID");
                    }

                    break;

                case 3:
                    System.out.println("\nIntroduce el DNI del Cliente que quieres dar de Baja : ");
                    sc.nextLine();
                    dni = sc.nextLine();

                    int n = -1;

                    for (Object f : l.tabla) {
                        Empleado e = (Empleado) f;

                        if (e.dni.equals(dni)) {
                            n = l.buscar(e);

                        }

                    }

                    if (n >= 0) {
                        l.eliminar(n);
                        System.out.println("\nEmpleado Borrado");
                    } else {
                        System.out.println("\nNo hay nadie con este ID");
                    }

                    break;

                case 4:

                    if (l.tabla.length == 0) {
                        System.out.println("\nAun no hay Clientes");
                    } else {
                        System.out.println("\nEstos son los Empleados");
                        System.out.println(l.toString());
                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 5);

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("empleadoLista.dat"))) {

            in.writeObject(l);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static Lista comprobarCliente(Lista l, Empleado n) {
        boolean ok = false;
        for (Object f : l.tabla) {

            Empleado e = (Empleado) f;

            if (e.dni.equals(n.dni)) {
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
