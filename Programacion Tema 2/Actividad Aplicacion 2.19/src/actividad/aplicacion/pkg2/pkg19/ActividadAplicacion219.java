package actividad.aplicacion.pkg2.pkg19;

//Crea una aplicacion que solicite al usuario cuantos grados tiene un angulo y
//muestre el equivalente en radianes. Si el angulo no se encuentra entre 0 y 360 ,
//hay que transformarlo a dicho rango. 
import java.util.Scanner;

public class ActividadAplicacion219 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radianes;

        System.out.println("Introduce cuantos grados tiene el angulo : ");
        int angulo = sc.nextInt();

        if (angulo >= 0 && angulo <= 360) {
            radianes = ((angulo * Math.PI) / 180);
            System.out.println("El resultado en radianes : " + radianes);
        } else {

            double resto = (angulo % 360);

            System.out.println("Transformamos el angulo : " + resto);
            radianes = ((resto * Math.PI) / 180);
            System.out.println("El resultado en radianes : " + radianes);
        }

    }

}
