package actividad.resuelta.pkg8.pkg4;

import java.util.*;

public abstract class Instrumento {

    protected enum notas {
        DO, RE, MI, FA, SOL, LA, SI
    };

    protected notas tablaNotas[];

    public Instrumento() {
        tablaNotas = new notas[0];
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        int eleccion;

        do {
            System.out.println("Para agregar DO (PULSA 1)");
            System.out.println("Para agregar RE (PULSA 2)");
            System.out.println("Para agregar MI (PULSA 3)");
            System.out.println("Para agregar FA (PULSA 4)");
            System.out.println("Para agregar SOL (PULSA 5)");
            System.out.println("Para agregar LA (PULSA 6)");
            System.out.println("Para agregar SI (PULSA 7)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    tablaNotas = Arrays.copyOf(tablaNotas, tablaNotas.length + 1);
                    tablaNotas[tablaNotas.length - 1] = notas.DO;
                    break;

                case 2:

                    tablaNotas = Arrays.copyOf(tablaNotas, tablaNotas.length + 1);
                    tablaNotas[tablaNotas.length - 1] = notas.RE;
                    break;

                case 3:

                    tablaNotas = Arrays.copyOf(tablaNotas, tablaNotas.length + 1);
                    tablaNotas[tablaNotas.length - 1] = notas.MI;
                    break;

                case 4:

                    tablaNotas = Arrays.copyOf(tablaNotas, tablaNotas.length + 1);
                    tablaNotas[tablaNotas.length - 1] = notas.FA;
                    break;

                case 5:

                    tablaNotas = Arrays.copyOf(tablaNotas, tablaNotas.length + 1);
                    tablaNotas[tablaNotas.length - 1] = notas.SOL;
                    break;

                case 6:
                    tablaNotas = Arrays.copyOf(tablaNotas, tablaNotas.length + 1);
                    tablaNotas[tablaNotas.length - 1] = notas.LA;
                    break;

                case 7:
                    tablaNotas = Arrays.copyOf(tablaNotas, tablaNotas.length + 1);
                    tablaNotas[tablaNotas.length - 1] = notas.SI;
                    break;

            }

        } while (eleccion > 0 && eleccion < 8);

    }

    abstract void interpretar();

}
