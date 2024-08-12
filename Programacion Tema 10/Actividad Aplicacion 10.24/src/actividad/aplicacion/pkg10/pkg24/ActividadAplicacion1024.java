package actividad.aplicacion.pkg10.pkg24;

//Implementa una app que mantenga un registro de las temperaturas maxima y minima diarias medidas en 
//una estacion meteorologica . Los datos se guardaran en un archivo. 
//Un menu : 
//Nueva temperatura
//Mostrar Historial
//Salir
import java.util.*;
import java.io.*;
import java.time.LocalDate;

public class ActividadAplicacion1024 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la Esatcion");
        int eleccion;
        Temperatura tabla[] = new Temperatura[0];

        do {
            System.out.println("\nAgregar Temperatura (Pulsa 1)");
            System.out.println("Mostrar todas las Temperaturas (Pulsa 2)");
            System.out.println("Para Salir (Pulsa otro Numero)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:

                    System.out.println("\nIntroduce la Temp Max : ");
                    int max = sc.nextInt();
                    System.out.println("\nIntroduce la Tem Min : ");
                    int min = sc.nextInt();
                    Temperatura p = new Temperatura(LocalDate.now(), max, min);
                    tabla = Arrays.copyOf(tabla, tabla.length + 1);
                    tabla[tabla.length - 1] = p;
                    System.out.println("\nAgregada");

                    break;

                case 2:

                    System.out.println(Arrays.toString(tabla));
                    break;

            }

        } while (eleccion > 0 && eleccion < 3);

        try (BufferedWriter in = new BufferedWriter(new FileWriter("temperaturas.txt"))) {
            int numMax = maxi(tabla);
            int numMin = mini(tabla);
            String fe = "Fecha";
            String max = "Max";
            String min = "Min";

            in.write(fe);
            for (int j = fe.length(); j < 15; j++) {
                in.write(" ");
            }
            in.write(max);
            for (int c = (fe.length() + 15 + max.length()); c < (fe.length() + 15 + max.length() + 15); c++) {
                in.write(" ");
            }
            in.write(min);
            in.newLine();

            for (Temperatura a : tabla) {

                String p = a.fecha.toString();
                String x = String.valueOf(a.max);
                String i = String.valueOf(a.min);

                in.write(p);
                for (int j = p.length(); j < 15; j++) {
                    in.write(" ");
                }
                in.write(x);
                for (int c = (p.length() + (15 - p.length()) + x.length()); c < (p.length() + (15 - p.length()) + x.length() + 15); c++) {
                    in.write(" ");
                }
                in.write(i);
                in.newLine();

            }

            in.newLine();
            in.write("Tem Max : " + numMax);
            in.newLine();
            in.write("Tem Min : " + numMin);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

    static Integer maxi(Temperatura t[]) {

        ArrayList<Integer> n = new ArrayList<>();

        for (Temperatura f : t) {

            n.add(f.max);
        }

        Collections.sort(n);

        return n.get(n.size() - 1);

    }

    static Integer mini(Temperatura t[]) {

        ArrayList<Integer> n = new ArrayList<>();

        for (Temperatura f : t) {

            n.add(f.min);
        }

        Collections.sort(n);

        return n.get(0);

    }

}
