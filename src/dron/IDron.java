package dron;

import java.util.LinkedList;

public interface IDron {
    void cargarPaquete(IPaquete paquete);
    void descargarPaquete();
    boolean estaAlMaximo();
    void setPesoMaximo(int pesoMaximo);
    int getPesoMaximo();
    String getDestino();
    LinkedList<IPaquete> getPaquetes();
}
