package actividad.resuelta.pkg9.pkg11;

//Definir la interfaz Cola para numeros enteros e implementarla en la clase Lista. 
public class ActividadResuelta91 {

    public static void main(String[] args) {

        Lista l = new Lista();
        l.encolar(2);
        l.encolar(5);
        l.encolar(22);
        l.desencolar();
        System.out.println(l.toString());
    }

}
