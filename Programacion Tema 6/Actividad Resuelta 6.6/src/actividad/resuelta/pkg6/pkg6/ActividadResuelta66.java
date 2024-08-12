package actividad.resuelta.pkg6.pkg6;

//Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales . 
import java.util.*;

public class ActividadResuelta66 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre : ");
        String nombre = sc.nextLine();
        String p = nombre.toLowerCase();
        String sinVocales = "";

        int cont = 0;

        char tablaVocales[] = {'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};

        for (int x = 0; x < nombre.length(); x++) {
            for (int j = 0; j < tablaVocales.length; j++) {

                if (p.charAt(x) == tablaVocales[j]) {
                    cont++;
                }
            }

            if (cont == 0) {
                sinVocales += nombre.charAt(x);
            }
            cont = 0;
        }

        System.out.println("El nombre sin vocales : " + sinVocales);
    }

}
