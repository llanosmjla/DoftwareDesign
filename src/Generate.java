public class Generate {
    public static void main(String[] args) {
        int[]num = generateRandom(20);
        int numberPairs = 2;
        int numberImpairs = 3;
        int numberMultipleOfFive = 5;

        printNumbers(num, numberPairs);
    }

    public static int[] generateRandom(int amountOfNumbers) {
        int[] numbers = new int[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;

    }

    public static void printNumbers(int[] numbers, int num) {
        for (int number : numbers) {
            if (number % num == 0) {
                System.out.println("Multiple of " + num + ": " + number);
            }
        }
    }

    public static void printNumbersPair(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }
    public static void printNumbersMultipleOfFive(int[] numbers) {
        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.println("Multiple of 5: " + number);
            }
        }
    }
    public static void printNumbersImpair(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("Odd number: " + number);
            }
        }
    }

    public static void printPrimes(int[] numbers) {
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println("Prime number: " + number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }




}
