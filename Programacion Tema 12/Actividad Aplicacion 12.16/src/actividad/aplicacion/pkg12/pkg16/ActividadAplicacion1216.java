package actividad.aplicacion.pkg12.pkg16;

//Repetir la Actividad Resuelta 12.11 pero añadiendole un listado por nombre. 
import java.util.*;
import java.time.LocalDateTime;

public class ActividadAplicacion1216 {

    public static void main(String[] args) {

        ArrayList<Socio> socios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int eleccion;
        String dni;
        String nom;
        LocalDateTime f;
        System.out.println("BIENVENIDO");
        do {
            System.out.println("\nAlta de Socio (Pulsa 1)");
            System.out.println("Baja de Socio (Pulsa 2)");
            System.out.println("Modificacion de Socio (Pulsa 3)");
            System.out.println("Listar por DNI (Pulsa 4)");
            System.out.println("Listar por Antiguedad (Pulsa 5)");
            System.out.println("Listar por Nombre (Pulsa 6)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:

                    System.out.println("\nIntroduce su DNI : ");
                    sc.nextLine();
                    dni = sc.nextLine();
                    System.out.println("Introduce su Nombre : ");
                    nom = sc.nextLine();

                    if (!esta(socios, dni)) {

                        socios.add(new Socio(dni, nom, LocalDateTime.now()));
                        System.out.println("\nAgregado");

                    } else {
                        System.out.println("\nYa existe este DNI");
                    }

                    break;

                case 2:

                    if (socios.size() == 0) {
                        System.out.println("\nAun no hay Socios.");
                    } else {

                        System.out.println("\nEstos son los Socios : ");
                        System.out.println("-------------------");
                        for (Socio a : socios) {
                            System.out.println(a);
                        }

                        System.out.println("\nIntroduce el DNI del Socio que deseas Borrar : ");
                        sc.nextLine();
                        dni = sc.nextLine();
                        socios = borrar(socios, dni);

                    }

                    break;

                case 3:

                    if (socios.size() == 0) {
                        System.out.println("\nAun no hay Socios.");
                    } else {

                        System.out.println("\nEstos son los Socios : ");
                        System.out.println("-------------------");
                        for (Socio a : socios) {
                            System.out.println(a);
                        }

                        System.out.println("\nIntroduce el DNI del Socio que deseas Modificar : ");
                        sc.nextLine();
                        dni = sc.nextLine();
                        socios = mod(socios, dni);

                    }

                    break;

                case 4:

                    if (socios.size() == 0) {
                        System.out.println("\nAun no hay Socios");
                    } else {
                        System.out.println("\nListado por DNI : ");
                        System.out.println("-------------------");
                        Collections.sort(socios);
                        for (Socio a : socios) {
                            System.out.println(a);
                        }
                    }

                    break;

                case 5:

                    if (socios.size() == 0) {
                        System.out.println("\nAun no hay Socios");
                    } else {
                        System.out.println("\nListado por Fecha : ");
                        System.out.println("-------------------");
                        Collections.sort(socios, new ComFecha());
                        for (Socio a : socios) {
                            System.out.println(a);
                        }

                        break;

                    }

                case 6:

                    if (socios.size() == 0) {
                        System.out.println("\nAun no hay Socios");
                    } else {
                        System.out.println("\nListado por Nombre : ");
                        System.out.println("-------------------");
                        Collections.sort(socios, new ComNombre());
                        for (Socio a : socios) {
                            System.out.println(a);
                        }

                        break;
                    }

            }

        } while (eleccion > 0 && eleccion < 7);

        System.out.println("\nADIOSSS");

    }

    static boolean esta(ArrayList<Socio> s, String dni) {

        boolean existe = false;

        for (Socio a : s) {

            if (a.dni.equals(dni)) {
                existe = true;
            }

        }

        return existe;

    }

    static ArrayList<Socio> borrar(ArrayList<Socio> s, String dni) {

        Iterator<Socio> it = s.iterator();
        int cont = 0;

        while (it.hasNext()) {

            Socio a = it.next();

            if (a.dni.equals(dni)) {
                it.remove();
                System.out.println("\nELIMINADO");
                cont++;
            }

        }

        if (cont == 0) {
            System.out.println("\nNo se ha encontrado nadie con ese DNI");
            return s;
        } else {
            return s;
        }

    }

    static ArrayList<Socio> mod(ArrayList<Socio> s, String dni) {

        Iterator<Socio> it = s.iterator();
        Scanner sc = new Scanner(System.in);
        int eleccion;
        int cont = 0;
        Socio b = null;
        String dn;
        String nom;

        while (it.hasNext()) {

            Socio a = it.next();

            if (a.dni.equals(dni)) {
                b = new Socio(a.dni, a.nombre, a.fecha);
                it.remove();
                cont++;

            }

        }

        if (b != null) {

            do {
                System.out.println("\nPara cambiar el DNI (Pulsa 1)");
                System.out.println("Para cambiar el Nombre (Pulsa 2)");
                eleccion = sc.nextInt();

                switch (eleccion) {

                    case 1:

                        System.out.println("\nIntroduce el nuevo DNI : ");
                        do {
                            dn = sc.nextLine();
                        } while (dn.length() == 0);

                        if (!esta(s, dn)) {
                            b.dni = dn;
                            System.out.println("\nCambio Realizado");
                        } else {
                            System.out.println("\nYa hay alguien con ese DNI");
                        }

                        break;

                    case 2:

                        System.out.println("\nIntroduce el nuevo Nombre : ");
                        do {
                            nom = sc.nextLine();
                        } while (nom.length() == 0);

                        b.nombre = nom;
                        System.out.println("\nCambio Realizado");
                        break;

                }

            } while (eleccion > 0 && eleccion < 3);

            s.add(b);
        }

        if (cont == 0) {
            System.out.println("\nNo hay nadie con este DNI");
            return s;
        } else {
            return s;
        }

    }
}
