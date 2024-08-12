package actividad.aplicacion.pkg7.pkg14;

import java.util.Arrays;

public class Cambio {

    double precio;
    double importe;

    double[] billetes = {100, 50, 20, 10, 5};
    double monedas[] = {2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

    public Cambio(double precio, double importe) {
        this.precio = precio;
        this.importe = importe;
    }

    public void cambioDinero() {
        int n = 0;
        double cont = 0;

        if (importe == precio) {
            System.out.println("Total a devorlver : 0");
        } else {

            if (importe < precio) {
                System.out.println("Te has quedado corto.");
            } else {

                double total = importe - precio;
                int decimales = 2;

                total = Math.round(total * Math.pow(10, decimales)) / Math.pow(10, decimales);

                System.out.println("Total a devorlver : " + total);

                while (n < billetes.length) {

                    cont = total / billetes[n];

                    if (cont >= 0 && cont < 1) {
                        n++;
                    } else {
                        cont = Math.floor(cont);
                        System.out.println("Billetes de " + billetes[n] + " : " + cont);
                        total -= (billetes[n] * cont);
                        cont = 0;
                        n++;
                    }

                }

                n = 0;

                while (n < monedas.length) {

                    cont = total / monedas[n];

                    if (cont >= 0 && cont < 1) {
                        n++;
                    } else {
                        cont = Math.floor(cont);
                        System.out.println("Monedas de " + monedas[n] + " : " + cont);
                        total -= (monedas[n] * cont);
                        cont = 0;
                        n++;
                    }

                }

            }

        }
    }

}
