package actividad.resuelta.pkg7.pkg2;

//En la clase CuentaCorriente sobrecargar los constructores para poder crear objetos. 
//-Con el DNI y un saldo inicial. 
//-Con el DNI , nombre y saldo inicial. 
import java.util.*;

public class ActividadResuelta72 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CuentaCorriente cliente = new CuentaCorriente("234345A", 200); // PRIMER CONSTRUCTOR
        CuentaCorriente cliente = new CuentaCorriente("45675632Z", "Perico", 500); // SEGUNDO CONSTRUCTOR CONSTRUCTOR

        System.out.println("\nQUE DESEAS HACER ??");
        System.out.println("-----------------");
        int eleccion;
        int dinero;
        do {
            System.out.println("\nSACAR DINERO (PULSA 1)");
            System.out.println("INGRESAR DINERO (PULSA 2)");
            System.out.println("MOSTRAR INFORMACION (PULSA 3)");
            System.out.println("PARA SALIR (PULSA OTRO NUMERO)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:

                    System.out.println("\nCuanto quieres sacar : ");
                    dinero = sc.nextInt();
                    System.out.println("Operacion Realizada : " + cliente.sacarDinero(dinero));
                    break;

                case 2:
                    System.out.println("\nCuanto quieres Ingresar : ");
                    dinero = sc.nextInt();
                    cliente.ingresarDinero(dinero);
                    break;

                case 3:
                    System.out.println("\nAQUI TIENES TU INFORMACION : ");
                    System.out.println("-------------------");
                    System.out.println(cliente.toString());

            }

        } while (eleccion > 0 && eleccion < 4);

        System.out.println("ADIOSSS");
    }
}
