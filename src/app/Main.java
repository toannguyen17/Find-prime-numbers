package app;

public class Main {
    public static void main(String[] args) {
        new Thread(new LazyPrimeFactorization()).start();
        new Thread(new OptimizedPrimeFactorization()).start();
    }
}
