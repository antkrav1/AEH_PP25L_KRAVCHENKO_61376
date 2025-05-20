public class mojaPiataAplikacja {
    public static void main(String[] args) {
        int N = 15; // liczba, dla której obliczamy silnię

        // Iteracyjna metoda obliczania silni
        long startIterative = System.nanoTime();
        long silniaIter = factorialIterative(N);
        long endIterative = System.nanoTime();

        System.out.println("Silnia " + N + " (iteracyjnie): " + silniaIter);
        System.out.println("Czas iteracyjnie: " + (endIterative - startIterative) + " ns");

        // Rekurencyjna metoda obliczania silni
        long startRecursive = System.nanoTime();
        long silniaRek = factorialRecursive(N);
        long endRecursive = System.nanoTime();

        System.out.println("Silnia " + N + " (rekurencyjnie): " + silniaRek);
        System.out.println("Czas rekurencyjnie: " + (endRecursive - startRecursive) + " ns");
    }

    // Iteracyjna metoda obliczania silni
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Rekurencyjna metoda obliczania silni
    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}