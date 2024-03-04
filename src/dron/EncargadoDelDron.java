package dron;

import java.util.LinkedList;

public class EncargadoDelDron implements IEncargadoDelDron {
    private IDron dron;
    private ILocalizacion destino;
    LinkedList<ILocalizacion> destinos = new LinkedList<ILocalizacion>();
    LinkedList<IDron> drones = new LinkedList<IDron>();
    int NUMERO_MAXIMO_DE_DRONES = 100;
    public EncargadoDelDron(int numeroDeDrones) {
        this.NUMERO_MAXIMO_DE_DRONES = numeroDeDrones;
    }

    @Override
    public void asignarDronALaCarga(IDron dron, IPaquete paquete) {
        System.out.println("Asignando dron a la carga...");
        if (dron.estaAlMaximo() && destino.verificarCapacidad(paquete.getPeso())) {
            System.out.println("El dron esta al maximo de su capacidad o ya se entrego el paquete en el destino");
        }else {
            dron.cargarPaquete(paquete);
        }
    }

    @Override
    public void descargarPaquete(ILocalizacion destino) {
        System.out.println("Descargando paquete en destino...");
        for (IPaquete paquete : dron.getPaquetes()) {
            if (paquete.getDestino().equals(destino)) {
                dron.descargarPaquete();
                destinos.remove(destino);
            }else {
                System.out.println("El destino no tiene capacidad para recibir el paquete");
            }
        }
    }
    @Override
    public void agregarDron(IDron dron) {
        if (drones.size() < NUMERO_MAXIMO_DE_DRONES) {
            drones.add(dron);
        }else {
            System.out.println("No se pueden agregar mas drones");
        }
    }
    @Override
    public void agregarDestino(ILocalizacion destino) {
        destinos.add(destino);
    }


}
