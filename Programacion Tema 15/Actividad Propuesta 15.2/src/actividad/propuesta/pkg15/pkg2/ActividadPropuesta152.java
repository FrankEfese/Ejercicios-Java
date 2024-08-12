package actividad.propuesta.pkg15.pkg2;

//Escribe una aplicacion que pida por teclado los datos de un coche(matricula , marca , modelo y num de plazas)
//y los almacene en la base de datos. 
import java.util.*;
import javax.persistence.*;

public class ActividadPropuesta152 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la Matricula : ");
        String mat = sc.nextLine().toUpperCase();
        System.out.println("Introduce la Marca : ");
        String marca = sc.nextLine().toUpperCase();
        System.out.println("Introduce el Modelo : ");
        String mod = sc.nextLine().toUpperCase();
        System.out.println("Introduce el numero de Plazas : ");
        int numP = sc.nextInt();

        CocheAct_Pro_15_2 coche = new CocheAct_Pro_15_2(mat, marca, mod, numP);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Propuesta_15.2PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(coche);
        tx.commit();
    }

}
