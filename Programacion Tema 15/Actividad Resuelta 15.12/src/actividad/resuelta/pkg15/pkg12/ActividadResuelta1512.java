package actividad.resuelta.pkg15.pkg12;

//Mostrar todas las oficinas disponibles . Pedir al usuario que introduzca por consola el numero de 
//una oficina y mostrar la informacion de todos los empleados que trabajan en ella. 
import java.util.List;
import javax.persistence.*;
import java.util.*;

public class ActividadResuelta1512 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.12PU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT DISTINCT e.oficina FROM empleados e");
        List<Object> ofi = q.getResultList();
        for (Object of : ofi) {
            System.out.println("Oficina : " + of);
        }

        System.out.println("Introduce una Oficina : ");
        int oficina = sc.nextInt();

        q = em.createQuery("SELECT e FROM empleados e WHERE e.oficina = ?1");
        q.setParameter(1, oficina);
        List<empleados> lista = q.getResultList();
        for (empleados a : lista) {
            System.out.println(a.toString());
        }
    }

}
