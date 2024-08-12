package actividad.aplicacion.pkg3.pkg16;

//Solicita al usuario un numero n y dibuja un triangulo de base y altura n, 
//de la forma (para n igual a 4). 
public class ActividadAplicacion316 {

    public static void main(String[] args) {

        int altura = 5; // Altura del triángulo

        // Imprimir el triángulo
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco antes de los asteriscos
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Cambiar de línea después de imprimir una fila
            System.out.println();

        }

    }
}
