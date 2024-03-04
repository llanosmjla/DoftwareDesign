package dron;

public class Localizacion implements ILocalizacion{
    private int capacidad;
    private int totalPeso;
    public Localizacion(int capacidad){
        this.capacidad = capacidad;
    }

    @Override
    public void definirCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public int getCapacidad() {
        return this.capacidad;
    }

    @Override
    public boolean verificarCapacidad(int peso) {
        if(this.totalPeso + peso <= this.capacidad){
            this.totalPeso += peso;
            return true;
        }
        return false;
    }

    @Override
    public String verificarEstado() {
        if(this.totalPeso < this.capacidad){
            return "Disponible";
        }
        return "No disponible";
    }
}
