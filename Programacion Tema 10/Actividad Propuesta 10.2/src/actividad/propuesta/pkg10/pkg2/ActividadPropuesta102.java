package actividad.propuesta.pkg10.pkg2;

//Pide por teclado el nombre , la edad y la estatura en metros de un deportista. 
//Introduce los datos en una sola linea y leelos con un objeto Scanner. 
import java.util.*;

public class ActividadPropuesta102 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre , la edad y la estatura : ");
        String nombre = sc.nextLine();
        Scanner s = new Scanner(nombre);
        System.out.println(s);

    }

}
