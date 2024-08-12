package actividad.resuelta.pkg9.pkg6;

public interface Cola {

    void encolar(Integer n);

    Integer desencolar();

    default void encolarMultiple(Integer n, int x) {

        for (int j = 0; j < x; j++) {

            encolar(n);
        }

    }

}
