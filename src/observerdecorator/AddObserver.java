package observerdecorator;
import java.util.List;

public class AddObserver implements IObserver {
    @Override
    public void update(List<Integer> numbers) {
        int add = 0;
        for (int n : numbers) {
            add += n;
        }
        System.out.println("The sum is " + add);
    }
}
