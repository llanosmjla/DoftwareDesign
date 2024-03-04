package dron;

public interface IPaquete {
    int getPeso(); // Obtener el peso del paquete
    boolean verificarEstado(String estado); // Si el paquete ya fue entregado o no
    void asignarDestino(String destino); // Asignar un destino al paquete
    String getDestino(); // Obtener el destino del paquete
}
