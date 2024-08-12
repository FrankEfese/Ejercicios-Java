package actividad.resuelta.pkg8.pkg1;

//Diseñar la clase Hora que representa un instante de tiempo compuesto por la hora (de 0 a 23) y
//los minutos. 
//-Hora(hora,minutos) que construye un objeto . 
//-void inc() que incrementa la hora en un minuto. 
//-boolean setMinutos(valor) cambia el valor de los minutos si es posible.
//-boolean setHora (valor). 
//-String toString(). 
import java.util.*;

public class ActividadResuelta81 {

    public static void main(String[] args) {

        Hora h = new Hora(23, 55);
        h.incrementa();
        h.incrementa();
        h.incrementa();
        h.incrementa();
        h.incrementa();
        h.setHora(15);
        h.setMinutos(44);
        System.out.println(h.toString());
    }

}
