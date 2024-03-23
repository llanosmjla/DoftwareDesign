package restaurant.gestion;

import restaurant.elementos.Items;
import restaurant.IElemento;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GestionOrden implements IElemento<Items> {
    int total = 0;
    public String estado = "Pendiente";
    public HashMap<String, List<Items>> orden = new HashMap<String, List<Items>>();

    public GestionOrden() {

    }
    @Override
    public void agregar(Items elemento) {
        if (orden.containsKey(elemento.nombre)){
            List<Items> lista = orden.get(elemento.nombre);
            lista.add(elemento);
            orden.put(elemento.categoria, lista);
        } else {
            List<Items> lista = new LinkedList<Items>();
            lista.add(elemento);
            orden.put(elemento.categoria, lista);
        }
    }
    @Override
    public void quitar(String nombre) {
        for (String key : orden.keySet()) {
            List<Items> lista = orden.get(key);
            for (Items item : lista) {
                if (item.nombre.equals(nombre)){
                    lista.remove(item);
                    break;
                }
            }
        }
    }

    @Override
    public void modificar(Items elemento) {
        List<Items> lista = orden.get(elemento.categoria);
        for (Items item : lista) {
            if (item.nombre.equals(elemento.nombre)){
                item.precio = elemento.precio;
                item.categoria = elemento.categoria;
                break;
            }
        }
    }

    public void showOrden() {
        System.out.println("******** Orden ********");
        System.out.println("-------"+estado+"-------");
        System.out.println("Nombre - Precio - Cant.");
        for (String key : orden.keySet()) {
            List<Items> lista = orden.get(key);
            System.out.println("*********** " + key + " ***********");

            for (Items item : lista) {
                System.out.println(item.nombre + " - " + item.precio + " - " + item.cantidad);
            }
        }
    }
}
