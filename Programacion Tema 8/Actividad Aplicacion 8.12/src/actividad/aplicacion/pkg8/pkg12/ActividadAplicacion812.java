package actividad.aplicacion.pkg8.pkg12;

//Implementa la clase Caja : 
//-Caja (int ancho , int alto , int fondo , Unidad uni). 
//-double getVolumen. 
//-void setEtiqueta (String eti) que modifica la etiqueta. 
//-String toString(). 
import actividad.aplicacion.pkg8.pkg12.Caja.Unidad;
import java.util.*;

public class ActividadAplicacion812 {

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
        Unidad u = Unidad.CM;
        do {
            System.out.println("\nLA MEDIDIA EN METROS (PULSA 1)");
            System.out.println("LA MEDIDA EN CM (PULSA 2)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1 ->
                    u = Unidad.M;
                case 2 ->
                    u = Unidad.CM;

            }

        } while (eleccion < 1 && eleccion > 2);

        Caja caja = new Caja(a, l, f, g, u);

        do {
            System.out.println("\nPARA VER EL VOLUMEN (PULSA 1)");
            System.out.println("PARA CAMBIAR EL CONTENIDO DE LA ETIQUETA (PULSA 2)");
            System.out.println("PARA VER INFORMACION DE LA CAJA (PULSA 3)");
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

            }

        } while (eleccion > 0 && eleccion < 4);

    }
}
