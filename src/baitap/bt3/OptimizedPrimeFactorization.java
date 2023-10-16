package baitap.bt3;

import java.util.ArrayList;
import java.util.List;

public class OptimizedPrimeFactorization implements  Runnable{
    @Override
    public void run() {
        List<Integer> primeNumbers = new ArrayList<>();
        int number = 2;

        while (true) {
            if (isPrime(number)) {
                primeNumbers.add(number);
                System.out.println("Optimized Prime: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
