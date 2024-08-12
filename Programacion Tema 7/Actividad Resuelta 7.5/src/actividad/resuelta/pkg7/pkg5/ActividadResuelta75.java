package actividad.resuelta.pkg7.pkg5;

//Existen gestores que administran las cuentas bancarias y atienden a sus propietarios. 
//Cada cuenta en caso de tenerlo , cuenta con un unico gestor. Diseñar la clase Gestor de la que
//interesa guardar su nombre , telefono y el importe maximo autorizado con el que pueden operar. 
//Existen las siguientes restricciones : 
//-Un gestor tendra siempre un nombre y un telefono .
//-Si no se asigna , el importe maximo autorizado por operacion sera de 10000 euros. 
//-Un gestor una vez asignado no podra cambiar su telefono. 
//
//Modificar CuentaCorriente para que disponga de un Gestor. 
import java.util.*;

public class ActividadResuelta75 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Gestor gestor = new Gestor("PEPE", "2574825283", 5000);

        System.out.println("\nBienvenido a tu Banco de Confianza");
        System.out.println("\nIntroduce tu nombre : ");
        String nombre = sc.nextLine();
        System.out.println("\nIntroduce tu DNI : ");
        String dni = sc.nextLine();

        CuentaCorriente cliente = new CuentaCorriente(dni, nombre, gestor);

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
            System.out.println("MOSTRAR INFORMACION DE TU GESTOR (PULSA 6)");
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

                case 6:
                    System.out.println("\nAQUI TIENES TU INFORMACION : ");
                    System.out.println("-------------------");
                    cliente.gestor();
                    break;

            }

        } while (eleccion > 0 && eleccion < 7);

        System.out.println("ADIOSSS");
    }

}
