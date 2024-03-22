package taskNumber;

public class ObservadorMenor implements IObservador {
    Numero numero;

   public ObservadorMenor(Numero numero) {
        this.numero = numero;
    }
    @Override
    public void actualizar() {
        int menor = Integer.MAX_VALUE;
        for (int n : numero.getListaNumeros()) {
            {
                if (n < menor) {
                    menor = n;
                }
            }
        }
        System.out.println("El menor es " + menor);
    }
}
