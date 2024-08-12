package actividad.resuelta.pkg7.pkg9;

//Modelar una casa con muchas bombillas , de forma que cada bombilla se pueda encender 
//o apagar individualmente. Para ello , hacer una clase bombila con una variable privada
//que indique si esta encendida o apagada, asi como un metodo que nos diga el estado
//de una bombilla concreta. Ademas , queremos poner un interruptor general, de forma que si
//este se apaga , todas las bombillas vuelven a estar apagadas o encendidas. Cada una se apaga y 
//se enciende idividualmente , pero solo responde que esta encendida si su interruptor
//particular esta activado y ademas hay luz general. 
import java.util.*;

public class ActividadResuelta79 {

    public static void main(String[] args) {

        Bombilla b1, b2;
        b1 = new Bombilla();
        b2 = new Bombilla();
        b1.enciende();
        b2.apaga();
        System.out.println("B1" + b1.estadoInfo());
        System.out.println("B2" + b2.estadoInfo());
        Bombilla.interruptor = false;
        System.out.println("Cortamos la luz : ");
        System.out.println("B1" + b1.estadoInfo());
        System.out.println("B2" + b2.estadoInfo());
        Bombilla.interruptor = true;
        System.out.println("Damos la luz : ");
        System.out.println("B1" + b1.estadoInfo());
        System.out.println("B2" + b2.estadoInfo());
    }

}
