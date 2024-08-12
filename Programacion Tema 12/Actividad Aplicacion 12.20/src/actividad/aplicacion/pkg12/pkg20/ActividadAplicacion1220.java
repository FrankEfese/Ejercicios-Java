package actividad.aplicacion.pkg12.pkg20;

//Utilizando listas , implementa la clase Supercola , que tiene como atributos dos colas , en las 
//que se encola y desencola. Si una se queda vacia se desencola de la otra . 
import java.util.*;

public class ActividadAplicacion1220 {

    public static void main(String[] args) {

        Supercola superC = new Supercola(new Cola(new ArrayList<Integer>()), new Cola(new ArrayList<Integer>()));
        Scanner sc = new Scanner(System.in);

        int eleccion;

        do {
            System.out.println("\nEncolar Cola 1 (Pulsa 1)");
            System.out.println("Encolar Cola 2 (Pulsa 2)");
            System.out.println("Desencolar Cola 1 (Pulsa 3)");
            System.out.println("Desencolar Cola 2 (Pulsa 4)");
            System.out.println("Salir (Pulsa otro Numero)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce el Numero : ");
                    Integer n = sc.nextInt();
                    superC.c.encolar(n);
                    System.out.println("\nEstado de Ambas Colas : ");
                    System.out.println("------------------");
                    System.out.println("Cola 1 : ");
                    System.out.println(superC.c.toString());
                    System.out.println("\nCola 2 :");
                    System.out.println(superC.d.toString());
                    break;

                case 2:
                    System.out.println("\nIntroduce el Numero : ");
                    n = sc.nextInt();
                    superC.d.encolar(n);
                    System.out.println("\nEstado de Ambas Colas : ");
                    System.out.println("------------------");
                    System.out.println("Cola 1 : ");
                    System.out.println(superC.c.toString());
                    System.out.println("\nCola 2 :");
                    System.out.println(superC.d.toString());
                    break;

                case 3:
                    if (!superC.c.lista.isEmpty()) {
                        n = superC.c.desencolar();
                        System.out.println("\nNumero desencolado : " + n);
                        System.out.println("\nEstado de Ambas Colas : ");
                        System.out.println("------------------");
                        System.out.println("Cola 1 : ");
                        System.out.println(superC.c.toString());
                        System.out.println("\nCola 2 :");
                        System.out.println(superC.d.toString());
                    } else {

                        n = superC.d.desencolar();
                        System.out.println("\nNumero desencolado : " + n);
                        System.out.println("\nEstado de Ambas Colas : ");
                        System.out.println("------------------");
                        System.out.println("Cola 1 : ");
                        System.out.println(superC.c.toString());
                        System.out.println("\nCola 2 :");
                        System.out.println(superC.d.toString());

                    }

                    break;

                case 4:
                    if (!superC.d.lista.isEmpty()) {
                        n = superC.d.desencolar();
                        System.out.println("\nNumero desencolado : " + n);
                        System.out.println("\nEstado de Ambas Colas : ");
                        System.out.println("------------------");
                        System.out.println("Cola 1 : ");
                        System.out.println(superC.c.toString());
                        System.out.println("\nCola 2 :");
                        System.out.println(superC.d.toString());
                    } else {

                        n = superC.c.desencolar();
                        System.out.println("\nNumero desencolado : " + n);
                        System.out.println("\nEstado de Ambas Colas : ");
                        System.out.println("------------------");
                        System.out.println("Cola 1 : ");
                        System.out.println(superC.c.toString());
                        System.out.println("\nCola 2 :");
                        System.out.println(superC.d.toString());

                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 5);
    }

}
