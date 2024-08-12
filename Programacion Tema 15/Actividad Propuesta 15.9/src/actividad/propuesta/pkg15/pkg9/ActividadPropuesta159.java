package actividad.propuesta.pkg15.pkg9;

//Existen una serie de torneos de ajedrez(id , nombre , localidad). Jugadores (dni , nombre , telefono)
//Solo nos interesa saber que jugadores gana cada uno de ellos. 
import Controladores.ContJug;
import Controladores.ContTorneo;
import java.util.*;

public class ActividadPropuesta159 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContTorneo t = new ContTorneo();
        ContJug j = new ContJug();
        int eleccion;

        System.out.println("BIENVENIDO");
        System.out.println("----------------");

        do {
            System.out.println("\nPara agregar Jugador(Pulsa 1)");
            System.out.println("Para agregar Torneo (Pulsa 2)");
            System.out.println("Para eliminar Torneo (Pulsa 3)");
            System.out.println("Para ver los Jugadores (Pulsa 4)");
            System.out.println("Para ver los Torneos (Pulsa 5)");
            System.out.println("Para ver a los Jugadores Campeones (Pulsa 6)");
            System.out.println("Para Salir (Pulsa Otro Numero)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce su DNI :");
                    sc.nextLine();
                    String dni = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Nombre : ");
                    String nom = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Telefono : ");
                    int telefono = sc.nextInt();
                    j.crear(new Ajedrezista(dni, nom, telefono));
                    break;

                case 2:

                    if (j.cantidad() == 0) {
                        System.out.println("\nAun no hay JUGADORES");
                    } else {

                        System.out.println("\nIntroduce su Nombre :");
                        sc.nextLine();
                        nom = sc.nextLine().toUpperCase();
                        System.out.println("\nIntroduce la Localidad : ");
                        String loc = sc.nextLine().toUpperCase();
                        System.out.println("\nIntroduce el DNI del Jugador Campeon : ");
                        dni = sc.nextLine().toUpperCase();
                        Ajedrezista aux = j.uno(dni);
                        if (aux != null) {

                            t.crear(new Torneo(nom, loc, aux));

                        } else {
                            System.out.println("\nNo hay nadie con ese DNI");
                        }

                    }

                    break;

                case 3:

                    if (t.cantidad() == 0) {
                        System.out.println("\nAun no hay Torneos");
                    } else {
                        System.out.println("\nIntroduce el ID del Torneo : ");
                        int id = sc.nextInt();
                        t.eliminar(id);
                    }

                    break;

                case 4:

                    if (j.cantidad() == 0) {
                        System.out.println("\nAun no hay Jugadores");
                    } else {

                        List<Ajedrezista> lista = j.todos();
                        System.out.println("\nEstos son los Jugadores : ");
                        System.out.println("------------------------------");
                        for (Ajedrezista a : lista) {
                            System.out.println(a);
                        }

                    }
                    break;

                case 5:

                    if (t.cantidad() == 0) {
                        System.out.println("\nAun no hay Torneos");
                    } else {

                        List<Torneo> tor = t.todos();
                        System.out.println("\nEstos son los Torneos : ");
                        System.out.println("----------------------------");
                        for (Torneo tr : tor) {
                            System.out.println(tr);
                        }

                    }

                    break;

                case 6:

                    if (t.cantidad() == 0) {
                        System.out.println("\nAun no hay Torneos");
                    } else {

                        List<Torneo> tor = t.todos();
                        System.out.println("\nEstos son los Ganadores: ");
                        System.out.println("----------------------------");
                        for (Torneo tr : tor) {
                            System.out.println("\nTorneo : " + tr.getId() + " / " + tr.getNombre());
                            System.out.println("CAMPEON : " + tr.getJugador());
                        }

                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 8);
        System.out.println("\nADIOOSSS");

    }

}
