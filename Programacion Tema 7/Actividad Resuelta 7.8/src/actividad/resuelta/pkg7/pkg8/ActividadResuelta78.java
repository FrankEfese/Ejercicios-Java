package actividad.resuelta.pkg7.pkg8;

//Definir una clase que permita controlar un sintonizador digital de emisoras FM , 
//que permita subir y bajar en saltos de 0.5 Mhz y mostrar la frecuencia en ese momento. 
//El rango de frecuencia es 80 y 108 , y en el cosntructor la ponga o por defecto 80. 
//Si en una subida o bajada se sobrepasa el rango se pondra en el extremo contrario. 
import java.util.*;

public class ActividadResuelta78 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Si queremos agregar la señal desde el principio
        /*double f = 0;
        while (f < 80 || f > 108) {
            System.out.println("Introduce la frecuencia : ");

            f = sc.nextDouble();
        }
         */
        
        
        //Asi se pone por defecto en 80 la señal. 
        Sintonizador radio = new Sintonizador();

        int eleccion;
        do {
            System.out.println("PARA SUBIR (PULSA 1)");
            System.out.println("PARA BAJAR (PULSA 2)");
            System.out.println("PARA VER LA SEÑAL (PULSA 3)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    radio.subida();
                    break;

                case 2:
                    radio.bajada();
                    break;

                case 3:
                    radio.señalRadio();
                    break;

            }

        } while (eleccion > 0 && eleccion < 4);

    }

}
