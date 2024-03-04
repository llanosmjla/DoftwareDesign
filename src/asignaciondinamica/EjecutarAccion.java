package asignaciondinamica;

import java.util.HashMap;

public class EjecutarAccion implements IEjecutorAccion{
    private HashMap<String, IAccion> acciones = new HashMap<>();

    @Override
    public void ejecutar(String nombre, Bloque bloque) {
        if(acciones.containsKey(nombre)){
            acciones.get(nombre).ejecutar(bloque);
        }else{
            System.out.println("No se encontro la accion");
        }

    }

    @Override
    public void agregarAccion(String nombre, IAccion accion) {
        acciones.put(nombre, accion);
    }

    @Override
    public HashMap<String, IAccion> getAcciones() {
        return acciones;
    }
}
