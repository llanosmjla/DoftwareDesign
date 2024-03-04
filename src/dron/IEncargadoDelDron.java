package dron;

import java.util.LinkedList;

public interface IEncargadoDelDron {
    void asignarDronALaCarga(IDron dron, IPaquete paquete);
    void descargarPaquete(ILocalizacion destino);
    void agregarDron(IDron dron);
    void agregarDestino(ILocalizacion destino);
}
