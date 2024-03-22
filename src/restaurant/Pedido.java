package restaurant;

import restaurant.elementos.Cliente;
import restaurant.elementos.Items;
import restaurant.elementos.Mesa;
import restaurant.gestion.GestionCliente;
import restaurant.gestion.GestionMenu;
import restaurant.gestion.GestionMesa;
import restaurant.gestion.GestionOrden;

public class Pedido {
    String id;
    GestionCliente clientes;
    GestionMesa mesas;
    GestionMenu menus;
    GestionOrden ordenes;

    public Pedido(GestionMesa mesas, GestionMenu menus, GestionCliente clientes) {
        this.mesas = mesas;
        this.menus = menus;
        this.clientes = clientes;
        this.ordenes = new GestionOrden();
    }

    public void ordenar(int numMesa, String nombreItem, int cantidad) {
        Items itemNuevo = new Items();
        Mesa mesa = mesas.getMesa(numMesa);
        if(menus.existeItem(nombreItem)) {
            Items item = menus.getItem(nombreItem);
            item.cantidad -= cantidad;
        }
        itemNuevo.nombre = nombreItem;
        itemNuevo.cantidad = cantidad;
        itemNuevo.precio = menus.getItem(nombreItem).precio;
        itemNuevo.categoria = menus.getItem(nombreItem).categoria;
        GestionOrden ordenes = new GestionOrden();
        this.ordenes = ordenes;
        ordenes.agregar(itemNuevo);
        mesa.ordenes.add(ordenes);
    }
    public void cancelarOrden(String nombreCliente, String nombreItem) {
        clientes.quitar(nombreCliente);
        ordenes.quitar(nombreItem);
    }

    public void modificarOrden(Cliente cliente, Items item) {
        for (Cliente c : clientes.clientes) {
            if (c.nombre.equals(cliente.nombre)){
                ordenes.modificar(item);
            }
        }
    }

    public void showOrden() {
        ordenes.showOrden();
    }

    public void mostrarOrden(int numeroMesa1) {
        Mesa mesa = mesas.getMesa(numeroMesa1);
        for (GestionOrden orden : mesa.ordenes) {
            orden.showOrden();
        }
    }
}
