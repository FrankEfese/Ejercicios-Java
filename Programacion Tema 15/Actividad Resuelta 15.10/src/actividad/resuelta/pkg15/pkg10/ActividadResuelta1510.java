package actividad.resuelta.pkg15.pkg10;

//Asignar a todos los empleados que trabajan de comercial un sueldo de 1500. 
import javax.persistence.*;

public class ActividadResuelta1510 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.10PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Query q = em.createQuery("UPDATE  empleados e SET e.sueldo = 1500 WHERE e.puesto = 'Comercial'");
        tx.begin();
        q.executeUpdate();
        tx.commit();

    }

}
