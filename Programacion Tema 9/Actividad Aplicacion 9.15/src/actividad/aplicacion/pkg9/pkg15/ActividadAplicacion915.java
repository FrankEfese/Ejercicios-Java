package actividad.aplicacion.pkg9.pkg15;

//Implementar la clase Supercola que tiene como atributos dos colas para enteros en las 
//que se encola y desencola por separado . Sin embargo si una de las colas queda vacia al llamar
//al metodo desencolar , se desencola de la otra mientras tenga elementos. 
import java.util.*;

public class ActividadAplicacion915 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cola c = new Cola();
        Cola c2 = new Cola();

        SuperCola s = new SuperCola(c, c2);
        int eleccion;
        Integer n;
        do {
            System.out.println("\nPara encolar Cola 1 (Pulsa 1)");
            System.out.println("Para encolar Cola 2 (Pulsa 2)");
            System.out.println("Para desencolar Cola 1 (Pulsa 3)");
            System.out.println("Para desencolar Cola 2 (Pulsa 4)");
            System.out.println("Para Salir (Pulsa otro Numero)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce un numero : ");
                    n = sc.nextInt();
                    s.c.insertarFinal(n);
                    System.out.println("\nCola 1 : ");
                    s.c.mostrarLista();
                    System.out.println("\nCola 2 : ");
                    s.l.mostrarLista();
                    break;

                case 2:
                    System.out.println("\nIntroduce un numero : ");
                    n = sc.nextInt();
                    s.l.insertarFinal(n);
                    System.out.println("\nCola 1 : ");
                    s.c.mostrarLista();
                    System.out.println("\nCola 2 : ");
                    s.l.mostrarLista();
                    break;

                case 3:
                    if (s.c.numElementosLista() > 0) {
                        s.c.eliminar();
                        System.out.println("\nCola 1 : ");
                        s.c.mostrarLista();
                        System.out.println("\nCola 2 : ");
                        s.l.mostrarLista();

                    } else {

                        if (s.l.numElementosLista() > 0) {
                            s.l.eliminar();
                            System.out.println("\nCola 1 : ");
                            s.c.mostrarLista();
                            System.out.println("\nCola 2 : ");
                            s.l.mostrarLista();

                        } else {
                            System.out.println("\nEstan Vacias.");
                        }

                    }

                    break;

                case 4:

                    if (s.l.numElementosLista() > 0) {
                        s.l.eliminar();
                        System.out.println("\nCola 1 : ");
                        s.c.mostrarLista();
                        System.out.println("\nCola 2 : ");
                        s.l.mostrarLista();

                    } else {

                        if (s.c.numElementosLista() > 0) {
                            s.c.eliminar();
                            System.out.println("\nCola 1 : ");
                            s.c.mostrarLista();
                            System.out.println("\nCola 2 : ");
                            s.l.mostrarLista();

                        } else {
                            System.out.println("\nEstan Vacias.");
                        }

                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 5);

    }

}
