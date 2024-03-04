package asignaciondinamica;


public class Admin {
    static IEjecutorAccion get(){
        IEjecutorAccion ejecutor = new EjecutorAccion();
        ejecutor.agregarAccion("dividir", new AccionDividirBloque());
        return ejecutor;
    }

}
