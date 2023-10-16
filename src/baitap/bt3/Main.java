package baitap.bt3;

public class Main {
    public static void main(String[] args) {
        Runnable lazyPrimeRunnable = new LazyPrimeFactorization();
        Thread lazyPrimeThread = new Thread(lazyPrimeRunnable);

        Runnable optimizedPrimeRunnable = new OptimizedPrimeFactorization();
        Thread optimizedPrimeThread = new Thread(optimizedPrimeRunnable);

        lazyPrimeThread.start();
        optimizedPrimeThread.start();
    }
}
