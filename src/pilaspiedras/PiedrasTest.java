package pilaspiedras;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class PiedrasTest {

    @RunWith(Parameterized.class)
    public static class PilaPiedras {
        LinkedList<Integer> piedras = new LinkedList<Integer>();
        int diferenciaMinima;

        public PilaPiedras(LinkedList<Integer> piedras, int diferenciaMinima) {
            this.piedras = piedras;
            this.diferenciaMinima = diferenciaMinima;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14)), 3},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1)), 2},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2)), 0},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2, 3)), 1},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2, 3, 4)), 1},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2, 3, 4, 5)), 0},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2, 3, 4, 5, 6)), 0},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2, 3, 4, 5, 6, 7)), 0},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2, 3, 4, 5, 6, 7, 8)), 0},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2, 3, 4, 5, 6, 7, 8, 9)), 0},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), 0},
                    {new LinkedList<>(List.of(8, 5, 13, 27, 14, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)), 0},
                    {new LinkedList<>(List.of(100, 90, 25, 20, 11)), 4},
                    {new LinkedList<>(List.of(100, 90, 25, 20, 11, 1)), 3},
                    {new LinkedList<>(List.of(100, 90, 25, 20, 11, 1, 2)), 1},
                    {new LinkedList<>(List.of(100, 90, 25, 20, 11, 1, 2, 3)), 0},
            });
        }

        @Test
        public void testCalculateDifference() {
            assertEquals(diferenciaMinima, new pilaspiedras.PilaPiedras(piedras).calculateDifference());
        }
    }
}
