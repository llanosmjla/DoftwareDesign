package asignaciondinamica;

import java.util.LinkedList;

public class Memoria implements IMemoria {
    LinkedList<Bloque> bloques = Particionador.bloques;

    @Override
    public void asignarMemoria(String nombreProceso, int tamano) {
        for (Bloque bloque : bloques) {
            if (bloque.getNombreProceso().equals(nombreProceso)) {
                System.out.println("El proceso ya existe");
                return;
            } else if (bloque.getTamano() >= tamano && !bloque.isOcupado()) {
                bloque.setNombreProceso(nombreProceso);
                bloque.setOcupado(true);
                break;
            } else {
                System.out.println("No hay espacio suficiente");
            }
        }
    }

    @Override
    public void liberarMemoria(String nombreProceso) {
        for (Bloque bloque : bloques) {
            if (bloque.getNombreProceso().equals(nombreProceso)) {
                bloques.remove(bloque);
                break;
            }
        }
    }

    @Override
    public void verEstadoActual() {
        for (Bloque bloque : bloques) {
            System.out.println("Proceso: " + bloque.getNombreProceso() + " Tamaño: " + bloque.getTamano());
        }
    }
    @Override
    public void dividirBloque(Bloque bloque, int tamanoNuevoBloque) {
        Bloque nuevoBloque = new Bloque("Nuevo Bloque", bloque.getTamano() - tamanoNuevoBloque);
        bloque.setTamano(tamanoNuevoBloque);
        bloques.add(nuevoBloque);
    }
}
