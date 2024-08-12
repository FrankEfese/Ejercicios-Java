package actividad.aplicacion.pkg15.pkg13;

//Alumno(id , nombre , telefono) 
//Portatil(id , marca , modelo)
//-Alta Alumno
//-Baja Alumno
//-Alta Portatil
//-Portatil de un Alumno
//-Alumno que usa un Portatil
//-Ver Alumnos
import Controladores.ContAlumno;
import Controladores.ContPort;
import java.util.*;

public class ActividadAplicacion1513 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContAlumno a = new ContAlumno();
        ContPort p = new ContPort();

        System.out.println("\nBIENVENIDO");
        System.out.println("----------------");
        int eleccion;

        do {
            System.out.println("\nMatricula Alumno (Pulsa 1)");
            System.out.println("Baja Alumno (Pulsa 2)");
            System.out.println("Alta Portatil (Pulsa 3)");
            System.out.println("Portatil de un Alumno (Pulsa 4)");
            System.out.println("Alumno que usa un Portatil (Pulsa 5)");
            System.out.println("Ver todos los Alumnos (Pulsa 6)");
            System.out.println("Para Salir (Pulsa Otro Numero)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:

                    if (p.sinAsignar() == 0) {
                        System.out.println("\nNO HAY PORTATILES DISPONIBLES");
                    } else {
                        System.out.println("\nIntroduce su Nombre : ");
                        sc.nextLine();
                        String nom = sc.nextLine().toUpperCase();
                        System.out.println("\nIntroduce su Telefono :  ");
                        int telefono = sc.nextInt();
                        Alumno aux = new Alumno(nom, telefono, p.asignar());
                        a.crear(aux);

                    }
                    break;

                case 2:

                    if (a.cantidad() == 0) {
                        System.out.println("\nNO HAY ALUMNOS QUE BORRAR");
                    } else {

                        List<Alumno> lista = a.todos();
                        System.out.println("\nESTOS SON LOS ALUMNOS");
                        System.out.println("----------------------------");

                        for (Alumno aux : lista) {

                            System.out.println(aux + " / Portatil : " + aux.getPortatil());

                        }

                        System.out.println("\nIntroduce el ID del Alumno que deseas ELIMINAR : ");
                        int id = sc.nextInt();
                        a.eliminar(id);

                    }

                    break;

                case 3:
                    System.out.println("\nIntroduce su Marca : ");
                    sc.nextLine();
                    String marca = sc.nextLine().toUpperCase();
                    System.out.println("\nIntroduce su Modelo : ");
                    String modelo = sc.nextLine().toUpperCase();
                    Portatil aux = new Portatil(marca, modelo);
                    p.crear(aux);
                    break;

                case 4:

                    if (a.cantidad() == 0) {
                        System.out.println("\nNO HAY ALUMNOS ");
                    } else {

                        List<Alumno> lista = a.todos();
                        System.out.println("\nESTOS SON LOS ALUMNOS");
                        System.out.println("----------------------------");

                        for (Alumno auxu : lista) {

                            System.out.println(auxu);

                        }

                        System.out.println("\nIntroduce el ID del Alumno que deseas ver su Portatil : ");
                        int id = sc.nextInt();
                        Alumno s = a.uno(id);
                        if (s != null) {
                            System.out.println("\nESTE ES SU PORTATIL");
                            System.out.println("------------------------");
                            System.out.println(s.getPortatil());

                        } else {
                            System.out.println("\nNO HAY NINGUN ALUMNO CON ESE PORTATIL");
                        }

                    }
                    break;

                case 5:

                    if (a.cantidad() == 0) {
                        System.out.println("\nNO HAY ALUMNOS USANDO UN PORTATIL");

                    } else {

                        List<Portatil> lista = p.todos();
                        System.out.println("\nESTOS SON LOS PORTATILES");
                        System.out.println("----------------------------");

                        for (Portatil auxu : lista) {

                            if (auxu.getAlumno() != null) {
                                System.out.println(auxu);
                            }

                        }

                        System.out.println("\nIntroduce el ID del Portatil para saber su Alumno : ");
                        int id = sc.nextInt();
                        Portatil s = p.uno(id);

                        if (s != null && s.getAlumno() != null) {

                            System.out.println("\nESTE ES SU ALUMNO");
                            System.out.println("-------------------------");
                            System.out.println(s.getAlumno());

                        } else {
                            System.out.println("\nTE HAS EQUIVOCADO");
                        }

                    }
                    break;

                case 6:

                    if (a.cantidad() == 0) {

                        System.out.println("\nNO HAY ALUMNOS MATRICULADOS");
                    } else {

                        List<Alumno> lista = a.todos();
                        System.out.println("\nESTOS SON LOS ALUMNOS");
                        System.out.println("----------------------------");

                        for (Alumno auxu : lista) {

                            System.out.println(auxu + " / Portatil : " + auxu.getPortatil());

                        }

                    }

                    break;

            }

        } while (eleccion > 0 && eleccion < 7);

    }

}
