package actividad.aplicacion.pkg9.pkg17;

//Escribir un programa donde se usa una Lista para elementos Object para encolar y desencolar
//objetos de distintos tipos. 
public class ActividadAplicacion917 {

    public static void main(String[] args) {

        Object tabla[] = new Object[0];

        Lista l = new Lista(tabla);
        l.encolar(3);
        l.encolar("hola");
        l.encolar(4.34);
        System.out.println(l.toString());
        l.desencolar();
        System.out.println(l.toString());

    }

}
