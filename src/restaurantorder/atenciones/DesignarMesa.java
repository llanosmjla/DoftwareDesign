package restaurantorder.atenciones;

import restaurantorder.IAtencion;

public class DesignarMesa implements IAtencion {

    @Override
    public void procesar() {
        System.out.println("Designando mesa...");
    }
}
