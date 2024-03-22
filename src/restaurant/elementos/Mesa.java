package restaurant.elementos;

import restaurant.Cuenta;
import restaurant.IElemento;
import restaurant.gestion.GestionOrden;

import java.util.LinkedList;
import java.util.List;

public class Mesa{
    public int numero;
    public int capacidad;
    public boolean disponible;
    public LinkedList<Cliente> clientes;
    public LinkedList<GestionOrden> ordenes;
    public Cuenta cuenta;

    public Mesa(int numero, int capacidad, boolean disponible) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.disponible = disponible;
        this.clientes = new LinkedList<Cliente>();
        this.ordenes = new LinkedList<GestionOrden>();
        this.cuenta = new Cuenta();
    }
}
