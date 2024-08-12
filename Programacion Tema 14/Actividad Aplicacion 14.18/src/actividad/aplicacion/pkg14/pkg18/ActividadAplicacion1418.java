package actividad.aplicacion.pkg14.pkg18;

//Repetir la actividad anterior pero comprobando si la Oficina existe. 
import java.time.LocalDate;
import java.util.Scanner;

public class ActividadAplicacion1418 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Introduce el ID : ");
            int id = sc.nextInt();
            System.out.println("Introduce el Nombre : ");
            sc.nextLine();
            String nom = sc.nextLine();
            System.out.println("Introduce la Edad : ");
            int edad = sc.nextInt();
            System.out.println("Introduce la Oficina : ");
            int ofi = sc.nextInt();
            System.out.println("Introduce su Puesto : ");
            sc.nextLine();
            String puesto = sc.nextLine();

            Empleado a = new Empleado(id, nom, edad, ofi, puesto, LocalDate.now());

            if (EmpleadoDAO.comprobarOfi(a)) {

                EmpleadoDAO.crear(a);
            } else {
                System.out.println("No existe ninguna Oficina con ese ID");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

}
