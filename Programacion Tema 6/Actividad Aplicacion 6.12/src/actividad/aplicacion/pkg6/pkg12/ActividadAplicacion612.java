package actividad.aplicacion.pkg6.pkg12;

//Realizar el juego del ahorcado : 
//-El jugador A teclea una palabra , sin que el B lo vea. 
//-Se mostraran -----. 
//-El jugador B intentara acertar letra a letra. 
//-Cada acierto muestra la letra en su lugar y las no acertadas seguiran con --. 
//-El B solo tiene 7 intentos. 
import java.util.*;

public class ActividadAplicacion612 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una Palabra : ");
        String palabra = sc.nextLine().toUpperCase();
        char tabla[] = palabra.toCharArray();
        ahorcado(tabla);

    }

    static void ahorcado(char t[]) {

        Scanner sc = new Scanner(System.in);
        char intento[] = new char[t.length];
        int cont = 0;
        int com = 0;
        char letra;

        for (int x = 0; x < intento.length; x++) {
            intento[x] = '-';
        }

        System.out.println("\nADIVINA LA PALABRA : ");
        while (cont < 7 && !Arrays.equals(t, intento)) {

            System.out.println(Arrays.toString(intento));

            System.out.println("Introduce una letra : ");
            letra = sc.nextLine().toUpperCase().charAt(0);

            for (int x = 0; x < intento.length; x++) {

                if (t[x] == letra) {
                    intento[x] = letra;
                    com++;
                }

            }

            if (com == 0) {
                cont++;
            }
            com = 0;

        }

        System.out.println(Arrays.toString(intento));
        if (cont < 7) {
            System.out.println("HAS GANADO");
        } else {
            System.out.println("HAS PERDIDO");
        }

    }

}
