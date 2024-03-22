package observerdecorator;

public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void NotifyObservers();

}
