package baitap.bt3;

import java.util.ArrayList;
import java.util.List;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        List<Integer> primeNumbers = new ArrayList<>();
        int number = 2;

        while (true) {
            if (isPrime(number)) {
                primeNumbers.add(number);
                System.out.println("Lazy Prime: " + number);
            }
            number++;
        }
    }
    private boolean isPrime(int number) {
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
