package observerdecorator;

public class Main {
    public static void main(String[] args) {
        Number number = new Number();

        GreaterObserver greaterObserver = new GreaterObserver();
        LesserObserver lesserObserver = new LesserObserver();
        AddObserver addObserver = new AddObserver();

        OddNumberFilteringObserverDecorator greaterObs = new OddNumberFilteringObserverDecorator(greaterObserver);
        OddNumberFilteringObserverDecorator lesserObs = new OddNumberFilteringObserverDecorator(lesserObserver);
        OddNumberFilteringObserverDecorator addObs = new OddNumberFilteringObserverDecorator(addObserver);

        number.addObserver(greaterObserver);
        number.addObserver(lesserObserver);
        number.addObserver(addObserver);

        number.addObserver(greaterObs);
        number.addObserver(lesserObs);
        number.addObserver(addObs);

        addNumbers(number);

    }

    private static void addNumbers(Number number) {
        number.adicionar(1);
        number.adicionar(2);
        number.adicionar(3);
        number.adicionar(4);
    }
}
