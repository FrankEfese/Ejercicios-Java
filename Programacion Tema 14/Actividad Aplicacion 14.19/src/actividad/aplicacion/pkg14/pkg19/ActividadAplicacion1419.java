package actividad.aplicacion.pkg14.pkg19;

//Cambiar a todos los empelados de una oficina a otra oficina. 
import java.util.Scanner;

public class ActividadAplicacion1419 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Introduce la Oficina : ");
            int ofi = sc.nextInt();
            System.out.println("Introduce la otra Oficina : ");
            int ofi2 = sc.nextInt();

            EmpleadoDAO.cambiarOficina(ofi, ofi2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
