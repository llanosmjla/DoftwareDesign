package dron;

public class Paquete implements IPaquete{

    int peso;
    String estado;
    String destino;
    public Paquete() {
    }

    public Paquete(int peso, String estado, String destino) {
        this.peso = peso;
        this.estado = estado;
        this.destino = destino;
    }
    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public boolean verificarEstado(String estado) {
        return estado.equals("entregado");
    }

    @Override
    public void asignarDestino(String destino) {
        System.out.println("Asignando destino al paquete...");
        this.destino = destino;
    }

    @Override
    public String getDestino() {
        System.out.println("El destino del paquete es: " + destino);
        return destino;
    }
}
