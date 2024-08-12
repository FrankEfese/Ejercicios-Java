package actividad.aplicacion.pkg8.pkg13;

//La empresa de mensajeria BiciExpress que reparte en Bici para disminuir el peso
//que transportan sus empleados solo utiliza cajas de carton. El volumen de estas se 
//calculan como el 80% del volumen real , con el fin de evitar que se deformen y se rompan. 
//Sus medidas siempre son en CM. Necesita saber cual es la superficie total de carton utilizado. 
import java.util.*;

public class ActividadAplicacion813 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el ancho : ");
        double a = sc.nextInt();
        System.out.println("\nIntroduce el alto : ");
        double l = sc.nextInt();
        System.out.println("\nIntroduce el fondo : ");
        double f = sc.nextInt();
        System.out.println("\nIntroduce el contenido de la etiqueta : ");
        sc.nextLine();
        String g = sc.nextLine();
        int eleccion;

        CajaCarton caja = new CajaCarton(a, l, f, g);

        do {
            System.out.println("\nPARA VER EL VOLUMEN (PULSA 1)");
            System.out.println("PARA CAMBIAR EL CONTENIDO DE LA ETIQUETA (PULSA 2)");
            System.out.println("PARA VER INFORMACION DE LA CAJA (PULSA 3)");
            System.out.println("PARA VER LA SUPERFICIE DE LA CAJA (PULSA 4)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    caja.getVolumen();
                    break;

                case 2:
                    System.out.println("\nIntroduce el contenido : ");
                    sc.nextLine();
                    String h = sc.nextLine();
                    System.out.println("\nCambio Realizado : " + caja.setEtiqueta(h));

                    break;

                case 3:
                    System.out.println(caja.toString());
                    break;
                case 4:
                    caja.superficie();
                    break;

            }

        } while (eleccion > 0 && eleccion < 5);
    }

}
