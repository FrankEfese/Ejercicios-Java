package actividad.aplicacion.pkg7.pkg18;

//Implementa la clase Cola donde los elementos Integer encolados se guardan en una tabla. 
public class ActividadAplicacion718 {

    public static void main(String[] args) {

        Cola c = new Cola();
        c.insertarFinal(5);
        c.insertarFinal(7);
        c.insertarFinal(3);
        c.mostrarLista();
        c.eliminar();
        c.mostrarLista();
        c.insertarFinal(1);
        c.insertarFinal(40);
        c.mostrarLista();
        c.eliminar();

        c.mostrarLista();

    }

}
