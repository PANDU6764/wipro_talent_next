package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PrimeSupplier {

    public static void main(String[] args) {

        
        Supplier<List<Integer>> primeSupplier = () -> {
            List<Integer> primes = new ArrayList<>();
            int num = 2;

            while (primes.size() < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }
            return primes;
        };

        
        List<Integer> primeNumbers = primeSupplier.get();

       
        System.out.println("First 10 Prime Numbers:");
        primeNumbers.forEach(System.out::println);
    }

    
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
