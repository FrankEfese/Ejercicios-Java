package actividad.resuelta.pkg6.pkg8;

//Los habitantes de javalandia tiene un idioma algo extraño , siempre empiezan con (Javalin , javalon) despues una pausa
//y despues el mensaje. Tambien puede ser que no comienzen asi pero puede acabar con (javalen , len , len) . 
//Diseñar un traductor que nos diga si la frase es idioma en javalin y si es asi enseñe el mensaje . 
import java.util.*;

public class ActividadResuelta68 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase : ");
        String frase = sc.nextLine();
        traductor(frase);

    }

    static void traductor(String frase) {

        String com = "Javalin, javalon";
        String fin = "javalen, len, len";
        String mens = "";

        boolean comJavalin = false;
        boolean finJavalin = false;

        if (frase.startsWith(com)) {
            comJavalin = true;
        }
        if (frase.endsWith(fin)) {
            finJavalin = true;
        }

        if (comJavalin && !finJavalin) {

            System.out.println("ES IDIOMA JAVALIN");
            int pos = frase.indexOf(com);
            pos += com.length();

            for (int x = pos; x < frase.length(); x++) {
                mens += frase.charAt(x);
            }

            System.out.println(mens);

        } else {
            if (finJavalin && !comJavalin) {

                System.out.println("ES IDIOMA JAVALIN");

                int pos = frase.indexOf(fin);
                for (int x = 0; x < pos; x++) {
                    mens += frase.charAt(x);
                }

                System.out.println(mens);
            } else {
                if (finJavalin && comJavalin) {

                    System.out.println("ES IDIOMA JAVALIN");
                    int pos = frase.indexOf(com);
                    pos += com.length();
                    int aux = frase.indexOf(fin);

                    for (int x = pos; x < aux; x++) {
                        mens += frase.charAt(x);
                    }

                    System.out.println(mens);

                } else {
                    System.out.println("NO ES IDIOMA JAVALIN");
                }

            }

        }
    }

}
