package Controladores;

import actividad.aplicacion.pkg15.pkg12.Taxi;
import java.util.List;

public class ContTaxi {

    TaxiJpaController t = new TaxiJpaController();

    public void crear(Taxi x) {

        try {
            t.create(x);
            System.out.println("\nAGREGADO");

        } catch (Exception e) {
            System.out.println("\nHUBO UN ERROR");
        }

    }

    public int cantidad() {
        return t.getTaxiCount();
    }

    public List<Taxi> todos() {
        return t.findTaxiEntities();
    }

    public Taxi uno(String mat) {
        return t.findTaxi(mat);
    }

    public int noasignados() {

        List<Taxi> lista = todos();
        int cant = 0;
        for (Taxi a : lista) {
            if (a.getTaxista() == null) {
                cant++;
            }
        }
        return cant;
    }
    
      public int asignados() {

        List<Taxi> lista = todos();
        int cant = 0;
        for (Taxi a : lista) {
            if (a.getTaxista() != null) {
                cant++;
            }
        }
        return cant;
    }

}
