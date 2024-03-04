package restaurantorder;

import java.util.HashMap;

public class Empleado implements IEmpleado {
    private final HashMap<String, IAtencion> atenciones = new HashMap<>();
    @Override
    public void ejecutarAtencion(String key, ICliente cliente) {
        if (atenciones.containsKey(key)){
            atenciones.get(key).procesar();
        } else {
            System.out.println("Atención no encontrada");
        }
    }

    @Override
    public void addAtencion(String key, IAtencion atencion) {
        atenciones.put(key, atencion);
    }

    @Override
    public HashMap<String, IAtencion> getAtenciones() {
        return atenciones;
    }
}
