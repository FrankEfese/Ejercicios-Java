package actividad.propuesta.pkg2.pkg5;

//Escribir un programa que calcule el dinero recaudado en un concierto. La aplicacion 
//solicitara el aforo maximo del local , el precio por entrada y el numero de entradas vendidas. 
//Hay que tener en cuenta que si el numero de entradas vendidas no supera el 20% del aforo , se cancela 
//el concierto. Si el numero de entradas no supera el 50% del aforo , se realiza una rebaja del 25% del precio. 
import java.util.Scanner;

public class ActividadPropuesta25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el aforo del local : ");
        double aforo = sc.nextInt();
        System.out.println("Introduce el precio de la entrada : ");
        double precioEntr = sc.nextInt();
        System.out.println("Introduce cuantas entradas se han vendido : ");
        double totalEntr = sc.nextInt();

        double aforo20 = (aforo / 100) * 20;
        double aforo50 = (aforo / 100) * 50;
        double rebaja = (precioEntr / 100) * 25;
        double pvp = 0;

        if (aforo20 > totalEntr) {
            System.out.println("CONCIERTO CANCELADO");
        } else {
            if (aforo20 < totalEntr && totalEntr > aforo50) {

                pvp = (precioEntr * totalEntr);
                System.out.println("Dinero recaudado : " + pvp);

            } else {

                precioEntr -= rebaja;
                pvp = (precioEntr * totalEntr);
                System.out.println("Dinero recaudado : " + pvp);

            }
        }
    }

}
