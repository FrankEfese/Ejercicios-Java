package actividad.propuesta.pkg15.pkg7;

//En la asociacion Amigos de los Animales cada persona es dueña de una unica mascota. De cada dueño
//interesa su DNI , nombre , edad y mascota. De la mascota nombre y raza , agregar un id auto. 
//-Nueva Mascota y Dueño
//-Datos del dueño y mascota
//-Datos de la Mascota
//-Mostrar dueños y mascotas
//-Ver todos los animales
//-Baja del dueño. 
import java.util.*;

public class ActividadPropuesta157 {

    public static void main(String[] args) {

        ControladorDueño d = new ControladorDueño();
        ControladorMascota m = new ControladorMascota();

        Scanner sc = new Scanner(System.in);

        int eleccion;

        System.out.println("BIENVENIDOS");
        System.out.println("---------------");

        do {
            System.out.println("\nPara agregar Mascota y Dueño (Pulsa 1)");
            System.out.println("Para ver datos de Dueño y Mascota (Pulsa 2)");
            System.out.println("Para ver datos de una Mascota (Pulsa 3)");
            System.out.println("Para mostrar todos los Dueños y Mascotas (Pulsa 4)");
            System.out.println("Para ver todas las Mascotas (Pulsa 5)");
            System.out.println("Para dar de baja un Dueño (Pulsa 6)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nVamos con los datos de la Mascota");
                    System.out.println("-------------------------------------");
                    System.out.println("\nIntroduce su Nombre : ");
                    sc.nextLine();
                    String nom = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Raza : ");
                    String raza = sc.nextLine().toUpperCase();
                    Mascota masc = new Mascota(nom, raza);
                    m.crear(masc);
                    System.out.println("\nVamos con los datos del Dueño");
                    System.out.println("-------------------------------------");
                    System.out.println("\nIntroduce su DNI : ");
                    String dni = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Nombre : ");
                    nom = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Edad : ");
                    int edad = sc.nextInt();
                    Dueño due = new Dueño(dni, nom, edad, masc);
                    d.crear(due);
                    break;

                case 2:

                    if (d.cantidad() == 0) {
                        System.out.println("\nAun no hay Dueños");
                    } else {

                        System.out.println("\nIntroduce su DNI : ");
                        sc.nextLine();
                        dni = sc.nextLine().toUpperCase();

                        Dueño aux = d.buscarDueño(dni);

                        if (aux != null) {

                            System.out.println("\nEsta es la INFORMACION : ");
                            System.out.println(aux.toString());

                        } else {
                            System.out.println("\nNo hay nadie con ese DNI");
                        }

                    }

                    break;

                case 3:

                    if (m.cantidad() == 0) {
                        System.out.println("\nAun no hay Mascotas.");
                    } else {

                        System.out.println("\nIntroduce su ID : ");
                        int id = sc.nextInt();

                        Mascota a = m.buscarMascota(id);

                        if (a != null) {

                            System.out.println("\nEsta es su INFORMACION : ");
                            System.out.println(a.toString());

                        } else {

                            System.out.println("\nNo hay ninguna mascota con ese ID.");
                        }

                    }

                    break;

                case 4:

                    if (d.cantidad() == 0) {
                        System.out.println("\nAun no hay Dueños");
                    } else {

                        ArrayList<Dueño> lista = d.todos();

                        System.out.println("\nEstos son todos los DUEÑOS y sus MASCOTAS");
                        System.out.println("------------------------------------------------");
                        for (Dueño b : lista) {
                            System.out.println(b.toString());
                        }

                    }
                    break;

                case 5:

                    if (m.cantidad() == 0) {
                        System.out.println("\nAun no hay Mascotas.");
                    } else {

                        ArrayList<Mascota> lista = m.todos();
                        System.out.println("\nEstas son todas las MASCOTAS");
                        System.out.println("-------------------------------------");
                        for (Mascota a : lista) {
                            System.out.println(a.toString());
                        }
                    }
                    break;

                case 6:

                    if (d.cantidad() == 0) {
                        System.out.println("\nAun no hay Dueños");
                    } else {

                        System.out.println("\nIntroduce su DNI para ELIMINARLO : ");
                        sc.nextLine();
                        dni = sc.nextLine().toUpperCase();
                        d.delete(dni);

                    }
                    break;

            }

        } while (eleccion > 0 && eleccion < 7);

        System.out.println("\nADIOSSS ");

    }

}
