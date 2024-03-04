package restaurantorder.atenciones;

import restaurantorder.IAtencion;

public class AsignarMenu implements IAtencion {
    @Override
    public void procesar() {
        System.out.println("Asignando menú...");
    }
}
