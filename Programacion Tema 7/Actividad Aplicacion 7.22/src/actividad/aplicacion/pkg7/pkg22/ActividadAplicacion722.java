package actividad.aplicacion.pkg7.pkg22;

//Añadir a Conjunto : 
//-static boolean incluido : que devuelve true si c1 esta incluido en c2. 
//-static Conjunto union : devuelve un nuevo conjunto con c1 y c2. 
//-static interseccion: devuelve un nuevo conjunto con los valores comunes de c1 y c2. 
//-static diferencia : devuleve un nuevo conjunto con los valores de c1 que no estan en c2. 
public class ActividadAplicacion722 {

    public static void main(String[] args) {

        Conjunto c = new Conjunto();
        Conjunto b = new Conjunto();
        c.insertar(1);
        c.insertar(56);
        c.insertar(23);
        c.insertar(12);
        c.insertar(80);

        b.insertar(12);
        b.insertar(1);
        b.insertar(80);

        System.out.println(Conjunto.incluido(c, b));

        Conjunto p = Conjunto.union(c, b);
        p.mostrar();

        Conjunto z = Conjunto.interseccion(c, b);
        z.mostrar();
        Conjunto x = Conjunto.diferencia(c, b);
        x.mostrar();

    }

}
