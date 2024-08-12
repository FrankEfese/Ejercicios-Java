package actividad.resuelta.pkg7.pkg3;

//Modificar la visibilidad de CuentaCorriente para que sea visible desde clases
//externas y la visibilidad de sus atributos para que : 
//-Saldo no sea visible para otras clases. 
//-Nombre sea publico para cualquier clase. 
//-DNI solo sea visible por clases vecinas. 
import java.util.Scanner;

public class ActividadResuelta73 {

    public static void main(String[] args) {

        CuentaCorriente cliente = new CuentaCorriente("45675632Z", "Perico");
        // cliente.saldo = 200; // produce error porque es privado
        cliente.dni = "23443A"; // al ser una clase vecina dni es visible
        cliente.nombre = "Pepe"; // nombre es visible desde cualquier clase

    }

}
