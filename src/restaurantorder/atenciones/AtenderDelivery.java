package restaurantorder.atenciones;

import restaurantorder.IAtencion;

public class AtenderDelivery implements IAtencion {

    @Override
    public void procesar() {
        System.out.println("Atendiendo delivery...");
    }
}
