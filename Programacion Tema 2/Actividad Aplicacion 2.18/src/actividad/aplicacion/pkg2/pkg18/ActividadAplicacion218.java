package actividad.aplicacion.pkg2.pkg18;

//Modifica la actividad de aplicacion 2.17 para que ademas , de los dos numero 
//aleatorios , tambien aparezca la operacion que debe realizar : suma , resta , division o multiplicacion. 
import java.util.Scanner;

public class ActividadAplicacion218 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = (int) (Math.random() * 99 + 1);
        int y = (int) (Math.random() * 99 + 1);
        x = Math.max(x, y);
        y = Math.min(x, y);
        int ope = (int) (Math.random() * 4 + 1);
        double res;

        switch (ope) {

            case 1:
                System.out.println("Realiza la suma : " + x + " + " + y);
                res = sc.nextInt();

                if (res == (x + y)) {
                    System.out.println("CORRECTO");
                } else {
                    System.out.println("FALLASTE");
                }
                break;

            case 2:
                System.out.println("Realiza la resta : " + x + " - " + y);
                res = sc.nextInt();
                if (res == (x - y)) {
                    System.out.println("CORRECTO");
                } else {
                    System.out.println("FALLASTE");
                }
                break;

            case 3:
                System.out.println("Realiza la multiplicacion : " + x + " * " + y);
                res = sc.nextInt();
                if (res == (x * y)) {
                    System.out.println("CORRECTO");
                } else {
                    System.out.println("FALLASTE");
                }
                break;

            case 4:
                System.out.println("Realiza la division : " + x + " / " + y);
                res = sc.nextInt();
                if (res == (x / y)) {
                    System.out.println("CORRECTO");
                } else {
                    System.out.println("FALLASTE");
                }
                break;

        }

    }

}
