package taskNumber;

public class ObservadorSumador implements IObservador{
    private Numero numero;
    //int suma = 0;
    public ObservadorSumador(Numero numero) {
        this.numero = numero;
    }
    @Override
    public void actualizar() {
        //System.out.println("Suma: -------------"+numero.getListaNumeros());
        int suma = 0;
        for (int n : numero.getListaNumeros()) {
            suma += n;
        }
        System.out.println("La suma es " + suma);
    }
}
