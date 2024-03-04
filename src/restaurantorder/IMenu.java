package restaurantorder;

public interface IMenu<T> {
    void agregarItem(T item);
    void quitarItem(T item);
    void mostrarItems();
}
