package actividad.aplicacion.pkg6.pkg19;

//Implementa un sencillo editor de texto que una vez que se ha introducido el texto
//permita reemplazar todas las ocurrencias de una palabra por otra . 
import java.util.*;

public class ActividadAplicacion619 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intorduce una frase : ");
        String frase = sc.nextLine().toUpperCase();
        System.out.println("Introduce la palabras que deseas cambiar : ");
        String palabra = sc.nextLine().toUpperCase();
        System.out.println("Introduce la palabra que deseas implementar : ");
        String cambio = sc.nextLine().toUpperCase();
        frase = frase.replace(palabra, cambio);
        System.out.println(frase);

    }

}
