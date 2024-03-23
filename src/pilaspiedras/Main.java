package pilaspiedras;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       LinkedList<Integer> stones = new LinkedList<>(List.of(8, 5, 13, 27, 14));
       PilaPiedras pila = new PilaPiedras(stones);
       pila.calculateDifference();
    }
}

