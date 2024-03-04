package asignaciondinamica;

public interface IParticionador {
    void particionarMemoria(int cantidadParticiones, int rangoInicial, int rangoFinal);

    void generarParticiones(Bloque bloque);
}
