package restaurant.gestion;

import restaurant.IElemento;
import restaurant.elementos.Items;

import java.util.HashMap;
import java.util.LinkedList;

public class GestionMenu implements IElemento<Items> {

    final String PLATILLOS = "Platillos";
    final String BEBIDAS = "Bebidas";
    final String POSTRES = "Postres";
    final String ADICIONALES = "Adicionales";
    HashMap<String, LinkedList<Items>> menu = new HashMap<String, LinkedList<Items>>();

    public GestionMenu() {

    }

    @Override
    public void agregar(Items elemento) {
        if (elemento.categoria.equals(PLATILLOS)) {
            agregarElemento(PLATILLOS, elemento);
        } else if (elemento.categoria.equals(BEBIDAS)) {
            agregarElemento(BEBIDAS, elemento);
        } else if (elemento.categoria.equals(POSTRES)) {
            agregarElemento(POSTRES, elemento);
        } else if (elemento.categoria.equals(ADICIONALES)) {
            agregarElemento(ADICIONALES, elemento);
        }
    }

    private void agregarElemento(String nombre, Items elemento) {
        if (menu.containsKey(nombre)) {
            LinkedList<Items> lista = menu.get(nombre);
            lista.add(elemento);
            menu.put(nombre, lista);
        } else {
            LinkedList<Items> lista = new LinkedList<Items>();
            lista.add(elemento);
            menu.put(nombre, lista);
        }
    }

    @Override
    public void quitar(String nombre) {
        for (String key : menu.keySet()) {
            LinkedList<Items> lista = menu.get(key);
            for (Items item : lista) {
                if (item.nombre.equals(nombre)) {
                    lista.remove(item);
                    break;
                }
            }
        }
    }

    @Override
    public void modificar(Items elemento) {
        LinkedList<Items> lista = menu.get(elemento.categoria);
        for (Items item : lista) {
            if (item.nombre.equals(elemento.nombre)) {
                item.nombre = elemento.nombre;
                item.precio = elemento.precio;
                item.cantidad = elemento.cantidad;
            }
        }
    }

    public void mostrarMenu() {
        int i = 1;
        System.out.println("\n+++++++++ Menu +++++++++");
        for (String key : menu.keySet()) {
            System.out.println("********** " + key + " **********");
            System.out.println("Nombre - Precio - Cantidad");
            for (Items item : menu.get(key)) {
                System.out.println((i++) + ": " + item.nombre + " - " + item.precio + " - " + item.cantidad);
            }
            i = 1;
        }
        System.out.println("++++++++++++++++++++++++\n");
    }

    public boolean existeItem(String nombre) {
        for (String key : menu.keySet()) {
            LinkedList<Items> lista = menu.get(key);
            for (Items item : lista) {
                if (item.nombre.equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Items getItem(String nombreItem) {
        for (String key : menu.keySet()) {
            LinkedList<Items> lista = menu.get(key);
            for (Items item : lista) {
                if (item.nombre.equals(nombreItem)) {
                    return item;
                }
            }
        }
        return null;
    }
}
