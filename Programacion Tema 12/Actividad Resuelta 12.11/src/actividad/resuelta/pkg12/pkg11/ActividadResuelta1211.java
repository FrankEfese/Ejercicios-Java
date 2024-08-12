package actividad.resuelta.pkg12.pkg11;

//Implementa la clase Socio (dni , nombre , fechaAlta) metodo equals , comparable(dni). 
//Crear un club de socios usando un fichero socios.dat. 
//-Alta
//-Baja
//-Modificacion
//-Listado por DNI
//-Listado por Antiguedad
import java.util.*;
import java.io.*;
import java.time.LocalDateTime;

public class ActividadResuelta1211 {

    public static void main(String[] args) {

        ArrayList<Socio> socios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {

            socios = (ArrayList<Socio>) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
        }
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
                        System.out.println("\nListado por DNI : ");
                        System.out.println("-------------------");
                        Collections.sort(socios, new ComFecha());
                        for (Socio a : socios) {
                            System.out.println(a);
                        }

                        break;

                    }

            }

        } while (eleccion > 0 && eleccion < 6);

        System.out.println("\nADIOSSS");

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {

            in.writeObject(socios);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

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
