package taskNumber;

public class DecoradorFiltrarImpar implements IObservable {
    private Numero numero;

    //List<Integer> lista;
    public DecoradorFiltrarImpar(Numero numero) {
        this.numero = numero;
    }

    @Override
    public void addObservador(IObservador observador) {
        numero.addObservador(observador);
}

    @Override
    public void removeObservador(IObservador observador) {
        numero.removeObservador(observador);
    }

    @Override
    public void notificarObservadores() {
        if (numero.getNumero() % 2 != 0) {
            numero.notificarObservadores();
        }
    }

    /*public void adicionar(int n)
    {
        if (n % 2 != 0){
            numero.adicionar(n);
            //lista.add(n);
            notificarObservadores();
        }
        else {
            //System.out.println("El número " + n + " no es impar");
            numero.adicionar(n);
        }
    }*/

    /*public List<Integer> getListaNumeros(){
        return lista;
    }*/
}
