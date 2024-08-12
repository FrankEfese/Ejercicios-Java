package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.propuesta.pkg15.pkg6.Manual;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ContManual {

    ManualJpaController m = new ManualJpaController();

    public void create(Manual a) {

        try {
            m.create(a);
            System.out.println("\nAGREGADO");
        } catch (Exception ex) {
            Logger.getLogger(ContManual.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(int id) {

        try {
            m.destroy(id);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {

            System.out.println("\nNo hay ningun Manual con ese ID");
        }

    }

    public List<Manual> todos() {

        return m.findManualEntities();

    }

    public int cantidad() {
        return m.getManualCount();
    }



}
