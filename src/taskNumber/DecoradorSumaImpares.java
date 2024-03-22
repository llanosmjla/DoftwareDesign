package taskNumber;

import java.util.ArrayList;
import java.util.List;

public class DecoradorSumaImpares implements IObservador{
    ObservadorSumador observadorSumador;
    Numero numero;

    public DecoradorSumaImpares(Numero numero, ObservadorSumador observadorSumador) {
        this.numero = numero;
        this.observadorSumador = observadorSumador;
    }
    @Override
    public void actualizar() {
        setListaImpares();
        observadorSumador.actualizar();
    }

    private void setListaImpares(){

    }
}
