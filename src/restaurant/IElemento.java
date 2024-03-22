package restaurant;

public interface IElemento<T> {
    void agregar(T elemento);
    void quitar(String nombre);
    void modificar(T elemento);
}
