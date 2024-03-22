package restaurant;

import restaurant.elementos.Cliente;
import restaurant.elementos.Items;
import restaurant.gestion.GestionCliente;
import restaurant.gestion.GestionMenu;
import restaurant.elementos.Mesa;
import restaurant.gestion.GestionMesa;
import restaurant.gestion.GestionOrden;
import ventas.Orden;

import java.util.LinkedList;
import java.util.Scanner;

public class Atencion {

    int id;
    GestionCliente clientes;
    GestionMesa mesas;
    GestionMenu menu;
    Pedido pedido;
    Cuenta cuenta = new Cuenta();
    LinkedList<Pedido> pedidos = new LinkedList<Pedido>();
    Scanner scanner = new Scanner(System.in);

    public Atencion(GestionMesa mesas, GestionMenu menu, GestionCliente clientes) {
        this.mesas = mesas;
        this.menu = menu;
        this.clientes = clientes;
        this.pedido = new Pedido(mesas, menu, clientes);
    }
    public void asignarMesa(String nombreCliente, int numeroMesa) {
        Cliente cliente;
        if (mesas.disponible(numeroMesa)){
            Mesa mesa = mesas.getMesa(numeroMesa);
            if(clientes.existeCliente(nombreCliente)) {
                cliente = clientes.getCliente(nombreCliente);
                mesaAsignada(mesa, cliente);
            } else {
                cliente = new Cliente(nombreCliente, "Efectivo");
                clientes.agregar(cliente);
                mesaAsignada(mesa, cliente);
            }
        }

    }

    private void mesaAsignada(Mesa mesa, Cliente cliente) {
        mesa.clientes.add(cliente);
        if(mesaCompartido()) {
            mesa.capacidad--;
            mesa.disponible = true;
        }else{
            mesa.disponible = false;
        }
    }
    private boolean mesaCompartido() {
        System.out.println("Desea compartir mesa: ");
        String respuesta = scanner.nextLine();
        if(respuesta.equals("si")) {
            return true;
        }
        return false;
    }

    public void showMenu() {
        menu.mostrarMenu();
    }
    public void tomarOrden(int numeroMesa) {
        if (mesas.disponible(numeroMesa)){
            System.out.println("La mesa no ha sido asignada");
            return;
        }
        System.out.println("********* Tomando orden *********");
        System.out.println("Nombre del item: ");
        String nombreItem = scanner.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = scanner.nextInt();
        pedido.ordenar(numeroMesa, nombreItem, cantidad);
    }
    public void entregarOrden(int numeroMesa) {
        System.out.println(" *** Entregando orden *** ");
        Mesa mesa = mesas.getMesa(numeroMesa);
        GestionOrden orden = mesa.ordenes.getLast();
        orden.estado = "Entregado";
        cuenta.agregarEnCuenta(mesa.numero, orden);
        mesa.cuenta = cuenta;
        System.out.println("Orden entregada");
    }

    public void entregarCuenta(Cuenta cuenta) {
        System.out.println("*** Entregando cuenta ***");
        cuenta.imprimir();
    }
    public void showCuenta(Cuenta cuenta) {
        if (cuenta.isPagada()){
            System.out.println("La cuenta ya ha sido pagada");
        }else {
            System.out.println("La cuenta no ha sido pagada");
        }
        cuenta.imprimir();
    }

    public void pagarCuenta(int numMesa) {
        Mesa mesa = mesas.getMesa(numMesa);
        cuenta = mesa.cuenta;
        cuenta.mostrarCuenta(numMesa);
        cuenta.calcularTotal(numMesa);
        cuenta.pagar();
    }

    public void showOrdenes() {
        for (Pedido p : pedidos) {
            p.showOrden();
        }
    }
}
