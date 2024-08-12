package actividad.resuelta.pkg7.pkg12;

//Añadir a la clase Lista el metodo Lista concatena que construye y devuelve una lista
//que contiene el mismo orden una copia de todos los elementos de l1 y l2. 
public class ActividadResuelta712 {

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
        l1.mostrarLista();
        l1.insertarPrincipio(42);
        l1.insertarPrincipio(74);
        l1.insertarFinal(354);
        l1.insertarPrincipio(45);
        l1.insertarPrincipio(522);
        l1.mostrarLista();
        l2.insertarFinal(9);
        l2.insertarFinal(9);
        l2.insertarFinal(9);
        l2.insertarFinal(9);
        l1.insertarLista(l2);
        l1.mostrarLista();

        Lista l3 = Lista.insertar2Lista(l1, l2);
        l3.mostrarLista();
    }

}
