package observerdecorator;

import java.util.ArrayList;
import java.util.List;

public class Number implements IObservable{
    List<Integer> numbers;
    List<IObserver> observers;
    public Number()
    {
        numbers = new ArrayList<>();
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(IObserver observador)
    {
        observers.add(observador);
    }

    @Override
    public void removeObserver(IObserver observador)
    {
        observers.remove(observador);
    }

    @Override
    public void NotifyObservers() {
        for(IObserver obs : observers){
            obs.update(numbers);
        }
        System.out.println("___________________________________________________");
    }

    public void adicionar(int n)
    {
        if (!numbers.contains(n)){
            numbers.add(n);
            NotifyObservers();
        }
    }

    public void remover(int n)
    {
        if (numbers.contains(n)){
            numbers.remove(Integer.valueOf(n));
        }
    }

    public List<Integer> getListaNumeros(){
        return numbers;
    }

    public int getNumero() {
        return numbers.getLast();
    }
    public void setListaImpares(List<Integer> listaImpares) {
        numbers = listaImpares;
    }
}
