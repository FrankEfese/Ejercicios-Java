package Controladores;

import actividad.aplicacion.pkg15.pkg12.Taxi;
import actividad.aplicacion.pkg15.pkg12.Taxista;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContTaxista {

    TaxistaJpaController t = new TaxistaJpaController();

    public void crear(Taxista x) {

        try {

            t.create(x);
            System.out.println("\nAGREGADO");

        } catch (Exception e) {
            System.out.println("\nHUBO UN ERROR");
        }

    }

    public void agregarTaxi(Taxista x, Taxi a) {

        if (a.getTaxista() == null && x.getTaxi() == null) {
            x.setTaxi(a);
            try {
                t.edit(x);
                System.out.println("\nASIGNADO");
            } catch (Exception ex) {

                System.out.println("\nHUBO UN ERROR ERROR");
            }

        } else {
            System.out.println("\nYA TIENE UN TAXI ASIGNADO");
        }

    }

    public void quitarTaxi(Taxista a) {
        a.setTaxi(null);
        try {
            t.edit(a);
             System.out.println("\nMODIFICADO");
        } catch (Exception ex) {
      
            System.out.println("\nHUBO UN ERROR");
        }
        
    }

    public int cantidad() {
        return t.getTaxistaCount();
    }

    public List<Taxista> todos() {
        return t.findTaxistaEntities();

    }

    public Taxista uno(String dni) {

        return t.findTaxista(dni);

    }

    public int noasignados() {

        List<Taxista> lista = todos();
        int cant = 0;
        for (Taxista a : lista) {
            if (a.getTaxi() == null) {
                cant++;
            }
        }
        return cant;
    }

    public int asignados() {

        List<Taxista> lista = todos();
        int cant = 0;
        for (Taxista a : lista) {
            if (a.getTaxi() != null) {
                cant++;
            }
        }
        return cant;
    }

}
