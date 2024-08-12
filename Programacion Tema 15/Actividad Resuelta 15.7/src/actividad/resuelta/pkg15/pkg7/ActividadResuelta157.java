package actividad.resuelta.pkg15.pkg7;

//Diseñar una app que gestione los libros (ISBN , titulo , autor y precio) de una biblioteca. 
//-Nuevo libro
//-Modificar libro (excepto el ISBN)
//-Eliminar un Libro
//-Informe libro (busca un libro por el ISBN)
//-Todos los libros
//-Numero de Libros
//SET GLOBAL time_zone = '-3:00';
import java.util.*;
import javax.persistence.*;

public class ActividadResuelta157 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControladorLibros cl = new ControladorLibros();

        int eleccion;
        String isbn;

        System.out.println("BIENVENIDO A TU BIBLIOTECA");
        System.out.println("------------------------------");

        do {

            System.out.println("\nPara agregar un Libro (Pulsa 1)");
            System.out.println("Para modificar un Libro (Pulsa 2)");
            System.out.println("Para ver un Libro (Pulsa 3)");
            System.out.println("Para eliminar un Libro (Pulsa 4)");
            System.out.println("Para ver todos los Libros (Pulsa 5)");
            System.out.println("Para ver cuantos Libros hay (Pulsa 6)");
            System.out.println("Para Salir (Pulsa otro Numero)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce su ISBN : ");
                    sc.nextLine();
                    do {
                        isbn = sc.nextLine().toUpperCase();
                    } while (isbn.isEmpty());
                    System.out.println("\nIntroduce su Titulo : ");
                    String titulo = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Autor : ");
                    String autor = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Precio : ");
                    double precio = sc.nextDouble();

                    Libro li = new Libro(isbn, titulo, autor, precio);
                    cl.create(li);
                    break;

                case 2:

                    if (cl.cantidad() == 0) {
                        System.out.println("\nAun no hay Libros.");
                    } else {

                        ArrayList<Libro> lista = cl.todos();

                        System.out.println("\nEstos son todos los Libros : ");
                        System.out.println("-------------------------");
                        for (Libro a : lista) {

                            System.out.println(a.toString());

                        }
                        System.out.println("\nIntroduce el ISBN del Libro que deseas Modificar : ");
                        sc.nextLine();
                        isbn = sc.nextLine().toUpperCase();

                        Libro aux = cl.unLibro(isbn);

                        if (aux != null) {

                            do {
                                System.out.println("\nPara cambiar el Titulo (Pulsa 1)");
                                System.out.println("Para cambiar el Autor (Pulsa 2)");
                                System.out.println("Para cambiar el Precio (Pulsa 3)");
                                System.out.println("Para Salir (Pulsa otro Numero)");
                                eleccion = sc.nextInt();

                                switch (eleccion) {

                                    case 1:
                                        System.out.println("\nIntroduce el nuevo Titulo : ");
                                        sc.nextLine();
                                        titulo = sc.nextLine().toUpperCase();
                                        aux.setTitulo(titulo);
                                        break;

                                    case 2:
                                        System.out.println("\nIntroduce el nuevo Autor : ");
                                        sc.nextLine();
                                        autor = sc.nextLine().toUpperCase();
                                        aux.setAutor(autor);
                                        break;

                                    case 3:
                                        System.out.println("\nIntroduce el nuevo Precio : ");
                                        precio = sc.nextDouble();
                                        aux.setPrecio(precio);
                                        break;

                                }

                            } while (eleccion > 0 && eleccion < 4);

                            cl.editar(aux);

                        } else {

                            System.out.println("\nNo se ha encontrado ningun Libro con ese ISBN");

                        }

                    }

                    break;

                case 3:

                    if (cl.cantidad() == 0) {

                        System.out.println("\nAun no hay Libros.");

                    } else {

                        ArrayList<Libro> lista = cl.todos();

                        System.out.println("\nEstos son los Libros : ");
                        System.out.println("-----------------------");

                        for (Libro a : lista) {

                            System.out.println("\nISBN : " + a.getIsbn() + " / Titulo : " + a.getTitulo());

                        }

                        System.out.println("\nIntroduce el ISBN del Libro que deseas ver : ");
                        sc.nextLine();
                        isbn = sc.nextLine().toUpperCase();

                        Libro unLibro = cl.unLibro(isbn);

                        if (unLibro != null) {
                            System.out.println("\nINFORMACION DEL LIBRO : ");
                            System.out.println("------------------------");
                            System.out.println(unLibro.toString());
                        } else {
                            System.out.println("\nNo hay ningun Libro con ese ISBN.");
                        }

                    }

                    break;

                case 4:

                    if (cl.cantidad() == 0) {

                        System.out.println("\nAun no hay Libros");

                    } else {

                        ArrayList<Libro> lista = cl.todos();

                        System.out.println("\nEstos son todos los Libros : ");
                        System.out.println("-------------------------");
                        for (Libro a : lista) {

                            System.out.println(a.toString());

                        }

                        System.out.println("\nIntroduce el ISBN del Libro que deseas Eliminar : ");
                        sc.nextLine();
                        isbn = sc.nextLine().toUpperCase();

                        cl.delete(isbn);

                    }

                    break;

                case 5:

                    if (cl.cantidad() == 0) {

                        System.out.println("\nAun no hay Libros.");
                    } else {

                        System.out.println("\nEstos son todos los Libros : ");
                        System.out.println("---------------------------");
                        ArrayList<Libro> lista = cl.todos();

                        for (Libro a : lista) {

                            System.out.println(a.toString());

                        }

                    }

                    break;

                case 6:

                    System.out.println("\nCANTIDAD DE LIBROS : " + cl.cantidad());
                    break;

            }

        } while (eleccion > 0 && eleccion < 7);

        System.out.println("\nADIOSS , VUELVA OTRO DIA :) ");

    }

}
