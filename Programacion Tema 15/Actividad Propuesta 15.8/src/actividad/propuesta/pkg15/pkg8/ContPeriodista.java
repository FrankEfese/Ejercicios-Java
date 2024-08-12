package actividad.propuesta.pkg15.pkg8;

import Control.PeriodistaJpaController;
import Control.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContPeriodista {

    PeriodistaJpaController p = new PeriodistaJpaController();

    public int cant() {

        return p.getPeriodistaCount();

    }

    public void crear(Periodista x) {

        try {
            p.create(x);
            System.out.println("\nAGREGADO");
        } catch (Exception e) {
            System.out.println("\nERROR");
        }

    }

    public void delete(String x) {
        try {
            p.destroy(x);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {

            System.out.println("\nHUBO UN ERROR");
        }
    }

    public void agregarArt(Periodista a, Articulo c) {

        List<Articulo> lista = a.getArticulos();
        lista.add(c);
        a.setArticulos(lista);
        System.out.println("\nAGREGADO");

    }

    public Periodista unPerio(String dni) {
        return p.findPeriodista(dni);
    }

}
