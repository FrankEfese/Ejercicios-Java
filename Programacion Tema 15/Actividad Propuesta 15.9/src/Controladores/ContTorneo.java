package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.propuesta.pkg15.pkg9.Torneo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContTorneo {

    TorneoJpaController t = new TorneoJpaController();

    public void crear(Torneo a) {

        try {
            t.create(a);
            System.out.println("\nAGREGADO");
        } catch (Exception e) {
            System.out.println("\nHubo un ERROR");
        }

    }

    public void eliminar(int id) {

        try {
            t.destroy(id);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {
            System.out.println("\nHubo un ERROR");

        }
    }
    
    public int cantidad(){
        return t.getTorneoCount();
    }
    
    public List<Torneo> todos(){
        return t.findTorneoEntities();
    }

}
