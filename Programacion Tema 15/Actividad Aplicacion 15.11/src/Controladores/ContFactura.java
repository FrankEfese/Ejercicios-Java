package Controladores;

import actividad.aplicacion.pkg15.pkg11.RepostajeFactura;
import java.util.List;

public class ContFactura {

    RepostajeFacturaJpaController f = new RepostajeFacturaJpaController();

    public void crear(RepostajeFactura a) {

        try {

            f.create(a);
            System.out.println("\nAGREGADO");

        } catch (Exception e) {
            System.out.println("\nHUBO UN ERROR");
        }

    }

    public void eliminar(int id) {

        try {

            f.destroy(id);
            System.out.println("\nELIMINADO");

        } catch (Exception e) {
            System.out.println("\nHubo un ERROR");

        }

    }

    public int cantidad() {
        return f.getRepostajeFacturaCount();
    }

    public List<RepostajeFactura> todos() {

        return f.findRepostajeFacturaEntities();

    }
}
