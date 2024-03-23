package restaurant;

import restaurant.elementos.Items;
import restaurant.gestion.GestionOrden;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Cuenta {
    HashMap<Integer, GestionOrden> ordenes = new HashMap<Integer, GestionOrden>();
    Scanner scanner = new Scanner(System.in);
    public double total;
    public boolean pagada;

    public Cuenta() {
        this.total = 0;
        this.pagada = false;
    }

    public void agregarEnCuenta(int numeroMesa, GestionOrden orden) {
        ordenes.put(numeroMesa, orden);
    }

    public void quitarDeCuenta(int numeroMesa) {
        ordenes.remove(numeroMesa);
    }

    public void mostrarCuenta(int numeroMesa) {
        GestionOrden orden = ordenes.get(numeroMesa);
        orden.showOrden();
    }

    public void calcularTotal(int numeroMesa) {
        GestionOrden orden = ordenes.get(numeroMesa);
        for (String key : orden.orden.keySet()) {
            List<Items> lista = orden.orden.get(key);
            for (Items item : lista) {
                total += item.precio;
            }
        }
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }


    public void pagar() {
        System.out.println("Pagando...");
        imprimir();
        System.out.println("Digite 1 para confirmar el pago: ");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            setPagada(true);
        }
    }

    public void imprimir() {
        System.out.println("Total: " + total);
    }
}
