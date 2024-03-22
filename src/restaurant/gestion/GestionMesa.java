package restaurant.gestion;

import restaurant.IElemento;
import restaurant.elementos.Mesa;

import java.util.Collection;
import java.util.LinkedList;

public class GestionMesa implements IElemento<Mesa> {
    LinkedList<Mesa> mesas = new LinkedList<Mesa>();
    @Override
    public void agregar(Mesa elemento) {
        mesas.add(elemento);
    }

    @Override
    public void quitar(String nombre) {
        for (Mesa mesa : mesas) {
            if (mesa.numero == Integer.parseInt(nombre)){
                mesas.remove(mesa);
                break;
            }
        }
    }

    @Override
    public void modificar(Mesa elemento) {
        for (Mesa mesa : mesas) {
            if (mesa.numero == elemento.numero){
                mesa.capacidad = elemento.capacidad;
                mesa.disponible = elemento.disponible;
                break;
            }
        }
    }

    public boolean disponible(int numeroMesa) {
        for (Mesa mesa : mesas) {
            if (mesa.numero == numeroMesa){
                return mesa.disponible;
            }
        }
        return false;
    }

    public Mesa getMesa(int numeroMesa) {
        for (Mesa mesa : mesas) {
            if (mesa.numero == numeroMesa){
                return mesa;
            }
        }
        return null;
    }

    public void showMesas() {
        System.out.println("\n******** Mesas ********");
        System.out.println("Numero - Capacidad - Disponible");
        for (Mesa mesa : mesas) {
            System.out.println(mesa.numero + "   -   " + mesa.capacidad + "    -    " + mesa.disponible);
        }

        System.out.println("\nMesas Disponibles: " + mesasDisponibles());
        System.out.println("Mesas Ocupadas: " + (mesas.size() - mesasDisponibles()));
        System.out.println("______________________________________\n");
    }

    public LinkedList<Mesa> getMesas() {
        return mesas;
    }

    public int mesasDisponibles() {
        int disponibles = 0;
        for (Mesa mesa : mesas) {
            if (mesa.disponible){
                disponibles++;
            }
        }
        return disponibles;
    }
}
