package taskNumber;

public class ObservadorMayor implements IObservador{
   private Numero numero;
    public ObservadorMayor(Numero numero) {
        this.numero = numero;
    }
    @Override
    public void actualizar() {
        int mayor = Integer.MIN_VALUE;
        for (int n : numero.getListaNumeros()) {
            if (n > mayor) {
                mayor = n;
            }
        }
        System.out.println("El mayor es " + mayor);
    }
}
