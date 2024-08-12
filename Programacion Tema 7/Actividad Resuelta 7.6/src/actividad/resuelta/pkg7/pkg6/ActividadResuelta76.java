package actividad.resuelta.pkg7.pkg6;

//Escribir un programa que lea por teclado una hora cualquiera y un numero n que representa
//una cantidad en segundos. El programa mostrara la hora introducida y las n siguientes , que se diferencian
//en un  segundo. Para ello hemos de diseñar previamente la clase Hora que dispone de los atributos 
//hora , minuto y segundo. Se controlaran mediante get/set. 
import java.util.*;

public class ActividadResuelta76 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();

        System.out.println("Hora : ");
        int v = sc.nextInt();
        h.setHora(v);
        System.out.println("Minuto : ");
        v = sc.nextInt();
        h.setMinuto(v);
        System.out.println("Segundos : ");
        v = sc.nextInt();
        h.setSegundo(v);
        System.out.println("Cuantos segundos quieres aumentar : ");
        v = sc.nextInt();

        for (int x = 0; x < v; x++) {
            System.out.println("Hora : " + h.getHora() + " Minutos : " + h.getMinuto() + " Segundos : " + h.getSegundo());
            h.incremento();
        }
    }

}
