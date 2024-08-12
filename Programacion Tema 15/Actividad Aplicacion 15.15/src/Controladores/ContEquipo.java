package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.aplicacion.pkg15.pkg15.Equipo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContEquipo {

    EquipoJpaController e = new EquipoJpaController();

    public void crear(Equipo x) {

        try {

            e.create(x);
            System.out.println("\nAGREGADO");

        } catch (Exception v) {
            System.out.println("\nHUBO UN ERROR");

        }

    }

    public void eliminar(int id) {

        try {
            e.destroy(id);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {

            System.out.println("\nHUBO UN ERROR");
        }
    }

    public Equipo uno(int id) {
        return e.findEquipo(id);

    }

    public List<Equipo> todos() {

        return e.findEquipoEntities();
    }

    public int cantidad() {
        return e.getEquipoCount();
    }

    public int disponible() {
        List<Equipo> lista = todos();
        int cont = 0;

        for (Equipo z : lista) {
            if (z.getJugadores().size() < 5) {
                cont++;
            }
        }

        return cont;
    }

}
