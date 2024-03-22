package observerdecorator;

import java.util.List;

public class LesserObserver implements IObserver {
    @Override
    public void update(List<Integer> numbers) {
        int smaller = Integer.MAX_VALUE;
        for (int n : numbers) {
            {
                if (n < smaller) {
                    smaller = n;
                }
            }
        }
        System.out.println("El smaller es " + smaller);
    }
}
