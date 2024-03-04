package restaurantorder;

import java.util.HashMap;

public interface IEmpleado {
    void ejecutarAtencion(String key, ICliente cliente);
    void addAtencion(String key, IAtencion atencion);
    HashMap<String, IAtencion> getAtenciones();
}
