package actividad.aplicacion.pkg15.pkg12;

//Txista(nombre , dni , fechaNac)
//Taxi(precio , matricula , numPlazas)
//-Alta Taxista
//-Alta taxi
//-Comienzo Jornada
//-Fin Jornada
//-Informacion Taxista y Taxi
//-Mostrar taxistas trabajando
//-Mostrar txistas fuera de servicio
import Controladores.ContTaxi;
import Controladores.ContTaxista;
import java.util.*;

public class ActividadAplicacion1512 {

    public static void main(String[] args) {

        ContTaxi x = new ContTaxi();
        ContTaxista t = new ContTaxista();

        Scanner sc = new Scanner(System.in);

        int eleccion;

        System.out.println("BIENVENIDO");
        System.out.println("--------------");

        do {
            System.out.println("\nAlta de Taxista (Pulsa 1)");
            System.out.println("Alta de Taxi (Pulsa 2)");
            System.out.println("Comienzo de Jornada (Pulsa 3)");
            System.out.println("Fin de Jornada (Pulsa 4 )");
            System.out.println("Informacion Taxista y Taxi (Pulsa 5)");
            System.out.println("Mostrar Taxistas Trabajando (Pulsa 6)");
            System.out.println("Mostrar Taxistas fuera de Servicio (Pulsa 7)");
            System.out.println("Para salir (Pulsa otro Numero)");
            System.out.println("-------------------------------------");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce su DNI : ");
                    sc.nextLine();
                    String dni = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Nombre : ");
                    String nom = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Fecha de Nacimiento : ");
                    System.out.println("----------------------");
                    System.out.print("Introduce su Dia : ");
                    int dia;
                    do {
                        dia = sc.nextInt();
                    } while (dia < 1 || dia > 31);
                    System.out.print("Introduce su Mes : ");
                    int mes;
                    do {
                        mes = sc.nextInt();
                    } while (mes < 1 || mes > 12);

                    System.out.print("Introduce su Año : ");
                    int anio = sc.nextInt();
                    Taxista taxista = new Taxista(dni, nom, new Date(anio - 1900, mes - 1, dia));
                    t.crear(taxista);
                    break;

                case 2:
                    System.out.println("\nIntroduce su Matricula : ");
                    sc.nextLine();
                    String mat = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Precio : ");
                    double precio = sc.nextDouble();
                    System.out.println("\nIntroduce numero de Plazas : ");
                    int plazas = sc.nextInt();
                    Taxi taxi = new Taxi(mat, precio, plazas);
                    x.crear(taxi);
                    break;

                case 3:
                    if (x.cantidad() == 0 || t.cantidad() == 0) {
                        System.out.println("\nNO HAY TAXIS O NO HAY TAXISTAS");
                    } else {

                        if (x.noasignados() > 0 && t.noasignados() > 0) {

                            List<Taxi> lista = x.todos();
                            Collections.sort(lista, (z, y) -> z.getMatricula().compareTo(y.getMatricula()));
                            List<Taxista> lista2 = t.todos();
                            Collections.sort(lista2, (z, y) -> z.getDni().compareTo(y.getDni()));
                            System.out.println("\nESTOS SON LOS TAXIS NO ASIGNADOS");
                            System.out.println("------------------------------------");
                            for (Taxi a : lista) {
                                if (a.getTaxista() == null) {
                                    System.out.println(a);
                                }
                            }

                            System.out.println("\nIntroduce la Matricula del Taxi : ");
                            sc.nextLine();
                            mat = sc.nextLine().toUpperCase();
                            Taxi aux = x.uno(mat);

                            System.out.println("\nESTOS SON LOS TAXISTAS SIN TAXI");
                            System.out.println("------------------------------------");
                            for (Taxista a : lista2) {
                                if (a.getTaxi() == null) {
                                    System.out.println(a);
                                }
                            }

                            System.out.println("\nIntroduce el DNI del Taxista : ");
                            dni = sc.nextLine().toUpperCase();
                            Taxista ta = t.uno(dni);

                            if (ta != null && aux != null) {
                                t.agregarTaxi(ta, aux);
                            } else {
                                System.out.println("\nHAS INTRODUCIDO ALGUN DATO MAL");
                            }

                        } else {
                            System.out.println("\nNO HAY TAXIS O TAXISTAS DISPONIBLES.");
                        }

                    }

                    break;

                case 4:
                    if (x.cantidad() == 0 || t.cantidad() == 0) {
                        System.out.println("\nNO HAY TAXIS O NO HAY TAXISTAS");
                    } else {

                        if (t.asignados() > 0) {

                            List<Taxista> lista2 = t.todos();
                            Collections.sort(lista2, (z, y) -> z.getDni().compareTo(y.getDni()));
                            System.out.println("\nESTOS SON LOS TAXISTAS CON COCHE");
                            System.out.println("------------------------------------");
                            for (Taxista a : lista2) {
                                if (a.getTaxi() != null) {
                                    System.out.println(a);
                                }
                            }

                            System.out.println("\nIntroduce el DNI del Taxista : ");
                            sc.nextLine();
                            dni = sc.nextLine().toUpperCase();
                            Taxista ta = t.uno(dni);
                            if (ta != null) {
                                t.quitarTaxi(ta);
                            } else {
                                System.out.println("\nTE HAS EQUIVOCADO DE DNI");
                            }

                        } else {
                            System.out.println("\nNO HAY TAXISTAS ASIGNADOS");
                        }

                    }
                    break;

                case 5:
                    if (x.cantidad() == 0 || t.cantidad() == 0) {
                        System.out.println("\nNO HAY TAXIS O NO HAY TAXISTAS");
                    } else {

                        if (t.asignados() > 0) {

                            List<Taxista> lista2 = t.todos();
                            Collections.sort(lista2, (z, y) -> z.getDni().compareTo(y.getDni()));
                            System.out.println("\nESTOS SON LOS TAXISTAS CON COCHE");
                            System.out.println("------------------------------------");
                            for (Taxista a : lista2) {
                                if (a.getTaxi() != null) {
                                    System.out.println(a + " / " + a.getTaxi());

                                }
                            }

                        } else {
                            System.out.println("\nNO HAY NINGUN TAXISTA ASIGNADO A UN TAXI");
                        }

                    }
                    break;

                case 6:
                    if (x.cantidad() == 0 || t.cantidad() == 0) {
                        System.out.println("\nNO HAY TAXIS O NO HAY TAXISTAS");
                    } else {
                        if (t.asignados() > 0) {

                            List<Taxista> lista2 = t.todos();
                            Collections.sort(lista2, (z, y) -> z.getDni().compareTo(y.getDni()));
                            System.out.println("\nESTOS SON LOS TAXISTAS TRABAJANDO");
                            System.out.println("------------------------------------");
                            for (Taxista a : lista2) {
                                if (a.getTaxi() != null) {
                                    System.out.println(a + " / Matricula Taxi : " + a.getTaxi().getMatricula());

                                }
                            }

                        } else {
                            System.out.println("\nNO HAY NINGUN TAXISTA ASIGNADO A UN TAXI");
                        }

                    }

                    break;

                case 7:
                    if (x.cantidad() == 0 || t.cantidad() == 0) {
                        System.out.println("\nNO HAY TAXIS O NO HAY TAXISTAS");
                    } else {

                        if (t.noasignados() > 0) {

                            List<Taxista> lista2 = t.todos();
                            Collections.sort(lista2, (z, y) -> z.getDni().compareTo(y.getDni()));
                            System.out.println("\nESTOS SON LOS TAXISTAS SIN TRABAJO");
                            System.out.println("------------------------------------");
                            for (Taxista a : lista2) {
                                if (a.getTaxi() == null) {
                                    System.out.println(a);

                                }
                            }

                        } else {
                            System.out.println("\nNO HAY NINGUN TAXISTA SIN TAXI");
                        }

                    }
                    break;

            }

        } while (eleccion > 0 && eleccion < 8);

        System.out.println("\nADIOSSS");
    }

}
