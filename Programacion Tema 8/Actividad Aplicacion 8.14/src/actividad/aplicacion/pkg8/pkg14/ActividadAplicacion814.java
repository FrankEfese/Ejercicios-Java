package actividad.aplicacion.pkg8.pkg14;

//Reimplementa la clase Lista de la Act Resue 7.11 sustituyendo el metodo mostrar() por el toString(). 

public class ActividadAplicacion814 {

    public static void main(String[] args) {

        Lista l1 = new Lista();
        Lista l2 = new Lista();

        l1.insertarPrincipio(4);
        l1.insertarPrincipio(7);
        l1.insertarFinal(34);
        l1.insertarPrincipio(5);
        l1.insertarPrincipio(5);
        l1.eliminarParametro(2);
        l1.busqueda(0);
        l1.busqueda(5);
        l1.numElementosLista();

        l1.insertarPrincipio(42);
        l1.insertarPrincipio(74);
        l1.insertarFinal(354);
        l1.insertarPrincipio(45);
        l1.insertarPrincipio(522);

        l2.insertarFinal(9);
        l2.insertarFinal(9);
        l2.insertarFinal(9);
        l2.insertarFinal(9);
        l1.insertarLista(l2);
        System.out.println(l1.toString());
    }

}
