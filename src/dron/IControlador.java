package dron;

public interface IControlador {
    void establecerNumeroDeDrones(int numeroDeDrones);
    int obtenerNumeroDeDrones();
    boolean verificarDronDisponible();

}
