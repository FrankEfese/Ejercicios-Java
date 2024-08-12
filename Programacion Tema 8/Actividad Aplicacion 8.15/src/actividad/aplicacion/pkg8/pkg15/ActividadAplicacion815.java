package actividad.aplicacion.pkg8.pkg15;

//Escribe en la clase Lista un metodo equals() para compararlas. 
public class ActividadAplicacion815 {

    public static void main(String[] args) {

        Lista l1 = new Lista();
        Lista l2 = new Lista();

        l1.insertarPrincipio(42);
        l1.insertarPrincipio(74);
        l1.insertarPrincipio(45);
        l1.insertarPrincipio(522);

        l2.insertarFinal(522);
        l2.insertarFinal(45);
        l2.insertarFinal(74);
        l2.insertarFinal(42);
        l2.insertarFinal(42);

        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l1.equals(l2));
    }

}
