package taskNumber;

public interface IObservable {
    void addObservador(IObservador observador);
    void removeObservador(IObservador observador);
    void notificarObservadores();

}
