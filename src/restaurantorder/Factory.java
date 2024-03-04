package restaurantorder;

import lists.ExecutorCommand;
import lists.IExecutorCommand;
import lists.command.*;
import restaurantorder.atenciones.AsignarMenu;
import restaurantorder.atenciones.DesignarMesa;
import restaurantorder.atenciones.ObtenerOrden;

public class Factory {
    static IEmpleado getAtencion(){
        IEmpleado mesero = new Empleado();
        mesero.addAtencion("designarMesa", new DesignarMesa());
        mesero.addAtencion("AsignarMenu", new AsignarMenu());
        mesero.addAtencion("tomarOrden", new ObtenerOrden());

        return mesero;
    }
}
