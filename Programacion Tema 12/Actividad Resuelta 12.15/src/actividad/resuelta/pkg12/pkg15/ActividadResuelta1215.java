package actividad.resuelta.pkg12.pkg15;

//Implementa una app para gestionar las existencias de una tienda de repuestos de automoviles. 
//Cada producto se identifica por un codigo alfanumerico. La app permite dar de alta , baja y 
//actualizar el numero de unidades . Usar un fichero. 
import java.io.*;
import java.util.*;

public class ActividadResuelta1215 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Producto> mapa = new HashMap<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("garaje.dat"))) {

            mapa = (HashMap<Integer, Producto>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("BIENVENIDO");
        int eleccion;
        int cod;
        String nom;
        int cant;

        do {
            System.out.println("\nDar de Alta Producto (Pulsa 1)");
            System.out.println("Dar de Baja Producto (Pulsa 2)");
            System.out.println("Actualizar Stock (Pulsa 3)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:

                    System.out.println("\nIntroduce su Codigo : ");
                    cod = sc.nextInt();
                    System.out.println("Introduce su Nombre : ");
                    sc.nextLine();
                    nom = sc.nextLine();
                    System.out.println("Introduce su Stock : ");
                    cant = sc.nextInt();
                    Producto p = new Producto(nom, cant);

                    if (mapa.containsKey(cod)) {
                        System.out.println("\nYa existe un producto con este Codigo");
                    } else {

                        mapa.put(cod, p);
                        System.out.println("\nAgregado");
                    }

                    break;

                case 2:

                    int cont = 0;
                    if (mapa.isEmpty()) {
                        System.out.println("\nAun no hay productos");
                    } else {
                        System.out.println("\nEstos son los productos : ");
                        System.out.println("------------------");
                        Set<Map.Entry<Integer, Producto>> i = mapa.entrySet();
                        Iterator<Map.Entry<Integer, Producto>> it = i.iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, Producto> pr = it.next();
                            System.out.println("\nCodigo : " + pr.getKey());
                            System.out.println("Nombre : " + pr.getValue().nombre);
                            System.out.println("Stock : " + pr.getValue().stock);

                        }

                        System.out.println("\nIntroduce el Codigo del Producto que deseas borrar : ");
                        cod = sc.nextInt();

                        it = i.iterator();

                        while (it.hasNext()) {
                            Map.Entry<Integer, Producto> pr = it.next();
                            if (pr.getKey() == cod) {
                                it.remove();
                                System.out.println("\nEliminado");
                                cont++;
                            }

                        }

                        if (cont == 0) {
                            System.out.println("\nNo hay ningun producto con este Codigo. ");
                        }

                    }

                    break;

                case 3:

                    if (mapa.isEmpty()) {
                        System.out.println("\nAun no hay Productos.");
                    } else {

                        Set<Map.Entry<Integer, Producto>> i = mapa.entrySet();
                        Iterator<Map.Entry<Integer, Producto>> it = i.iterator();
                        System.out.println("\nEstos son los Productos : ");
                        System.out.println("----------------");
                        while (it.hasNext()) {

                            Map.Entry<Integer, Producto> pr = it.next();
                            System.out.println("\nCodigo : " + pr.getKey());
                            System.out.println("Nombre : " + pr.getValue().nombre);
                            System.out.println("Stock : " + pr.getValue().stock);

                        }

                        System.out.println("\nIntroduce el Codigo del Producto que deseas actualizar su Stock : ");
                        cod = sc.nextInt();

                        if (mapa.containsKey(cod)) {

                            it = i.iterator();

                            while (it.hasNext()) {

                                Map.Entry<Integer, Producto> pr = it.next();

                                if (pr.getKey() == cod) {

                                    Producto a = pr.getValue();

                                    System.out.println("Introduce el nuevo numero de Stock : ");
                                    cant = sc.nextInt();
                                    a.stock = cant;
                                    System.out.println("\nCambio Actualizado");
                                    pr.setValue(a);
                                }

                            }

                        } else {
                            System.out.println("\nNo hay ningun producto con este Codigo. ");
                        }

                    }

                    break;

            }

        } while (eleccion < 4 && eleccion > 0);
        System.out.println("\nADIOSS");

        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("garaje.dat"))) {
            in.writeObject(mapa);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
