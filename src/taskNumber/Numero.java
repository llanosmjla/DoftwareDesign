package taskNumber;

import java.util.ArrayList;
import java.util.List;

public class Numero implements IObservable{
    List<Integer> numeros;
    List<IObservador> observadores;
    public Numero()
    {
        numeros = new ArrayList<>();
        observadores = new ArrayList<>();
    }
    @Override
    public void addObservador(IObservador observador)
    {
        observadores.add(observador);
    }

    @Override
    public void removeObservador(IObservador observador)
    {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for(IObservador obs : observadores){
            obs.actualizar();
        }
        System.out.println("___________________________________________________");
    }

    public void adicionar(int n)
    {
        if (!numeros.contains(n)){
            numeros.add(n);
            notificarObservadores();
        }
    }

    public void remover(int n)
    {
        if (numeros.contains(n)){
            numeros.remove(Integer.valueOf(n));
            notificarObservadores();
        }
    }

    public List<Integer> getListaNumeros(){
        return numeros;
    }

    public int getNumero() {
        return numeros.getLast();
    }

    public void setListaImpares(List<Integer> listaImpares) {
        numeros = listaImpares;
    }
}
