package restaurantorder.atenciones;

import restaurantorder.IAtencion;

public class ObtenerOrden implements IAtencion{

    @Override
    public void procesar() {
        System.out.println("Obteniendo orden...");
    }
}
