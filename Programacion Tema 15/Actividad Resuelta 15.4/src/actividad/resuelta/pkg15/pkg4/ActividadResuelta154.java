package actividad.resuelta.pkg15.pkg4;

//Como ya disponemos de un programa que almacena los datos de un coche , diseñar una app que mediante la matricula
//recupere los datos de la BD  y los muestre por consola.
import javax.persistence.*;
import java.util.*;

public class ActividadResuelta154 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la Matricula del Coche : ");
        String mat = sc.nextLine();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.4PU");
        EntityManager em = emf.createEntityManager();

        CocheAct_Pro_15_2 coche = em.find(CocheAct_Pro_15_2.class, mat);

        if (coche == null) {
            System.out.println("No existe ningun coche con esa matricula.");
        } else {

            System.out.println(coche);

        }
        em.close();
        emf.close();

    }

}
