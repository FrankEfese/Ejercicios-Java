package actividad.aplicacion.pkg12.pkg25;

//Implementa una app que gestione un club de socios el cula cada uno tiene un apodo unico. 
//Del socio se guarda nombre y fecha de ingreso. Usar un fichero. 
//-Alta
//-Baja
//-Modificacion
//-Lista por Apodo
//-Lista por Antiguedad
//-Lista socios anteriores a una fecha
import java.util.*;
import java.io.*;
import java.time.LocalDate;

public class ActividadAplicacion1225 {

    public static void main(String[] args) {

        HashMap<String, Socio> mapa = new HashMap<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("club.dat"))) {

            mapa = (HashMap) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        int eleccion;
        String nom;
        String apodo;

        System.out.println("BIENVENIDO");

        do {

            System.out.println("\nAlta de Socio (Pulsa 1)");
            System.out.println("Baja de Socio (Pulsa 2)");
            System.out.println("Modificar Socio (Pulsa 3)");
            System.out.println("Listar por Apodo (Pulsa 4)");
            System.out.println("Lista por Antiguedad (Pulsa 5)");
            System.out.println("Listar por anio anterior (Pulsa 6)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("\nIntroduce su Apodo : ");
                    sc.nextLine();
                    apodo = sc.nextLine();
                    System.out.println("Introduce su Nombre : ");
                    nom = sc.nextLine();

                    if (!mapa.containsKey(apodo)) {

                        Socio s = new Socio(nom, LocalDate.now());
                        mapa.put(apodo, s);
                        System.out.println("\nAgregado");

                    } else {
                        System.out.println("\nYa hay alguien con ese Apodo");
                    }

                    break;

                case 2:

                    Set< Map.Entry<String, Socio>> i = mapa.entrySet();
                    Iterator<Map.Entry<String, Socio>> it = i.iterator();

                    if (mapa.isEmpty()) {
                        System.out.println("\nAun no hay Socios");
                    } else {

                        System.out.println("\nEstos son los Socios : ");
                        System.out.println("-----------------");

                        while (it.hasNext()) {

                            Map.Entry<String, Socio> p = it.next();
                            System.out.println("\nApodo : " + p.getKey());
                            System.out.println("Nombre : " + p.getValue().nombre);

                        }

                        System.out.println("\nIntroduce su Apodo : ");
                        sc.nextLine();
                        apodo = sc.nextLine();
                        if (mapa.containsKey(apodo)) {

                            mapa.remove(apodo);
                            System.out.println("\nEliminado");

                        } else {
                            System.out.println("\nNo hay alguien con ese Apodo");
                        }

                    }
                    break;

                case 3:

                    if (mapa.isEmpty()) {
                        System.out.println("\nAun no hay Socios");
                    } else {
                        i = mapa.entrySet();
                        it = i.iterator();

                        System.out.println("\nEstos son los Socios : ");
                        System.out.println("-----------------");

                        while (it.hasNext()) {

                            Map.Entry<String, Socio> p = it.next();
                            System.out.println("\nApodo : " + p.getKey());
                            System.out.println("Nombre : " + p.getValue().nombre);

                        }

                        System.out.println("\nIntroduce el apodo del Socio que deseas Modificar : ");
                        sc.nextLine();
                        apodo = sc.nextLine();

                        if (mapa.containsKey(apodo)) {

                            mapa = mod(mapa, apodo);

                        } else {

                            System.out.println("\nNo hay nadie con ese Apodo");
                        }

                    }

                    break;

                case 4:

                    if (mapa.isEmpty()) {
                        System.out.println("\nAun no hay Socios");
                    } else {

                        System.out.println("\nEstos son los Socios por Apodo : ");
                        System.out.println("-----------------");

                        TreeMap<String, Socio> lista = new TreeMap<>(mapa);
                        System.out.println(lista);

                    }

                    break;

                case 5:

                    if (mapa.isEmpty()) {
                        System.out.println("\nAun no hay Socios");
                    } else {

                        System.out.println("\nEstos son los Socios por Antiguedad : ");
                        System.out.println("-----------------");
                        i = mapa.entrySet();
                        ArrayList<Map.Entry<String, Socio>> listaAnt = new ArrayList<>(i);
                        Collections.sort(listaAnt, new Comparator<>() {
                            @Override
                            public int compare(Map.Entry<String, Socio> o1, Map.Entry<String, Socio> o2) {

                                return o1.getValue().fecha.compareTo(o2.getValue().fecha);
                            }

                        });
                        System.out.println(listaAnt);

                    }

                    break;

                case 6:

                    if (mapa.isEmpty()) {
                        System.out.println("\nAun no hay Socios");
                    } else {
                        System.out.println("\nIntroduce el anio : ");
                        int anio = sc.nextInt();
                        i = mapa.entrySet();
                        it = i.iterator();

                        System.out.println("\nEstos son los Socios : ");
                        System.out.println("-----------------");

                        while (it.hasNext()) {

                            Map.Entry<String, Socio> p = it.next();
                            if (p.getValue().fecha.getYear() <= anio) {
                                System.out.println("\nApodo : " + p.getKey());
                                System.out.println("Nombre : " + p.getValue().nombre);
                                System.out.println("Fecha : " + p.getValue().fecha);
                            }

                        }
                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 7);

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("club.dat"))) {

            in.writeObject(mapa);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static HashMap mod(HashMap m, String apo) {

        Set< Map.Entry<String, Socio>> i = m.entrySet();
        Iterator<Map.Entry<String, Socio>> it = i.iterator();
        Scanner sc = new Scanner(System.in);
        Socio a = null;
        String apodo = null;

        while (it.hasNext()) {

            Map.Entry<String, Socio> p = it.next();

            if (p.getKey().equals(apo)) {

                apodo = p.getKey();
                String aux = apodo;
                a = p.getValue();
                int eleccion;
                it.remove();

                do {
                    System.out.println("\nPara cambiar el Apodo (Pulsa 1)");
                    System.out.println("Para cambiar el Nombre (Pulsa 2)");
                    System.out.println("Para cambiar la fecha (Pulsa 3)");
                    eleccion = sc.nextInt();

                    switch (eleccion) {

                        case 1:
                            System.out.println("\nIntroduce el nuevo Apodo : ");
                            do {
                                apodo = sc.nextLine();
                            } while (apodo.isEmpty());

                            if (m.containsKey(apodo)) {

                                System.out.println("\nYa existe alguien con ese Apodo");
                                apodo = aux;
                            }
                            System.out.println("\nCambio Realizado");
                            break;

                        case 2:
                            System.out.println("\nIntroduce el nuevo Nombre : ");
                            do {
                                a.nombre = sc.nextLine();
                            } while (a.nombre.isEmpty());
                            System.out.println("\nCambio Realizado");
                            break;

                        case 3:
                            System.out.println("\nPara aumentar en dias (Pulsa 1)");
                            System.out.println("Para disminuir en dias (Pulsa 2)");
                            eleccion = sc.nextInt();

                            switch (eleccion) {

                                case 1:

                                    System.out.println("\nIntroduce cantidad de dias : ");
                                    int dias = sc.nextInt();
                                    LocalDate b = a.fecha.plusDays(dias);
                                    a.fecha = b;
                                    System.out.println("\nCambio Realizado");
                                    break;

                                case 2:
                                    System.out.println("\nIntroduce cantidad de dias : ");
                                    dias = sc.nextInt();
                                    b = a.fecha.minusDays(dias);
                                    a.fecha = b;
                                    System.out.println("\nCambio Realizado");
                                    break;

                            }

                            break;

                    }

                } while (eleccion > 0 && eleccion < 4);

            }

        }
        m.put(apodo, a);
        System.out.println("\nCambios Realizados");

        return m;

    }

}
