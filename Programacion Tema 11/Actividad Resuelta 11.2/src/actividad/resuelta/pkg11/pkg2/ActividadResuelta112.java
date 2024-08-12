package actividad.resuelta.pkg11.pkg2;

//Escribe una cadena en el fichero binario cancionPirata.dat .
import java.io.*;

public class ActividadResuelta112 {
    
    public static void main(String[] args) {
        
        String txt = "Con diez cañones por banda ," + "\n"
                + "viento en popa a toda vela," + "\n"
                + "no corta el mar, sino vuela" + "\n"
                + "un velero bergantin.";
        
        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("cancionPirata.dat"))) {
            
            in.writeObject(txt);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            
        }
        
    }
    
}
