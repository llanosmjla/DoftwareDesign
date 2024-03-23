package unittest;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Enclosed.class)
public class NumerosTest {

    @RunWith(Parameterized.class)
    public static class NumeroPrimo {
        private int numero;
        private boolean esPrimo;

        public NumeroPrimo(int numero, boolean esPrimo) {
            this.numero = numero;
            this.esPrimo = esPrimo;
        }

        @Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {2, true},
                    {3, true},
                    {4, false},
                    {5, true},
                    {6, false},
                    {7, true},
                    {8, false},
                    {9, false},
                    {10, false},
                    {11, true},
                    {12, false},
                    {13, true},
                    {14, false},
                    {15, false},
                    {16, false},
                    {17, true},
                    {18, false},
                    {19, true},
                    {20, false},
                    {21, false},
                    {22, false},
                    {23, true},
                    {24, false},
                    {25, false},
                    {26, false},
                    {27, false},
                    {28, false},
                    {29, true},
                    {30, false},
                    {31, true},
                    {32, false},
                    {33, false},
                    {34, false},
                    {35, false},
                    {36, false},
                    {37, true},
                    {38, false},
                    {39, false},
                    {40, false},
                    {41, true},
                    {42, false},
                    {43, true},
                    {44, false},
                    {45, false},
                    {46, false},
                    {47, true},
                    {48, false},
                    {49, false},
                    {50, false},
                    {51, false},
                    {52, false},
                    {53, true},
                    {54, false},
                    {55, false},
                    {56, false},
                    {57, false},
                    {58, false},
                    {59, true},
                    {60, false},
                    {61, true},
                    {62, false},
                    {63, false},
            });

        }

        @Test
        public void testEsPrimo() {
            assertEquals(esPrimo, new unittest.NumeroPrimo(numero).esPrimo());
        }
    }
}



