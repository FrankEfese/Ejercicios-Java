package actividad.resuelta.pkg6.pkg3;

//Diseñar el juego Acierta la Contraseña . La mecanica del juego es la siguiente : el primer jugador
//introduce la contraseña ; a continuacion el segundo jugador debe teclear palabras hasta que acierte. 
//Realizar dos versiones : la primera si la palabra introducida es mayor o menor. En la segunda 
//el programa mostrara la longitud de la contraseña y una cadena con los caracteres acertados y * en los que no. 
import java.util.*;

public class ActividadResuelta63 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la contraseña a adivinar : ");
        String cont = sc.nextLine();
        char tabla[] = cont.toCharArray();
        int c;
        String prueba;

        //Primera Version 
        
        /*   do {
        System.out.println("\nAdivina la contraseña : ");
       
            prueba = sc.nextLine();

            if (prueba.compareTo(cont) > 0) {
                System.out.println("MAYOR");
                System.out.println("VUELVE A INTENTARLO");
            } else {
                if (prueba.compareTo(cont) < 0) {
                    System.out.println("MENOR");
                    System.out.println("VUELVE A INTENTARLO");
                } else {
                    System.out.println("CORRECTO");
                }
            }

        } while (!cont.equals(prueba));  */
        
        
        //Segunda Version
        
        char intento[] = new char[tabla.length];
        for (int x = 0; x < intento.length; x++) {
            intento[x] = '*';
        }

        do {

            c = 0;

            System.out.println("\nLa longitud es : " + intento.length);
            System.out.println(Arrays.toString(intento));
            System.out.println("\nAdivina la contraseña : ");
            prueba = sc.nextLine();

            char p[] = prueba.toCharArray();

            if (p.length < intento.length) {
                System.out.println("\nTE HAS QUEDADO CORTO");
            } else {
                if (p.length > intento.length) {
                    System.out.println("\nTE HAS PASADO");
                } else {

                    for (int x = 0; x < intento.length; x++) {

                        if (p[x] == tabla[x]) {
                            intento[x] = p[x];
                            c++;
                        }

                    }

                    if (c == tabla.length) {
                        System.out.println("\nCORRECTO");
                        System.out.println(Arrays.toString(intento));
                    } else {
                        System.out.println(Arrays.toString(intento));
                        System.out.println("\nVUELVELO A INTENTAR");
                    }

                }
            }

        } while (c != tabla.length);
    }

}
