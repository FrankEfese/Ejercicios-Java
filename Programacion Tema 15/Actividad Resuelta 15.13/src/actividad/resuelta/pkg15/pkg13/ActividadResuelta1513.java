package actividad.resuelta.pkg15.pkg13;

//Es necesario saber cuantos empleados trabajan como programador , comercial y becario. 
import javax.persistence.*;

public class ActividadResuelta1513 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.13PU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("empleados.prog");
        Object contProg = q.getSingleResult();
        System.out.println("Programadores : " + contProg);
        q = em.createNamedQuery("empleados.com");
        Object contCom = q.getSingleResult();
        System.out.println("Comerciales : " + contCom);
        q = em.createNamedQuery("empleados.bec");
        Object contBec = q.getSingleResult();
        System.out.println("Becarios : " + contBec);
    }

}
