package Controladores;

import actividad.aplicacion.pkg15.pkg15.Equipo;
import actividad.aplicacion.pkg15.pkg15.Jugador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContJugador {

    JugadorJpaController j = new JugadorJpaController();

    public void crear(Jugador a) {

        try {

            j.create(a);
            System.out.println("\nAGREGADO");

        } catch (Exception e) {

            System.out.println("\nHUBO UN ERROR");
        }

    }

    public List<Jugador> todos() {

        return j.findJugadorEntities();
    }

    public int cantidad() {
        return j.getJugadorCount();
    }

    public void asignarEquipo(Equipo e, Jugador a) {

        if (e.getJugadores().size() < 5) {

            try {
                a.setEquipo(e);
                j.edit(a);
                System.out.println("\nASIGNADO");
            } catch (Exception ex) {

                System.out.println("\nHUBO UN ERROR");
            }

        } else {
            System.out.println("\nO YA TIENE EQUIPO O EL EQUIPO NO TIENE PLAZAS");
        }

    }

    public Jugador uno(int id) {
        return j.findJugador(id);
    }

    public int disponibles() {

        List<Jugador> lista = todos();
        int cont = 0;

        for (Jugador x : lista) {
            if (x.getEquipo() == null) {
                cont++;
            }

        }

        return cont;
    }

}
