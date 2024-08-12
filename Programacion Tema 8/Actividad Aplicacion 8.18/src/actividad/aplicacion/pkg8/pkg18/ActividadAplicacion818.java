package actividad.aplicacion.pkg8.pkg18;

//Diseña la clase ColaDoble , que hereda de Cola para enteros añadiendo : 
//-void encolarPrincipio () , que encola un elemento al Principio. 
//-Integer desencolar () que desencola un elemento del final. 
public class ActividadAplicacion818 {

    public static void main(String[] args) {

        ColaDoble c = new ColaDoble();
        c.insertarFinal(3);
        c.insertarFinal(7);
        c.insertarFinal(2);
        System.out.println(c.toString());
        c.insertarPrincipio(1);
        System.out.println(c.toString());
        c.desencolarFinal();
        System.out.println(c.toString());

    }

}
