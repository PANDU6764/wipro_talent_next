package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectSquareFilter {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 7, 9, 10, 16, 18, 20, 25, 30);

        
        List<Integer> perfectSquares = new ArrayList<>();

        
        for (int num : numbers) {
            if (isPerfectSquare(num)) {
                perfectSquares.add(num);
            }
        }

        
        System.out.println("Perfect square numbers:");
        for (int square : perfectSquares) {
            System.out.println(square);
        }
    }

    
    private static boolean isPerfectSquare(int n) {
        if (n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}

