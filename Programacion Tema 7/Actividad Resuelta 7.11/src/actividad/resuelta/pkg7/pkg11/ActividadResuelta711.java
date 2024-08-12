package actividad.resuelta.pkg7.pkg11;

//Implementar la clase Lista correspondiente a una lista de numeros de la clase Integer . 
//Los numeros se guardaran en una tabla . 
//-Un constructor que inicialice la tabla en 0 . 
//-Obtener el num de elementos que hay en la lista. 
//-Insertar un num al final. 
//-Insertar al principio. 
//-Insertar un num en un indice en concreto. 
//-Añadir al final los elementos de otra lista. 
//-Eliminar un elemento cuyo indice se pasa como parametro. 
//-Buscar un num en la lista , devolviendo el indice  o -1. 
//-Mostrar la lista. 
import java.util.*;

public class ActividadResuelta711 {

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
    }

}
