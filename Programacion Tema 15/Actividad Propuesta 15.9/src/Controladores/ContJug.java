package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.propuesta.pkg15.pkg9.Ajedrezista;
import java.util.List;

public class ContJug {

    AjedrezistaJpaController a = new AjedrezistaJpaController();

    public void crear(Ajedrezista e) {

        try {
            a.create(e);
            System.out.println("\nAGREGADO");
        } catch (Exception x) {
            System.out.println("\nHubo un ERROR");
        }

    }

    public void eliminar(String id) {

        try {
            a.destroy(id);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {
            System.out.println("\nHubo un ERROR");

        }
    }

    public int cantidad() {
        return a.getAjedrezistaCount();
    }

    public List<Ajedrezista> todos() {
        return a.findAjedrezistaEntities();
    }
    
    public Ajedrezista uno(String id){
        return a.findAjedrezista(id);
    }

}
