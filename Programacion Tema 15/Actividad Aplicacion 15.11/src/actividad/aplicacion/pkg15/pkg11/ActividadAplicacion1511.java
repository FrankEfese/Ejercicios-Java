package actividad.aplicacion.pkg15.pkg11;

//RepostajeNormal(fecha , hora , importe)
//RepostajeFactura(fecha , hora , importe , dni del cliente , matricula)
//LlenadoDeposito(cantLitrod , tipo combustible , importe)
//-Repostaje Normal 
//-Repostaje Factura
//-Ver todos los Reportajes
//-Importe Total
//-LLenado Deposito
//-Eliminar ultimo llenado
//-Ver todos los llenados
import Controladores.ContFactura;
import Controladores.ContLlenado;
import Controladores.ContNormal;
import actividad.aplicacion.pkg15.pkg11.LLenadoDeposito.tipoComb;

import java.util.Date;
import java.util.*;

public class ActividadAplicacion1511 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContNormal n = new ContNormal();
        ContFactura f = new ContFactura();
        ContLlenado l = new ContLlenado();
        tipoComb com = tipoComb.DIESEL;

        int eleccion;

        System.out.println("BIENVENIDOS");
        System.out.println("--------------------");

        do {
            System.out.println("\nPara Repostaje Normal (Pulsa 1)");
            System.out.println("Para Repostaje Factura (Pulsa 2)");
            System.out.println("Para ver todos los Repostajes (Pulsa 3)");
            System.out.println("Para ver todo el Importe (Pulsa 4)");
            System.out.println("Para un Llenado de Deposito (Pulsa 5)");
            System.out.println("Para eliminar ultimo Llenado (Pulsa 6)");
            System.out.println("Para ver todos los Llenados (Pulsa 7)");
            System.out.println("Para Salir (Pulsa otro Numero)");
            System.out.println("------------------------------------------");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce el Importe : ");
                    double importe = sc.nextDouble();
                    RepostajeNormal r = new RepostajeNormal(new Date(), new Date(), importe);
                    n.crear(r);
                    break;

                case 2:
                    System.out.println("\nIntroduce el Importe : ");
                    importe = sc.nextDouble();
                    System.out.println("\nIntroduce el DNI del Cliente : ");
                    sc.nextLine();
                    String dni = sc.nextLine();
                    System.out.println("\nIntroduce la Matricula : ");
                    String mat = sc.nextLine();
                    RepostajeFactura rep = new RepostajeFactura(new Date(), new Date(), importe, dni, mat);
                    f.crear(rep);
                    break;

                case 3:

                    if (n.cantidad() == 0 && f.cantidad() == 0) {
                        System.out.println("\nAUN NO HAY REPOSTAJES");
                    } else {

                        List<RepostajeNormal> lista = n.todos();
                        Collections.sort(lista, (x, y) -> x.getId() - y.getId());
                        List<RepostajeFactura> lista2 = f.todos();
                        Collections.sort(lista2, (x, y) -> x.getId() - y.getId());

                        System.out.println("\nREPOSTAJES");
                        System.out.println("-----------------");
                        for (RepostajeNormal rr : lista) {
                            System.out.println(rr);
                        }

                        for (RepostajeFactura rrr : lista2) {
                            System.out.println(rrr);
                        }

                    }

                    break;

                case 4:

                    if (n.cantidad() == 0 && f.cantidad() == 0) {
                        System.out.println("\nAUN NO HAY REPOSTAJES");
                    } else {

                        List<RepostajeNormal> lista = n.todos();
                        List<RepostajeFactura> lista2 = f.todos();
                        double importee = 0;

                        for (RepostajeNormal rr : lista) {
                            importee += rr.getImporte();
                        }

                        for (RepostajeFactura rrr : lista2) {
                            importee += rrr.getImporte();
                        }

                        System.out.println("\nEL IMPORTE TOTAL ES : " + importee);

                    }

                    break;

                case 5:

                    System.out.println("\nIntroduce la cantidad de Litros : ");
                    int cant = sc.nextInt();
                    System.out.println("\nPara el GASOIL (Pulsa 1)");
                    System.out.println("Para el DIESEL (Pulsa 2)");
                    System.out.println("Para la GASOLINA (Pulsa 3)");

                    do {
                        eleccion = sc.nextInt();

                        switch (eleccion) {

                            case 1 ->
                                com = tipoComb.GASOIL;
                            case 2 ->
                                com = tipoComb.DIESEL;
                            case 3 ->
                                com = tipoComb.GASOLINA;

                        }

                    } while (eleccion < 0 || eleccion > 3);

                    System.out.println("\nIntroduce el Importe : ");
                    importe = sc.nextDouble();

                    LLenadoDeposito ll = new LLenadoDeposito(cant, com, importe);
                    l.crear(ll);
                    break;

                case 6:
                    if (l.cantidad() == 0) {
                        System.out.println("\nAUN NO HAY LLENADOS");
                    } else {
                        l.eliminarUltimo();
                    }
                    break;

                case 7:

                    if (l.cantidad() == 0) {
                        System.out.println("\nAUN NO HAY LLENADOS");
                    } else {

                        List<LLenadoDeposito> lista = l.todos();

                        System.out.println("\nESTOS SON LOS LLENADOS");
                        System.out.println("---------------------------");
                        for (LLenadoDeposito pp : lista) {
                            System.out.println(pp);
                        }
                    }
                    break;

            }

        } while (eleccion > 0 && eleccion < 8);

    }

}
