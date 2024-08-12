package actividad.aplicacion.pkg7.pkg21;

//Un conjunto es una estructura dinamica de datos como la lista, con dos diferencias : 
//en una lista puede haber elementos repetidos, mientras que en un conjunto no. Ademas , 
//en una lista el orden de inserccion de los elementos puede ser relevante y debemos tenerlo en cuenta , en un conjunto
//solo interesa si un elementos pertenece o no al conjunto y no el lugar que ocupa. Se pide implementar 
//la clase Conjunto utilizando una lista para almacenar numeros de tipo Integer . 
//-Un constructor sin parametros. 
//-El numero de elementos. 
//-Insertar. 
//-Insertar otro conjunto. 
//-Eliminar . 
//-Eliminar conjunto. 
//-Si esta el elemento. 
//-Mostrar. 
public class ActividadAplicacion721 {

    public static void main(String[] args) {

        Conjunto c = new Conjunto();
        Conjunto b = new Conjunto();
        System.out.println(c.insertar(4));
        System.out.println(c.insertar(56));
        System.out.println(c.insertar(23));
        System.out.println(c.insertar(12));
        System.out.println(c.insertar(43));
        c.mostrar();
        b.insertar(12);
        b.insertar(1);
        b.insertar(80);
        System.out.println(c.insertarOtroConj(b));
        c.mostrar();
        c.eliminarConj(b);
        c.mostrar();

    }

}
