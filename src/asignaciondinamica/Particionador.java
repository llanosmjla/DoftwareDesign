package asignaciondinamica;

import java.util.LinkedList;

public class Particionador implements IParticionador{

    public static LinkedList<Bloque> bloques = new LinkedList<>();

    @Override
    public void particionarMemoria(int cantidadParticiones, int rangoInicial, int rangoFinal) {
        for (int i = 0; i < cantidadParticiones; i++) {
            Bloque bloque = new Bloque("Particion " + i, rangoDeParticion(rangoInicial, rangoFinal));
            generarParticiones(bloque);
        }
    }

    private int rangoDeParticion(int rangoInicial, int rangoFinal) {
        return (int) (Math.random() * (rangoFinal - rangoInicial) + rangoInicial);

    }

    @Override
    public void generarParticiones(Bloque bloque) {
        bloque.setOcupado(false);
        bloques.add(bloque);
    }
}
