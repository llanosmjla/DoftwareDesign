package restaurant;

import restaurant.elementos.Cliente;
import restaurant.gestion.GestionCliente;
import restaurant.gestion.GestionMenu;
import restaurant.elementos.Mesa;
import restaurant.gestion.GestionMesa;
import restaurant.elementos.Items;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Aplicacion aplicacion = new Aplicacion(agregandoMesas(), crearMenu(), AgregandoCliente());
        aplicacion.run();
    }

    static GestionMesa agregandoMesas() {
        GestionMesa mesas = new GestionMesa();
        Mesa mesa = new Mesa(1, 4, true);
        Mesa mesa1 = new Mesa(2, 7, true);
        Mesa mesa2 = new Mesa(3, 4, true);
        Mesa mesa3 = new Mesa(4, 6, true);
        Mesa mesa4 = new Mesa(5, 4, true);
        Mesa mesa5 = new Mesa(6, 7, true);
        Mesa mesa6 = new Mesa(7, 4, true);
        Mesa mesa7 = new Mesa(8, 6, true);
        Mesa mesa8 = new Mesa(9, 4, true);
        Mesa mesa9 = new Mesa(10, 7, true);
        mesas.agregar(mesa);
        mesas.agregar(mesa1);
        mesas.agregar(mesa2);
        mesas.agregar(mesa3);
        mesas.agregar(mesa4);
        mesas.agregar(mesa5);
        mesas.agregar(mesa6);
        mesas.agregar(mesa7);
        mesas.agregar(mesa8);
        mesas.agregar(mesa9);
        return mesas;
    }

    public static GestionMenu crearMenu() {
        //Platillos
        Items items = new Items("Sopa de fideo", 10, 100, "Platillos");
        Items items1 = new Items("Sopa de arroz", 20, 100, "Platillos");
        Items items2 = new Items("Sopa de lentejas", 30, 100, "Platillos");
        //Bebidas
        Items items4 = new Items("Coca cola", 10, 100, "Bebidas");
        Items items5 = new Items("Pepsi", 20, 100, "Bebidas");
        Items items6 = new Items("Fanta", 30, 100, "Bebidas");
        //Postres
        Items items8 = new Items("Pastel de chocolate", 10, 100, "Postres");
        Items items9 = new Items("Pastel de vainilla", 20, 100, "Postres");
        Items items10 = new Items("Pastel de fresa", 30, 100, "Postres");
        //Adicionales
        Items items7 = new Items("Crema", 5, 100, "Adicionales");
        Items items11 = new Items("Galletas", 5, 100, "Adicionales");
        Items items12 = new Items("Pan", 5, 100, "Adicionales");

        GestionMenu menu = new GestionMenu();
        menu.agregar(items);
        menu.agregar(items1);
        menu.agregar(items2);
        menu.agregar(items4);
        menu.agregar(items5);
        menu.agregar(items6);
        menu.agregar(items8);
        menu.agregar(items9);
        menu.agregar(items10);
        menu.agregar(items7);
        menu.agregar(items11);
        menu.agregar(items12);
        return menu;
    }

    public static GestionCliente AgregandoCliente () {
        GestionCliente clientes = new GestionCliente();

        Cliente cliente = new Cliente("Juan", "Efectivo");
        Cliente cliente1 = new Cliente("Pedro", "Tarjeta");
        Cliente cliente2 = new Cliente("Maria", "Efectivo");
        Cliente cliente3 = new Cliente("Jose", "Tarjeta");
        Cliente cliente4 = new Cliente("Ana", "Efectivo");
        Cliente cliente5 = new Cliente("Luis", "Tarjeta");

        clientes.agregar(cliente);
        clientes.agregar(cliente1);
        clientes.agregar(cliente2);
        clientes.agregar(cliente3);
        clientes.agregar(cliente4);
        clientes.agregar(cliente5);
        return clientes;
    }
}
