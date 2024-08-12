package actividad.aplicacion.pkg2.pkg14;

//Escribe un programa que solicite a un usuario un numero comprendido entre 1 y 99. 
//El programa debe mostrarlo con letras . 

import java.util.Scanner;

public class ActividadAplicacion214 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, unidad, decena;
        String uni = "", sobreD = "", dec = "";

        System.out.println("Introduce un numero del 0 al 99");
        num = sc.nextInt();
        decena = num / 10;
        unidad = (num % 10) / 1;

        if (unidad == 1) {
            uni = "uno";
        } else if (unidad == 2) {
            uni = "dos";
        } else if (unidad == 3) {
            uni = "tres";
        } else if (unidad == 4) {
            uni = "cuatro";
        } else if (unidad == 5) {
            uni = "cinco";
        } else if (unidad == 6) {
            uni = "seis";
        } else if (unidad == 7) {
            uni = "siete";
        } else if (unidad == 8) {
            uni = "ocho";
        } else if (unidad == 9) {
            uni = "nueve";
        }

        if (decena == 1 && unidad == 0) {
            sobreD = "diez";
        } else if (decena == 1 && unidad == 1) {
            sobreD = "once";
        } else if (decena == 1 && unidad == 2) {
            sobreD = "doce";
        } else if (decena == 1 && unidad == 3) {
            sobreD = "trece";
        } else if (decena == 1 && unidad == 4) {
            sobreD = "catorce";
        } else if (decena == 1 && unidad == 5) {
            sobreD = "quince";
        } else if (decena == 1 && unidad == 6) {
            sobreD = "dieciseis";
        } else if (decena == 1 && unidad == 7) {
            sobreD = "diecisiete";
        } else if (decena == 1 && unidad == 8) {
            sobreD = "dieciocho";
        } else if (decena == 1 && unidad == 9) {
            sobreD = "diecinueve";
        }

        if (decena == 2) {
            dec = "veinte";
        } else if (decena == 3) {
            dec = "treinta";
        } else if (decena == 4) {
            dec = "cuarenta";
        } else if (decena == 5) {
            dec = "cincuenta";
        } else if (decena == 6) {
            dec = "sesenta";
        } else if (decena == 7) {
            dec = "setenta";
        } else if (decena == 8) {
            dec = "ochenta";
        } else if (decena == 9) {
            dec = "noventa";
        }

        if (num < 10) {
            System.out.println("El numero es: " + uni);
        } else if (num < 20) {
            System.out.println("El numero es: " + sobreD);
        } else if (num < 100) {
            if (num % 10 == 0) {
                System.out.println("El numero es: " + dec);
            } else {
                System.out.println("El numero es: " + dec + " y " + uni);
            }
        }

    }

}
