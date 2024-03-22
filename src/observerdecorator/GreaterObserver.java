package observerdecorator;

import java.util.List;

public class GreaterObserver implements IObserver {
    @Override
    public void update(List<Integer> numbers) {
        int greater = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n > greater) {
                greater = n;
            }
        }
        System.out.println("El greater es " + greater);
    }
}
