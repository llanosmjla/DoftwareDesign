package restaurant.gestion;

import restaurant.IElemento;
import restaurant.elementos.Cliente;

import java.util.LinkedList;

public class GestionCliente implements IElemento<Cliente> {
    public LinkedList<Cliente> clientes = new LinkedList<Cliente>();

    @Override
    public void agregar(Cliente elemento) {
        clientes.add(elemento);
    }

    @Override
    public void quitar(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.nombre.equals(nombre)){
                clientes.remove(cliente);
                break;
            }
        }
    }

    @Override
    public void modificar(Cliente elemento) {
        for (Cliente cliente : clientes) {
            if (cliente.nombre.equals(elemento.nombre)){
                cliente.tipoPago = elemento.tipoPago;
                break;
            }
        }
    }

    public void showClientes() {
        System.out.println("Nombre - Tipo de Pago");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.nombre + " - " + cliente.tipoPago);
        }
    }

    public boolean existeCliente(String nombreCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.nombre.equals(nombreCliente)){
                return true;
            }
        }
        return false;
    }

    public Cliente getCliente(String nombreCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.nombre.equals(nombreCliente)){
                return cliente;
            }
        }
        return null;
    }
}
