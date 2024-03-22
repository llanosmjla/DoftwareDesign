package restaurant.elementos;

public class Items {
    public String nombre;
    public double precio;
    public int cantidad;
    public String categoria;
    public Items(String nombre, double precio, int cantidad, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public Items() {

    }
}
