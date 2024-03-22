package sortstudent;

public interface IComparadorFactory {
    IComparador getComparador(String tipo);

}
