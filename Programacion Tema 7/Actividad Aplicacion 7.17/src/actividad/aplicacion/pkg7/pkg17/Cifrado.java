package actividad.aplicacion.pkg7.pkg17;

import java.util.Arrays;

public class Cifrado {

    public static String cifrar(String n) {

        char[] minus = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char mayus[]
                = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
                };

        char tabla[] = n.toCharArray();
        int pos = 0;
        for (int x = 0; x < tabla.length; x++) {

            if (Character.isLowerCase(tabla[x])) {

                for (int j = 0; j < minus.length; j++) {

                    if (tabla[x] == minus[j]) {

                        if (j + 3 >= minus.length) {
                            int indice = (j + 3) - minus.length;
                            tabla[x] = minus[indice];
                        } else {

                            tabla[x] = minus[j + 3];
                        }

                        break;
                    }

                }

            } else {
                if (Character.isUpperCase(tabla[x])) {

                    for (int j = 0; j < mayus.length; j++) {

                        if (tabla[x] == mayus[j]) {

                            if (j + 3 >= mayus.length) {
                                int indice = (j + 3) - mayus.length;
                                tabla[x] = mayus[indice];
                            } else {

                                tabla[x] = mayus[j + 3];
                            }

                            break;
                        }

                    }
                }

            }
        }

        String aux = "";

        for (char c : tabla) {
            aux += c;
        }

        return aux;
    }
}
