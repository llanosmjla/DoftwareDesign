package restaurantorder;

public interface IMesa<T> {
    void agregarCliente(T client);
    void quitarCliente(T client);
    void mostrarClientes();
}
