package asignaciondinamica;

import java.util.HashMap;

public interface IEjecutorAccion {
    void ejecutar(String nombre, Bloque bloque);
    void agregarAccion(String nombre, IAccion accion);
    HashMap<String, IAccion> getAcciones();
}
