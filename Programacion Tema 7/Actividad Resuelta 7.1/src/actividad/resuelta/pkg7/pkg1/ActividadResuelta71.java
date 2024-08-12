package actividad.resuelta.pkg7.pkg1;

//Diseñar la clase CuentaCorriente que almacena los datos : DNI y nombre del titular, asi como el saldo. 
//Las operaciones tipicas con una cuenta corriente son : 
//-Crear una Cuenta (se necesita el nombre y el dni , el saldo sera 0)
//-Sacar dinero (el metodo debe indicar si ha sido posible o no realizar la operacion)
//-Ingresar dinero. 
//-Mostrar informacion. 
import java.util.*;

public class ActividadResuelta71 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nBienvenido a tu Banco de Confianza");
        System.out.println("\nIntroduce tu nombre : ");
        String nombre = sc.nextLine();
        System.out.println("\nIntroduce tu DNI : ");
        String dni = sc.nextLine();

        CuentaCorriente cliente = new CuentaCorriente(dni, nombre);

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
