package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.propuesta.pkg15.pkg6.Revista;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContRevista {

    RevistaJpaController conR = new RevistaJpaController();

    public void create(Revista a) {

        try {
            conR.create(a);
            System.out.println("\nAGREGADO");
        } catch (Exception ex) {
            Logger.getLogger(ContRevista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(int id) {

        try {
            conR.destroy(id);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {

            System.out.println("\nNo hay ninguna Revista con ese ID");

        }

    }

    public List<Revista> todos() {

        return conR.findRevistaEntities();
    }

    public int cantidad() {
        return conR.getRevistaCount();
    }

}
