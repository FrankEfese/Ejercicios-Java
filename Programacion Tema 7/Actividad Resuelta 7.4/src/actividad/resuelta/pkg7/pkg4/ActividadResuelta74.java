package actividad.resuelta.pkg7.pkg4;

//Todas las cuentas corrientes pertenecen al mismo banco. Añadir un atributo que almacene
//el nombre del Banco (que es unico) en la clase CuentaCorriente. Diseñar un metodo 
//que permita recuperar y modificar el nombre del Banco . 
import java.util.*;

public class ActividadResuelta74 {

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
        String banco;
        do {
            System.out.println("\nSACAR DINERO (PULSA 1)");
            System.out.println("INGRESAR DINERO (PULSA 2)");
            System.out.println("MOSTRAR INFORMACION (PULSA 3)");
            System.out.println("VER NOMBRE DEL BANCO (PULSA 4)");
            System.out.println("CAMBIAR NOMBRE DEL BANCO (PULSA 5)");
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
                    break;

                case 4:
                    System.out.println("\nEL NOMBRE DEL BANCO ES : " + CuentaCorriente.getBanco());
                    break;

                case 5:
                    System.out.println("\nIntroduce el nuevo nombre del banco : ");
                    sc.nextLine();
                    banco = sc.nextLine();
                    CuentaCorriente.setBanco(banco);
                    System.out.println("\nCAMBIO REALIZADO");
                    break;

            }

        } while (eleccion > 0 && eleccion < 6);

        System.out.println("ADIOSSS");
    }

}
