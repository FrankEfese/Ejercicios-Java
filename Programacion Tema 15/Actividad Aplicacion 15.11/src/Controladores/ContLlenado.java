package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.aplicacion.pkg15.pkg11.LLenadoDeposito;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContLlenado {

    LLenadoDepositoJpaController l = new LLenadoDepositoJpaController();

    public void crear(LLenadoDeposito d) {

        try {

            l.create(d);
            System.out.println("\nAGREGADO");

        } catch (Exception e) {
            System.out.println("\nHUBO UN ERROR");
        }

    }

    public void eliminar(int id) {

        try {
            l.destroy(id);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {

            System.out.println("\nHubo un ERROR");
        }
    }

    public List<LLenadoDeposito> todos() {

        return l.findLLenadoDepositoEntities();

    }

    public int cantidad() {
        return l.getLLenadoDepositoCount();
    }
    
    public void eliminarUltimo(){
        
        List<LLenadoDeposito> lista = l.findLLenadoDepositoEntities();
        LLenadoDeposito p = l.findLLenadoDeposito(lista.get(lista.size() -1).getId());
        try {
            l.destroy(p.getId());
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {
            System.out.println("\nHUBO UN ERROR");
        }
    }

}
