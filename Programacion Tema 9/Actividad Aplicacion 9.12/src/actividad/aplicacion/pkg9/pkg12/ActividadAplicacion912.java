package actividad.aplicacion.pkg9.pkg12;

//Definir las interfaces Cola y Pila para objetos de tipo String e implementarlos en la
//clase Lista definida en la act anterior. 
public class ActividadAplicacion912 {

    public static void main(String[] args) {

        String tabla[] = new String[0];
        String tabla2[] = new String[0];

        Lista l = new Lista(tabla);
        l.apilar("hola");
        l.apilar("adios");
        System.out.println(l.toString());
        l.desapilar();
        System.out.println(l.toString());
        Lista l2 = new Lista(tabla2);
        l2.encolar("pepe");
        l2.encolar("jose");
        System.out.println(l2.toString());
        l2.desencolar();
        System.out.println(l2.toString());
    }

}
