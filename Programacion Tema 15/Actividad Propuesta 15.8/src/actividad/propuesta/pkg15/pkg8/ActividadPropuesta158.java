package actividad.propuesta.pkg15.pkg8;

//Escribe una app que permita gestionar los articulos escritos por distintos periodistas.
//Un periodista puede escribir muchos art y un art tendra un unico autro. 
//Del Periodista (nombre , dni , y numTele) De Art (titulo , año publi , y numero de palabras)
//-Alta de Periodista
//-Baja de Periodista
//-Nuevo Art
//-Mostrar art de un Periodista
//-Mostrar todos los art de un año
import java.util.*;

public class ActividadPropuesta158 {

    public static void main(String[] args) {

        ContPeriodista p = new ContPeriodista();
        ContArt a = new ContArt();

        Scanner sc = new Scanner(System.in);

        int eleccion;

        System.out.println("BIENVENIDO");
        System.out.println("-------------");

        do {
            System.out.println("\nPara agregar Periodista (Pulsa 1)");
            System.out.println("Para eliminar Periodista (Pulsa 2)");
            System.out.println("Nuevo Articulo (Pulsa 3)");
            System.out.println("Mostrar Articulos de un Periodista (Pulsa 4)");
            System.out.println("Mostrar los Articulos de un Año (Pulsa 5)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce su DNI : ");
                    sc.nextLine();
                    String dni = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Nombre : ");
                    String nom = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Telefono : ");
                    int tele = sc.nextInt();
                    Periodista x = new Periodista(dni, nom, tele, new ArrayList<Articulo>());
                    p.crear(x);
                    break;

                case 2:

                    if (p.cant() == 0) {
                        System.out.println("\nNo hay Periodistas");

                    } else {

                        System.out.println("\nIntroduce su DNI : ");
                        sc.nextLine();
                        dni = sc.nextLine();
                        p.delete(dni);

                    }
                    break;

                case 3:

                    if (p.cant() != 0) {
                        System.out.println("\nIntroduce su Titulo : ");
                        sc.nextLine();
                        String titulo = sc.nextLine().toUpperCase();
                        System.out.println("\nIntroduce el anio de Publicacion : ");
                        int an = sc.nextInt();
                        System.out.println("\nIntroduce su numero de Palabras : ");
                        int cant = sc.nextInt();
                        System.out.println("\nIntroduce el DNI del Periodista : ");
                        sc.nextLine();
                        dni = sc.nextLine().toUpperCase();

                        Periodista peri = p.unPerio(dni);

                        if (peri != null) {

                            Articulo aux = new Articulo(titulo, an, cant, peri);
                            a.crear(aux);
                            p.agregarArt(peri, aux);

                        } else {
                            System.out.println("\nNo hay ningun Periodista con ese DNI");
                        }

                    } else {
                        System.out.println("\nAun no hay Periodistas");
                    }

                    break;

                case 4:

                    if (p.cant() == 0) {
                        System.out.println("\nNo hay Periodistas");

                    } else {

                        System.out.println("\nIntroduce su DNI : ");
                        sc.nextLine();
                        dni = sc.nextLine();
                        Periodista peri2 = p.unPerio(dni);

                        if (peri2 != null) {

                            List<Articulo> lista = peri2.getArticulos();
                            if (lista.isEmpty()) {
                                System.out.println("\nAUN NO TIENE ARTIUCLOS");
                            } else {
                                System.out.println("\nEstos son sus ARTICULOS");
                                System.out.println("-------------------------------");
                                for (Articulo m : lista) {
                                    System.out.println(m.toString());
                                }

                            }

                        } else {
                            System.out.println("\nNo hay ningun Periodista con ese DNI");
                        }

                    }
                    break;

                case 5:

                    if (a.cant() == 0) {
                        System.out.println("\nAun no hay Articulos");
                    } else {

                        System.out.println("\nIntroduce el anio de Publicacion : ");
                        int anio = sc.nextInt();
                        int cont = 0;

                        List<Articulo> lista = a.todos();

                        System.out.println("\nEstos son los Articulos de ese Anio : ");
                        System.out.println("--------------------------------------------");
                        for (Articulo s : lista) {

                            if (s.getAnioPubli() == anio) {
                                System.out.println(s.toString());
                                cont++;
                            }
                        }

                        if (cont == 0) {
                            System.out.println("\nNo habia de ese Anio");
                        }

                    }
                    break;

            }

        } while (eleccion > 0 && eleccion < 6);

        System.out.println("\nADIOSSS");

    }

}
