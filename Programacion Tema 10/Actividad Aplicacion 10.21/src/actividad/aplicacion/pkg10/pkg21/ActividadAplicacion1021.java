package actividad.aplicacion.pkg10.pkg21;

//Diseña una pequeña agenda (nuevo contacto , buscar por nombre , mostrar todos) .
//Solo se podran guardar 20 personas. No se puede repetir nombre. Mostar los contactos por orden de nombre. 
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActividadAplicacion1021 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Contacto tabla[] = new Contacto[0];

        System.out.println("Bienvenido a tu Agenda : ");
        int eleccion;

        do {
            System.out.println("\nAgregar Contacto (Pulsa 1)");
            System.out.println("Buscar por Nombre (Pulsa 2)");
            System.out.println("Mostrar Contactos (Pulsa 3)");
            System.out.println("Para salir (Pulsa otro Numero)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce el Nombre : ");
                    sc.nextLine();
                    String nombre = sc.nextLine().toUpperCase();
                    System.out.println("Introduce el telefono : ");
                    int telefono = sc.nextInt();
                    Contacto c = new Contacto(nombre, telefono);
                    tabla = existe(tabla, c);
                    break;

                case 2:
                    System.out.println("\nIntroduce el Nombre del Contacto que quieras buscar : ");
                    sc.nextLine();
                    String n = sc.nextLine().toUpperCase();
                    contacto(n, tabla);
                    break;

                case 3:

                    if (tabla.length == 0) {
                        System.out.println("\nLa agenda esta vacia");
                    } else {

                        Arrays.sort(tabla);
                        System.out.println(Arrays.deepToString(tabla));

                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 4);

        try (BufferedWriter in = new BufferedWriter(new FileWriter("agenda.txt"))) {

            for (Contacto a : tabla) {
                String nombre = a.nombre;
                String t = String.valueOf(a.telefono);

                in.write(nombre);
                in.write("\t");
                in.write(t);
                in.newLine();

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

    static Contacto[] existe(Contacto t[], Contacto a) {

        boolean esta = false;

        if (t.length < 20) {

            for (Contacto p : t) {

                if (a.nombre.equals(p.nombre)) {
                    esta = true;
                }
            }

            if (esta) {
                System.out.println("\nYa existe ");
            } else {
                t = Arrays.copyOf(t, t.length + 1);
                t[t.length - 1] = a;
                System.out.println("\nContacto Agregado");
            }

            return t;

        } else {

            System.out.println("\nNo hay mas espacio.");
            return t;

        }

    }

    static void contacto(String n, Contacto t[]) {

        int l = n.length();
        int cont = 0;

        for (Contacto p : t) {

            if (n.length() <= p.nombre.length()) {

                String x = p.nombre.substring(0, l);

                if (x.equals(n)) {

                    System.out.println("\n" + p.toString());
                    cont++;
                }

            }

        }

        if (cont == 0) {
            System.out.println("\nNo existe nadie con ese Nombre");
        }

    }

}
