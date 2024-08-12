package actividad.resuelta.pkg3.pkg14;

//Diseñar una aplicacion que muestre las tablas de multiplicar del 1 al 10 . 
public class ActividadResuelta314 {

    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            System.out.println("\nLa Tabla del : " + x);
            for (int j = 1; j <= 10; j++) {

                System.out.println(x + " * " + j + " = " + x * j);
            }
        }

    }

}
