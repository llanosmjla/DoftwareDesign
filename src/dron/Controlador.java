package dron;

public class Controlador implements IControlador{

    int numeroDeDrones;
    @Override
    public void establecerNumeroDeDrones(int numeroDeDrones) {
        this.numeroDeDrones = numeroDeDrones;
    }

    @Override
    public int obtenerNumeroDeDrones() {
        return this.numeroDeDrones;
    }

    @Override
    public boolean verificarDronDisponible() {
        return true;
    }
}
