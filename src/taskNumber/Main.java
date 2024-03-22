package taskNumber;

public class Main {
    public static void main(String[] args) {
        Numero numero = new Numero();
        DecoradorFiltrarImpar decoradorImpar = new DecoradorFiltrarImpar(numero);

        ObservadorMayor observadorMayor = new ObservadorMayor(numero);
        ObservadorMenor observadorMenor = new ObservadorMenor(numero);
        IObservador observadorSumadorImpares = new DecoradorSumaImpares(numero, new ObservadorSumador(numero));

        numero.addObservador(observadorMayor);
        numero.addObservador(observadorMenor);
        numero.addObservador(observadorSumadorImpares);

        numero.adicionar(1);
        decoradorImpar.notificarObservadores();
        numero.adicionar(2);
        decoradorImpar.notificarObservadores();
        numero.adicionar(3);
        decoradorImpar.notificarObservadores();
        numero.adicionar(4);
        decoradorImpar.notificarObservadores();
        numero.adicionar(5);
        decoradorImpar.notificarObservadores();
        numero.adicionar(6);
        decoradorImpar.notificarObservadores();

        //numero.notificarObservadores();

    }
}
