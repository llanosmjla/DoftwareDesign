package asignaciondinamica;

public class Bloque {
    private String nombreProceso;
    private int tamano;
    private boolean ocupado;


    public Bloque(String nombreProceso, int tamano) {
        this.nombreProceso = nombreProceso;
        this.tamano = tamano;
        this.ocupado = false;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
