package actividad.resuelta.pkg15.pkg3;

//Se quiere almacenar la informacion de todos los avistamientos de estrellas fugaces que ocurren en un observatorio . 
//De cada avistamiento (duracion en segundos , la intensidad del 1 al 10 , y saber si la luz era de color verdoso). 
//Como no disponemos de nada que identifique a la estrella , el JPA es el encargado de asignarle un id. 
import javax.persistence.*;
import java.util.*;

public class ActividadResuelta153 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la duracion : ");
        int dur = sc.nextInt();
        System.out.println("Introduce la intensidad (del 1 al 10) : ");
        int intensidad;
        do {
            intensidad = sc.nextInt();

        } while (intensidad > 10 || intensidad < 0);

        System.out.println("Introduce si emitia una luz verdosa (true / false) : ");
        boolean verde = sc.nextBoolean();

        Estrellas_AR153 estrella = new Estrellas_AR153(dur, intensidad, verde);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.3PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(estrella);
        tx.commit();

        em.close();
        emf.close();

    }

}
