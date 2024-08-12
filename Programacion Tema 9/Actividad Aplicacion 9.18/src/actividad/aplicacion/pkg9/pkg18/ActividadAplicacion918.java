package actividad.aplicacion.pkg9.pkg18;

//Repetir la act anterior con la interfaz Pila apilando y desapilando. 
public class ActividadAplicacion918 {

    public static void main(String[] args) {

        Object tabla[] = new Object[0];

        Lista l = new Lista(tabla);
        l.apilar(3);
        l.apilar("hola");
        l.apilar(4.34);
        System.out.println(l.toString());
        l.desapilar();
        System.out.println(l.toString());
    }

}
