package actividad.aplicacion.pkg9.pkg21;

import java.util.Comparator;

public class Comparador implements Comparator {
    
    @Override
    public int compare(Object o1, Object o2) {
        
        Socio a = (Socio) o1;
        Socio b = (Socio) o2;
        
        return a.fecha.compareTo(b.fecha);
    }
    
}
