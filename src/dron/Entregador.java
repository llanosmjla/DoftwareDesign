package dron;

public class Entregador implements IEntregador{
    @Override
    public void EntregrarPaqueteAdestino(IDron dron, ILocalizacion destino) {
        System.out.println("Entregando paquete a destino...");
    }
}
