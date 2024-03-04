package asignaciondinamica;

public interface IMemoria {
    void asignarMemoria(String nombreProceso, int tamano);
    void liberarMemoria(String nombreProceso);
    void verEstadoActual();
    void dividirBloque(Bloque bloque, int tamanoNuevoBloque);
}
