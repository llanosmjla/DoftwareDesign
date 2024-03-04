package dron;

import java.util.HashMap;
import java.util.LinkedList;

public class Dron implements IDron{

    private int id;
    private int pesoMaximo;
    private int viajes = 1;
    LinkedList<IPaquete> paquetes = new LinkedList<IPaquete>();
    public Dron(int id, int pesoMaximo, int viajes){
        this.id = id;
        this.pesoMaximo = pesoMaximo;
        this.viajes = viajes;
    }
    @Override
    public void cargarPaquete(IPaquete paquete) {
        if(paquete.getPeso() <= this.pesoMaximo){
            this.paquetes.add(paquete);
        }else{
            sumarViajes();
            System.out.println("El paquete excede el peso maximo del dron");
        }
    }
    private int sumarViajes(){
        return viajes++;
    }
    @Override
    public void descargarPaquete() {
        this.paquetes.removeFirst();
    }

    @Override
    public boolean estaAlMaximo() {
        return this.paquetes.stream().mapToInt(IPaquete::getPeso).sum() == this.pesoMaximo;
    }
    @Override
    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    @Override
    public int getPesoMaximo() {
        return this.pesoMaximo;
    }

    @Override
    public String getDestino() {
        return this.paquetes.getFirst().getDestino();
    }

    @Override
    public LinkedList<IPaquete> getPaquetes() {
        return this.paquetes;
    }


}
