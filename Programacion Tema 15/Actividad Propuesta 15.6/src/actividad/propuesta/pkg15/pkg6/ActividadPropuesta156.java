package actividad.propuesta.pkg15.pkg6;

//Realizar una app para gestionar una biblioteca compuesta de manueales y revistas. 
//De cada manual necesitamos guardar su id , el titulo y el precio. Una revista es un tipo especial de 
//manual, ademas agregar el mes de publicacion y el num de pag. Agregar , eliminar y consultar de ambas. 
import Controladores.ContManual;
import Controladores.ContRevista;
import java.util.*;

public class ActividadPropuesta156 {

    public static void main(String[] args) {

        ContManual manual = new ContManual();
        ContRevista revis = new ContRevista();
        Scanner sc = new Scanner(System.in);
        int eleccion;
        int mes;

        System.out.println("BIENVENIDOS A TU BIBLIOTECA");
        System.out.println("------------------------------");

        do {
            System.out.println("\nPara agregar Manual (Pulsa 1)");
            System.out.println("Para agregar Revista (Pulsa 2)");
            System.out.println("Para eliminar Manual (Pulsa 3)");
            System.out.println("Para eliminar Revista (Pulsa 4)");
            System.out.println("Para ver los Manuales (Pulsa 5)");
            System.out.println("Para ver las Revistas (Pulsa 6)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:

                    System.out.println("\nIntroduce su Titulo : ");
                    sc.nextLine();
                    String titu = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Precio : ");
                    Double precio = sc.nextDouble();
                    Manual m = new Manual(titu, precio);
                    manual.create(m);
                    break;

                case 2:

                    System.out.println("\nIntroduce su Titulo : ");
                    sc.nextLine();
                    titu = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Precio : ");
                    precio = sc.nextDouble();
                    System.out.println("\nIntroduce su mes de Publicacion (1-12) : ");
                    do {
                        mes = sc.nextInt();

                    } while (mes < 1 || mes > 12);
                    System.out.println("\nIntroduce su cantidad de Paginas : ");
                    int pag = sc.nextInt();
                    Revista r = new Revista(titu, precio, mes, pag);
                    revis.create(r);
                    break;

                case 3:

                    if (manual.cantidad() == 0) {

                        System.out.println("\nAun no hay Manuales");
                    } else {

                        System.out.println("\nMANUALES : ");
                        System.out.println("---------------------");
                        List<Manual> lista = manual.todos();
                        for (Manual a : lista) {

                            System.out.println(a);
                        }

                        System.out.println("\nIntroduce el ID del Manual que deseas Borrar : ");
                        int id = sc.nextInt();
                        manual.delete(id);

                    }

                    break;

                case 4:

                    if (revis.cantidad() == 0) {

                        System.out.println("\nAun no hay Revistas.");

                    } else {

                        List<Revista> lista = revis.todos();
                        System.out.println("\nREVISTAS : ");
                        System.out.println("---------------------");
                        for (Revista a : lista) {
                            System.out.println(a);
                        }

                        System.out.println("\nIntroduce el ID de la Revista que deseas Borrar : ");
                        int id = sc.nextInt();
                        revis.delete(id);

                    }

                    break;

                case 5:

                    if (manual.cantidad() == 0) {

                        System.out.println("\nAun no hay Manuales");
                    } else {

                        System.out.println("\nMANUALES : ");
                        System.out.println("---------------------");
                        List<Manual> lista = manual.todos();
                        for (Manual a : lista) {

                            System.out.println(a);
                        }
                    }

                    break;

                case 6:

                    if (revis.cantidad() == 0) {

                        System.out.println("\nAun no hay Revistas.");

                    } else {

                        List<Revista> lista = revis.todos();
                        System.out.println("\nREVISTAS : ");
                        System.out.println("---------------------");
                        for (Revista a : lista) {
                            System.out.println(a);
                        }

                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 7);

        System.out.println("\nVUELVA OTRO DIA :)");

    }

}
