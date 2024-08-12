package actividad.resuelta.pkg15.pkg5;

//Continuar con los Coches y permitir modificar sus datos , excepto la matricula. 
import javax.persistence.*;
import java.util.*;

public class ActividadResuelta155 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la Matricula del coche que deseas Modificar : ");
        String mat = sc.nextLine();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.5PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        CocheAct_Pro_15_2 coche = em.find(CocheAct_Pro_15_2.class, mat);

        if (coche != null) {

            tx.begin();

            int eleccion;

            do {

                System.out.println("\nPara cambiar la Marca (Pulsa 1)");
                System.out.println("Para cambiar el Modelo (Pulsa 2)");
                System.out.println("Para cambiar el numero de Plazas (Pulsa 3)");
                System.out.println("Para salir (Pulsa otro numero)");

                eleccion = sc.nextInt();

                switch (eleccion) {

                    case 1:
                        System.out.println("\nIntroduce la nueva Marca : ");
                        sc.nextLine();
                        String marca = sc.nextLine().toUpperCase();
                        coche.setMarca(marca);
                        break;

                    case 2:
                        System.out.println("\nIntroduce el nuevo Modelo : ");
                        sc.nextLine();
                        String mod = sc.nextLine().toUpperCase();
                        coche.setModelo(mod);
                        break;

                    case 3:

                        System.out.println("Introduce la cantidad de Plazas : ");
                        int p = sc.nextInt();
                        coche.setNumPlazas(p);
                        break;

                }

            } while (eleccion > 0 && eleccion < 4);

            em.persist(coche);
            tx.commit();
            em.close();
            emf.close();

        } else {

            System.out.println("No hay ningun coche con esa Matricula");

        }

    }

}
