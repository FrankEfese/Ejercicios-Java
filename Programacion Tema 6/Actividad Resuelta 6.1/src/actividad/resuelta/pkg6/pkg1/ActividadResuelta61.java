package actividad.resuelta.pkg6.pkg1;

//Escribir un programa que muestre todos los caracteres Unicode junto a su 
//code point , cuyo valor este comprendido entre /u0000 y /u FFFF . 
public class ActividadResuelta61 {

    public static void main(String[] args) {

        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            String xxxx = Integer.toHexString(codePoint);
            System.out.println("\\u" + xxxx + " : " + (char) codePoint);
        }
    }

}
