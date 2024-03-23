package pilaspiedras;

import java.util.LinkedList;

public class PilaPiedras {
    LinkedList<Integer> piedras = new LinkedList<Integer>();
    LinkedList<Integer> lista1 = new LinkedList<Integer>();
    LinkedList<Integer> lista2 = new LinkedList<Integer>();
    LinkedList<LinkedList<Integer>> combinaciones = new LinkedList<LinkedList<Integer>>();

    public PilaPiedras(LinkedList<Integer> piedras) {
        this.piedras = piedras;
    }
    public LinkedList<Integer> getPiedras() {
        return piedras;
    }
    public int calculateDifference() {
        System.out.println("Piedras: " + piedras);
        combinaciones = generateCombinaciones(piedras);
        int min_difference = Integer.MAX_VALUE;
        for (LinkedList<Integer> combinacion : combinaciones) {
            int sum1 = 0, sum2 = 0;
            for (int piedra : combinacion) {
                sum1 += piedra;
            }
            for (int piedra : piedras) {
                if (!combinacion.contains(piedra)) {
                    sum2 += piedra;
                }
            }
            min_difference = getMinDifference(combinacion, sum1, sum2, min_difference);
        }
        System.out.println("La diferencia minima es: " + min_difference);
        System.out.println("La primera combinacion es: " + lista1);
        System.out.println("La segunda combinacion es: " + lista2);
        return min_difference;
    }

    private int getMinDifference(LinkedList<Integer> combinacion, int sum1, int sum2, int min_difference) {
        if (Math.abs(sum1 - sum2) < min_difference) {
            min_difference = Math.abs(sum1 - sum2);
            lista1 = new LinkedList<Integer>(combinacion);
            lista2 = new LinkedList<Integer>();
            for (int piedra : piedras) {
                if (!combinacion.contains(piedra)) {
                    lista2.add(piedra);
                }
            }
        }
        return min_difference;
    }

    public LinkedList<LinkedList<Integer>> generateCombinaciones(LinkedList<Integer> piedras) {
        LinkedList<LinkedList<Integer>> combinaciones = new LinkedList<LinkedList<Integer>>();
        generateCombinationsHelper(piedras, new LinkedList<Integer>(), combinaciones, 0);
        return combinaciones;
    }

    private void generateCombinationsHelper(LinkedList<Integer> piedras, LinkedList<Integer> combinacion, LinkedList<LinkedList<Integer>> combinaciones, int index) {
        if (index == piedras.size()) {
            combinaciones.add(new LinkedList<Integer>(combinacion));
            return;
        }
        combinacion.add(piedras.get(index));
        generateCombinationsHelper(piedras, combinacion, combinaciones, index + 1);
        combinacion.remove(combinacion.size() - 1);
        generateCombinationsHelper(piedras, combinacion, combinaciones, index + 1);
    }

}
