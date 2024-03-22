package observerdecorator;

import java.util.ArrayList;
import java.util.List;

public class OddNumberFilteringObserverDecorator implements IObserver {
    IObserver observer;

    public OddNumberFilteringObserverDecorator(IObserver observer){
        this.observer = observer;
    }
    @Override
    public void update(List<Integer> numbers) {
        List<Integer> listOdd = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 != 0) {
                listOdd.add(n);
            }
        }
        observer.update(listOdd);
    }
}
