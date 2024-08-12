package actividad.resuelta.pkg15.pkg11;

//Eliminar a todos los empleados cuyo sueldo es negativo. 
import javax.persistence.*;

public class ActividadResuelta1511 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.11PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Query q = em.createQuery("DELETE FROM empleados e WHERE e.sueldo < 0");
        tx.begin();
        q.executeUpdate();
        tx.commit();

    }

}
