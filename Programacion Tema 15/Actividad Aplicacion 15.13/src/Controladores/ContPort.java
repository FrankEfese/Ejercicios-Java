package Controladores;

import actividad.aplicacion.pkg15.pkg13.Portatil;
import java.util.List;

public class ContPort {

    PortatilJpaController p = new PortatilJpaController();

    public void crear(Portatil x) {

        try {

            p.create(x);
            System.out.println("\nAGREGADO");

        } catch (Exception e) {
            System.out.println("\nHUBO UN ERROR");
        }

    }

    public int cantidad() {
        return p.getPortatilCount();
    }

    public Portatil uno(int id) {
        return p.findPortatil(id);
    }

    public List<Portatil> todos() {
        return p.findPortatilEntities();
    }

    public int sinAsignar() {

        List<Portatil> lista = todos();

        int cont = 0;

        for (Portatil l : lista) {
            if (l.getAlumno() == null) {
                cont++;
            }
        }

        return cont;
    }

    public Portatil asignar() {

        Portatil aux = null;
        List<Portatil> lista = todos();
        for (Portatil l : lista) {
            if (l.getAlumno() == null) {
                aux = l;
            }
        }

        return aux;

    }

}
