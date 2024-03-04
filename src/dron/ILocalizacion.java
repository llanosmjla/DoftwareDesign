package dron;

public interface ILocalizacion {
    void definirCapacidad(int capacidad);
    int getCapacidad();
    boolean verificarCapacidad(int peso);
    String verificarEstado(); // Verficar si la localizacion esta disponible
}
