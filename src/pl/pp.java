public class myFifthApp {
    public static void main(String[] args) {
        int n = 10;

        long startIter = System.nanoTime();
        long iterResult = factorialIterative(n);
        long endIter = System.nanoTime();

        long startRec = System.nanoTime();
        long recResult = factorialRecursive(n);
        long endRec = System.nanoTime();

        System.out.println("Iterative Result: " + iterResult);
        System.out.println("Recursive Result: " + recResult);
        System.out.println("Iterative Time: " + (endIter - startIter) + " ns");
        System.out.println("Recursive Time: " + (endRec - startRec) + " ns");
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}
