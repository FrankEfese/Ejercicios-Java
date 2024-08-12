package actividad.aplicacion.pkg15.pkg15;

//Equipo(id , nombre , max 5 jugadores)
//Jugador(id , nombre , max goles)
//-Nuevo equipo
//-Baja equipo
//-Alta Jugador
//-Asignacion Jugador
//-Mostrar Equipo
//-Mostrar Todos Equipos
//-Mostrar Todos Jugadores
import Controladores.ContEquipo;
import Controladores.ContJugador;
import java.util.*;

public class ActividadAplicacion1515 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContEquipo e = new ContEquipo();
        ContJugador j = new ContJugador();

        System.out.println("\nBIENVENIDO");
        System.out.println("-------------------");
        int eleccion;

        do {

            System.out.println("\nNuevo Equipo (Pulsa 1)");
            System.out.println("Baja Equipo (Pulsa 2)");
            System.out.println("Alta de Jugador (Pulsa 3)");
            System.out.println("Asignar Jugador a un Equipo o Traspaso (Pulsa 4)");
            System.out.println("Mostrar un Equipo (Pulsa 5)");
            System.out.println("Mostrar todos los Equipos (Pulsa 6)");
            System.out.println("Mostrar todos los Jugadores (Pulsa 7)");
            System.out.println("Para Salir (Pulsa Otro Numero)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce el Nombre del Equipo : ");
                    sc.nextLine();
                    String nom = sc.nextLine().toUpperCase();
                    Equipo p = new Equipo(nom);
                    e.crear(p);
                    break;

                case 2:

                    if (e.cantidad() == 0) {
                        System.out.println("\nNO HAY EQUIPOS PARA BORRAR");
                    } else {

                        List<Equipo> lista = e.todos();
                        System.out.println("\nESTOS SON LOS EQUIPOS");
                        System.out.println("----------------------------");

                        for (Equipo aux : lista) {
                            System.out.println(aux);
                        }

                        System.out.println("\nIntroduce el ID del Equipo que quieres BORRAR : ");
                        int id = sc.nextInt();

                        e.eliminar(id);

                    }
                    break;

                case 3:

                    System.out.println("\nIntroduce el Nombre del Jugador : ");
                    sc.nextLine();
                    nom = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su maximo de Goles : ");
                    int goles = sc.nextInt();
                    Jugador a = new Jugador(nom, goles);
                    j.crear(a);
                    break;

                case 4:

                    if (e.cantidad() == 0) {
                        System.out.println("\nNO HAY EQUIPOS DISPONIBLES");
                    } else {

                        if (j.disponibles() > 0 && e.disponible() > 0) {

                            List<Jugador> lista = j.todos();
                            System.out.println("\nESTOS SON LOS JUGADORES");
                            System.out.println("----------------------------");

                            for (Jugador aux : lista) {

                                System.out.println(aux);

                            }

                            System.out.println("\nIntroduce el ID del Jugador que quieres Asignar : ");
                            int id = sc.nextInt();
                            Jugador x = j.uno(id);

                            List<Equipo> lista2 = e.todos();
                            System.out.println("\nESTOS SON LOS EQUIPOS CON PLAZAS DISPONIBLES");
                            System.out.println("----------------------------");

                            for (Equipo aux : lista2) {
                                if (aux.jugadores.size() < 5) {
                                    System.out.println(aux);
                                }
                            }

                            System.out.println("\nIntroduce el ID del Equipo que quieres Asignar : ");
                            id = sc.nextInt();
                            Equipo v = e.uno(id);

                            if (v != null && x != null) {

                                j.asignarEquipo(v, x);
                            } else {
                                System.out.println("\nTE HAS EQUIVOCADO EN ALGUN ID");
                            }

                        } else {

                            System.out.println("\nO NO HAY JUGADORES SIN EQUIPO / O NO HAY EQUIPOS CON PLAZAS");
                        }

                    }

                    break;

                case 5:

                    if (e.cantidad() == 0) {
                        System.out.println("\nNO HAY EQUIPOS");
                    } else {

                        List<Equipo> lista = e.todos();
                        System.out.println("\nESTOS SON LOS EQUIPOS");
                        System.out.println("----------------------------");

                        for (Equipo aux : lista) {
                            System.out.println(aux);
                        }

                        System.out.println("\nIntroduce el ID del Equipo que quieres VER : ");
                        int id = sc.nextInt();
                        Equipo c = e.uno(id);

                        if (c != null) {

                            System.out.println("\nESTE ES EL EQUIPO");
                            System.out.println("-------------------------");
                            System.out.println(c);

                            if (!c.getJugadores().isEmpty()) {
                                System.out.println("\nSUS JUGADORES : ");
                                System.out.println("-----------------------");
                                for (Jugador z : c.getJugadores()) {
                                    System.out.println(z);
                                }

                            } else {
                                System.out.println("\nNO TIENE JUGADORES ACTUALMENTE");
                            }

                        } else {
                            System.out.println("\nTE HAS EQUIVOCADO DE ID");
                        }

                    }

                    break;

                case 6:

                    if (e.cantidad() == 0) {
                        System.out.println("\nNO HAY EQUIPOS ACTUALMENTE");
                    } else {

                        List<Equipo> lista = e.todos();
                        System.out.println("\nESTOS SON LOS EQUIPOS");
                        System.out.println("----------------------------");

                        for (Equipo aux : lista) {
                            System.out.println(aux);
                        }

                    }

                    break;

                case 7:

                    if (j.cantidad() == 0) {
                        System.out.println("\nNO HAY JUGADORES ACTUALMENTE");
                    } else {

                        List<Jugador> lista = j.todos();
                        System.out.println("\nESTOS SON LOS JUGADORES");
                        System.out.println("----------------------------");

                        for (Jugador aux : lista) {

                            System.out.println(aux);

                        }

                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 8);

    }

}
