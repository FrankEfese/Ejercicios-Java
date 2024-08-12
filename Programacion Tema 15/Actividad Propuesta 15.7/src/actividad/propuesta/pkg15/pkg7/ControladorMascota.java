package actividad.propuesta.pkg15.pkg7;

import Controladores.MascotaJpaController;
import Controladores.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorMascota {

    MascotaJpaController m = new MascotaJpaController();

    public void crear(Mascota a) {

        m.create(a);

    }

    public void delete(int a) {

        try {
            m.destroy(a);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {

            System.out.println("\nHubo algun ERROR");
        }
    }

    public Mascota buscarMascota(int a) {
        return m.findMascota(a);

    }

    public int cantidad() {

        return m.getMascotaCount();
    }

    public ArrayList<Mascota> todos() {

        List<Mascota> lista = m.findMascotaEntities();
        ArrayList<Mascota> aux = new ArrayList<>(lista);
        return aux;
    }

    public void editar(Mascota a) {

        try {
            m.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladorDueño.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
