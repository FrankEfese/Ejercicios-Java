package actividad.propuesta.pkg15.pkg7;

import Controladores.DueñoJpaController;
import Controladores.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorDueño {

    DueñoJpaController d = new DueñoJpaController();

    public void crear(Dueño a) {

        d.create(a);
        System.out.println("\nAGREGADO");

    }

    public void delete(String a) {

        try {
            d.destroy(a);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {

            System.out.println("\nHubo algun ERROR");
        }
    }

    public Dueño buscarDueño(String a) {
        return d.findDueño(a);

    }

    public int cantidad() {

        return d.getDueñoCount();
    }

    public ArrayList<Dueño> todos() {

        List<Dueño> lista = d.findDueñoEntities();
        ArrayList<Dueño> aux = new ArrayList<>(lista);
        return aux;
    }

    public void editar(Dueño a) {

        try {
            d.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladorDueño.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
