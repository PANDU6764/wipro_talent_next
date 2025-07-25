package Lambda_Expressions;

import java.util.*;
import java.util.stream.IntStream;

public class PrimefilterWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();

        
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1); 
        }

        System.out.println("Random Numbers: " + al);

        System.out.println("Prime Numbers:");
        al.forEach(num -> {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        });
    }

    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(n))
                        .allMatch(i -> n % i != 0);
    }
}

