package actividad.resuelta.pkg15.pkg6;

//Para finalizar la gestion de los coches , escribir una app que permita 
//eliminar un coche por su matricula. 
import javax.persistence.*;
import java.util.*;

public class ActividadResuelta156 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la matricula del coche que deseas eliminar : ");
        String mat = sc.nextLine().toUpperCase();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.6PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        CocheAct_Pro_15_2 coche = em.find(CocheAct_Pro_15_2.class, mat);

        if (coche != null) {

            System.out.println("Coche Eliminado : " + coche);
            tx.begin();
            em.remove(coche);
            tx.commit();

        } else {
            System.out.println("No hay ningun coche con esa Matricula.");
        }

        em.close();
        emf.close();

    }

}
