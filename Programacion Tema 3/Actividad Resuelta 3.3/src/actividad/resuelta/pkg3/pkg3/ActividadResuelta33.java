package actividad.resuelta.pkg3.pkg3;

//Codificar el juego el numero secreto , que consiste en acertar un numero entre 1 y 100
//generado aleatoriamente. Para ello se introducira por teclado una serie de numeros, para los que se indica 
//(mayor o menor) segun sea mayor o menor con respecto al numero secreto. El proceso termina cuando el usuario
//acierta o cuando se rinde (introduciendo -1). 
import java.util.Scanner;

public class ActividadResuelta33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aleatorio = (int) (Math.random() * 100 + 1);

        System.out.println("Introduce numeros para adivinar el numero secreto (Introduce -1 para rendirte) : ");
        int num = 0;

        while (num != -1 && num != aleatorio) {

            num = sc.nextInt();

            if (num == -1) {
                System.out.println("OTRA VEZ SERA");
            } else {

                if (num > aleatorio) {
                    System.out.println("MAYOR");
                } else {
                    if (num < aleatorio) {
                        System.out.println("MENOR");
                    } else {
                        if (num == aleatorio) {
                            System.out.println("HAS ACERTADO");
                        }

                    }
                }

            }
        }

    }

}
