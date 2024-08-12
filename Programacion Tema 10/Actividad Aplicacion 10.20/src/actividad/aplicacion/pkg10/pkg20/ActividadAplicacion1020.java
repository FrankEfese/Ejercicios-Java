package actividad.aplicacion.pkg10.pkg20;

//Algunos sistemas operativos disponen de la orden comp , que compara dos archivos y nos dice si son iguales o distintos. 
//Diseña esta orden de forma que ademas nos diga en que linea y carcater se encuentra la primera diferencia . 
import java.io.*;

public class ActividadAplicacion1020 {

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("texto1.txt")); BufferedReader f = new BufferedReader(new FileReader("texto2.txt"))) {

            int numLineas1 = lineas(new BufferedReader(new FileReader("texto1.txt")));
            int numLineas2 = lineas(new BufferedReader(new FileReader("texto2.txt")));

            String txt1 = in.readLine();
            String txt2 = f.readLine();
            int contCarct = 0;
            int linea = 0;
            int cont = 0;
            int contGen = 0;
            boolean igual = true;

            if (numLineas1 == numLineas2) {

                while (txt1 != null && txt2 != null) {

                    linea++;

                    if (txt1.length() == txt2.length()) {

                        for (int x = 0; x < txt1.length(); x++) {

                            if (txt1.charAt(x) == txt2.charAt(x)) {

                                contCarct++;
                                contGen++;
                            } else {
                                break;
                            }

                        }

                    } else {

                        if (txt1.length() > txt2.length()) {
                            for (int x = 0; x < txt2.length(); x++) {

                                if (txt1.charAt(x) == txt2.charAt(x)) {

                                    contCarct++;
                                    contGen++;
                                } else {
                                    break;
                                }

                            }

                        } else {

                            for (int x = 0; x < txt1.length(); x++) {

                                if (txt1.charAt(x) == txt2.charAt(x)) {

                                    contCarct++;
                                    contGen++;
                                } else {
                                    break;
                                }

                            }

                        }

                    }

                    if (contCarct == txt1.length() && contCarct == txt2.length()) {

                        txt1 = in.readLine();
                        txt2 = f.readLine();
                        contCarct = 0;
                        cont++;
                    } else {

                        break;
                    }

                }
                if (cont == linea) {
                    System.out.println("SON IGUALES");
                } else {
                    System.out.println("Son distintos en :");
                    System.out.println("Linea : " + linea);
                    System.out.println("Carcter : " + (contGen + 1));

                }

            } else {

                if (numLineas1 > numLineas2) {

                    while (txt1 != null && txt2 != null) {

                        linea++;

                        if (txt1.length() == txt2.length()) {

                            for (int x = 0; x < txt1.length(); x++) {

                                if (txt1.charAt(x) == txt2.charAt(x)) {

                                    contCarct++;
                                    contGen++;
                                } else {
                                    break;
                                }

                            }

                        } else {

                            if (txt1.length() > txt2.length()) {
                                for (int x = 0; x < txt2.length(); x++) {

                                    if (txt1.charAt(x) == txt2.charAt(x)) {

                                        contCarct++;
                                        contGen++;
                                    } else {
                                        break;
                                    }

                                }

                            } else {

                                for (int x = 0; x < txt1.length(); x++) {

                                    if (txt1.charAt(x) == txt2.charAt(x)) {

                                        contCarct++;
                                        contGen++;
                                    } else {
                                        break;
                                    }

                                }

                            }

                        }

                        if (contCarct == txt1.length() && contCarct == txt2.length()) {

                            txt1 = in.readLine();
                            txt2 = f.readLine();
                            contCarct = 0;
                            cont++;
                        } else {

                            break;
                        }

                    }
                    if (cont == linea) {
                        System.out.println("Son distintos en :");
                        System.out.println("Linea : " + (linea + 1));
                        System.out.println("Caracter : " + (contGen + 1));
                    } else {
                        System.out.println("Son distintos en :");
                        System.out.println("Linea : " + linea);
                        System.out.println("Caracter : " + (contGen + 1));

                    }

                } else {

                    while (txt1 != null && txt2 != null) {

                        linea++;

                        if (txt1.length() == txt2.length()) {

                            for (int x = 0; x < txt1.length(); x++) {

                                if (txt1.charAt(x) == txt2.charAt(x)) {

                                    contCarct++;
                                    contGen++;
                                } else {
                                    break;
                                }

                            }

                        } else {

                            if (txt1.length() > txt2.length()) {
                                for (int x = 0; x < txt2.length(); x++) {

                                    if (txt1.charAt(x) == txt2.charAt(x)) {

                                        contCarct++;
                                        contGen++;
                                    } else {
                                        break;
                                    }

                                }

                            } else {

                                for (int x = 0; x < txt1.length(); x++) {

                                    if (txt1.charAt(x) == txt2.charAt(x)) {

                                        contCarct++;
                                        contGen++;
                                    } else {
                                        break;
                                    }

                                }

                            }

                        }

                        if (contCarct == txt1.length() && contCarct == txt2.length()) {

                            txt1 = in.readLine();
                            txt2 = f.readLine();
                            contCarct = 0;
                            cont++;
                        } else {

                            break;
                        }

                    }
                    if (cont == linea) {
                        System.out.println("Son distintos en :");
                        System.out.println("Linea : " + (linea + 1));
                        System.out.println("Caracter : " + (contGen + 1));
                    } else {
                        System.out.println("Son distintos en :");
                        System.out.println("Linea : " + linea);
                        System.out.println("Caracter : " + (contGen + 1));

                    }

                }

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

    static int lineas(BufferedReader in) {

        int lineas = 0;
        String t;
        try {

            t = in.readLine();

            while (t != null) {
                lineas++;
                t = in.readLine();
            }
            in.close();

        } catch (IOException e) {
            System.out.println(e);
        }

        return lineas;
    }

}
